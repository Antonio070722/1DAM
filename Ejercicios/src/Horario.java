public class Horario {
    public class HorarioColor {
        // Colores ANSI
        public static final String RESET = "\u001B[0m";
        public static final String VERDE = "\u001B[32m";
        public static final String ROJO = "\u001B[31m";
        public static final String AZUL = "\u001B[34m";
        public static final String AMARILLO = "\u001B[33m";
        public static final String PURPURA = "\u001B[35m";
        public static final String GRIS = "\u001B[37m";
    }

    public static void main(String[] args) {
        System.out.println("\033[33mLunes      Martes     Miércoles  Jueves     Viernes");
        System.out.println("=======    =======    =======    =======    =======");
        System.out.println("\033[32mSASP       BADAT      PROGR      PROGR       \033[91mSIINF");
        System.out.println("\033[32mIPE I      DASPGS     PROGR      PROG        \033[91mSIINF");
        System.out.println("\033[94mENDES      \033[31mIPE I      SIINF      \033[97mPROGR       \033[35mPROGR");
        System.out.println("\033[33mENDES      \033[31mIPE I      SIINF      \033[97mLMSGI       \033[35mPROGR");
        System.out.println("\033[33mINGLES     \033[35mBADAT      \033[94mBADAT      \033[35mBADAT       \033[94mENDES");
        System.out.println("\033[33mINGLES     \033[35mBADAT      \033[94mBADAT      \033[35mBADAT       \033[94mBADAT");
    }
}

