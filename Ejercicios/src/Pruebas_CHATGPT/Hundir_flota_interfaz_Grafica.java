package Pruebas_CHATGPT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class Hundir_flota_interfaz_Grafica extends JFrame {

    private static final int FILAS = 8;
    private static final int COLUMNAS = 8;
    private static final int MAX_DISPAROS = 7;

    private JPanel panelTablero;
    private JLabel labelDisparos;
    private JButton[][] botonesJugador = new JButton[FILAS][COLUMNAS];
    private String[][] tableroEnemigo = new String[FILAS][COLUMNAS];
    private ArrayList<Barco> barcosEnemigos = new ArrayList<>();
    private Random random = new Random();
    private int disparosRestantes = MAX_DISPAROS;

    public Hundir_flota_interfaz_Grafica() {
        inicializarTablero();
        colocarBarcosEnemigo();
        crearVentana();
    }

    private void inicializarTablero() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tableroEnemigo[i][j] = "A"; // agua
            }
        }
    }

    private void crearVentana() {
        this.setTitle("Hundir la Flota");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 650);
        this.setLayout(new BorderLayout());

        // Label disparos restantes
        labelDisparos = new JLabel("Disparos restantes: " + disparosRestantes, SwingConstants.CENTER);
        labelDisparos.setFont(new Font("Arial", Font.BOLD, 16));
        this.add(labelDisparos, BorderLayout.NORTH);

        panelTablero = new JPanel();
        panelTablero.setLayout(new GridLayout(FILAS, COLUMNAS));

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                JButton boton = new JButton();
                boton.setOpaque(true);
                boton.setBorderPainted(true);
                boton.setBackground(Color.CYAN);

                int fila = i;
                int col = j;

                boton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        disparar(fila, col, boton);
                    }
                });

                botonesJugador[i][j] = boton;
                panelTablero.add(boton);
            }
        }

        this.add(panelTablero, BorderLayout.CENTER);
        this.setVisible(true);
    }

    private void disparar(int fila, int col, JButton boton) {
        if (disparosRestantes <= 0) {
            JOptionPane.showMessageDialog(this, "No te quedan disparos!");
            return;
        }

        if (tableroEnemigo[fila][col].equals("B")) {
            tableroEnemigo[fila][col] = "X"; // tocado
            boton.setBackground(Color.YELLOW);
            disparosRestantes--;
            labelDisparos.setText("Disparos restantes: " + disparosRestantes);
            JOptionPane.showMessageDialog(this, "¡Impacto!");

            // Comprobar si el barco se hundió
            for (Barco barco : barcosEnemigos) {
                if (barco.contiene(fila, col) && barco.hundido(tableroEnemigo)) {
                    // Pintar todas las casillas del barco en rojo
                    for (int[] c : barco.getCasillas()) {
                        botonesJugador[c[0]][c[1]].setBackground(Color.RED);
                    }
                    JOptionPane.showMessageDialog(this, "¡Hundiste un barco de tamaño " + barco.tamaño + "!");
                }
            }

        } else if (tableroEnemigo[fila][col].equals("A")) {
            tableroEnemigo[fila][col] = "O"; // disparo al agua
            boton.setBackground(Color.LIGHT_GRAY);
            disparosRestantes--;
            labelDisparos.setText("Disparos restantes: " + disparosRestantes);
        } else {
            JOptionPane.showMessageDialog(this, "Ya has disparado aquí");
        }

        if (todosHundidos()) {
            JOptionPane.showMessageDialog(this, "¡Has hundido todos los barcos! ¡Ganaste!");
        } else if (disparosRestantes == 0) {
            JOptionPane.showMessageDialog(this, "¡Se acabaron los disparos! Fin del juego.");
        }
    }

    private boolean todosHundidos() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (tableroEnemigo[i][j].equals("B")) return false;
            }
        }
        return true;
    }

    private void colocarBarcosEnemigo() {
        // Barcos de tamaño 5, 3, 3, 1, 1
        colocarBarcoAleatorio(5);
        colocarBarcoAleatorio(3);
        colocarBarcoAleatorio(3);
        colocarBarcoAleatorio(1);
        colocarBarcoAleatorio(1);
    }

    private void colocarBarcoAleatorio(int tamaño) {
        boolean colocado = false;
        while (!colocado) {
            int fila = random.nextInt(FILAS);
            int col = random.nextInt(COLUMNAS);
            boolean horizontal = random.nextBoolean();

            if (puedeColocarBarco(fila, col, tamaño, horizontal)) {
                Barco barco = new Barco(fila, col, tamaño, horizontal);
                for (int[] c : barco.getCasillas()) {
                    tableroEnemigo[c[0]][c[1]] = "B";
                }
                barcosEnemigos.add(barco);
                colocado = true;
            }
        }
    }

    private boolean puedeColocarBarco(int fila, int col, int tamaño, boolean horizontal) {
        for (int i = 0; i < tamaño; i++) {
            int f = fila + (horizontal ? 0 : i);
            int c = col + (horizontal ? i : 0);
            if (f >= FILAS || c >= COLUMNAS) return false;
            if (tableroEnemigo[f][c].equals("B")) return false;
        }
        return true;
    }

    private class Barco {
        int fila, col, tamaño;
        boolean horizontal;

        public Barco(int fila, int col, int tamaño, boolean horizontal) {
            this.fila = fila;
            this.col = col;
            this.tamaño = tamaño;
            this.horizontal = horizontal;
        }

        public boolean contiene(int f, int c) {
            for (int[] casilla : getCasillas()) {
                if (casilla[0] == f && casilla[1] == c) return true;
            }
            return false;
        }

        public boolean hundido(String[][] tablero) {
            for (int[] casilla : getCasillas()) {
                if (!tablero[casilla[0]][casilla[1]].equals("X")) return false;
            }
            return true;
        }

        public int[][] getCasillas() {
            int[][] casillas = new int[tamaño][2];
            for (int i = 0; i < tamaño; i++) {
                int f = fila + (horizontal ? 0 : i);
                int c = col + (horizontal ? i : 0);
                casillas[i][0] = f;
                casillas[i][1] = c;
            }
            return casillas;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Hundir_flota_interfaz_Grafica());
    }
}
