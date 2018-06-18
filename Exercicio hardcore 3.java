import java.util.Scanner;

class Main {

    public static void armas(float saldo, int categoria) {
        System.out.println("ARMAS " + "         SALDO: " + saldo + " \n " +
                "1 > AK-47 - 1000" + " \n " +
                "2 > M4-A1 - 900" + " \n " +
                "3 > RPG   - 800" + " \n " +
                "4 > AWP   - 500" + " \n " +
                "5 > AUG   - 600" + " \n "
        );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma arma");
        categoria = 0;
        categoria = scanner.nextInt();
        switch(categoria){
            case 1:  saldo -= 1000; menu(saldo, categoria );
            case 2:  saldo -= 900; menu(saldo, categoria);
            case 3:  saldo -= 800; menu(saldo, categoria);
            case 4:  saldo -= 500; menu(saldo, categoria);
            case 5:  saldo -= 600; menu(saldo, categoria);
        }

    }

    public static void drogas(float saldo, int categoria) {
        System.out.println("DROGAS " + "         SALDO: " + saldo + " \n " +
                "1 > PHP - 1000" + " \n " +
                "2 > JAVA - 900" + " \n " +
                "3 > C++ - 800" + " \n " +
                "4 > DELPHI - 500" + " \n " +
                "5 > JAVASCRIPT - 600" + " \n "
        );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma arma");
        categoria = 0;
        categoria = scanner.nextInt();
        switch(categoria){
            case 1:  saldo -= 1000; menu(saldo, categoria);
            case 2:  saldo -= 900; menu(saldo, categoria);
            case 3:  saldo -= 800; menu(saldo, categoria);
            case 4:  saldo -= 500; menu(saldo, categoria);
            case 5:  saldo -= 600; menu(saldo, categoria);
        }
    }


    public static void veiculos(float saldo, int categoria) {
        System.out.println("VEICULOS " + "         SALDO: " + saldo + " \n " +
                "1 > FERRARI - 1000" + " \n " +
                "2 > LAMBO - 900" + " \n " +
                "3 > AUDI - 800" + " \n " +
                "4 > FIAT - 500" + " \n " +
                "5 > TOYOTA - 600" + " \n "
        );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma arma");
        categoria = 0;
        categoria = scanner.nextInt();
        switch(categoria){
            case 1:  saldo -= 1000; menu(saldo, categoria);
            case 2:  saldo -= 900; menu(saldo, categoria);
            case 3:  saldo -= 800; menu(saldo, categoria);
            case 4:  saldo -= 500; menu(saldo, categoria);
            case 5:  saldo -= 600; menu(saldo, categoria);
        }

    }

    public static void extras(float saldo, int categoria) {
        System.out.println("EXTRAS " + "         SALDO: " + saldo + " \n " +
                "1 > +VIDAS - 1000" + " \n " +
                "2 > MANA - 900" + " \n " +
                "3 > VIDAS - 800" + " \n " +
                "4 > XP - 500" + " \n " +
                "5 > ESTAMINA - 600" + " \n "
        );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma arma");
        categoria = 0;
        categoria = scanner.nextInt();
        switch(categoria){
            case 1:  saldo -= 1000; menu(saldo, categoria);
            case 2:  saldo -= 900; menu(saldo, categoria);
            case 3:  saldo -= 800; menu(saldo, categoria);
            case 4:  saldo -= 500; menu(saldo, categoria);
            case 5:  saldo -= 600; menu(saldo, categoria);
        }

    }

    public static void lixo(float saldo, int categoria) {
        System.out.println("LIXO " + "         SALDO: " + saldo + " \n " +
                "1 > LIXO - 1000" + " \n " +
                "2 > LIXO - 900" + " \n " +
                "3 > LIXO - 800" + " \n " +
                "4 > LIXO - 500" + " \n " +
                "5 > LIXO - 600" + " \n "
        );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma arma");
        categoria = 0;
        categoria = scanner.nextInt();
        switch(categoria){
            case 1:  saldo -= 1000; menu(saldo, categoria);
            case 2:  saldo -= 900; menu(saldo, categoria);
            case 3:  saldo -= 800; menu(saldo, categoria);
            case 4:  saldo -= 500; menu(saldo, categoria);
            case 5:  saldo -= 600; menu(saldo, categoria);
        }

    }

    public static void menu(float saldo, int categoria){

        System.out.println("CATEGORIAS " + "         SALDO: " + saldo + " \n " +
                "1 > ARMAS" + " \n " +
                "2 > DROGAS" + " \n " +
                "3 > VEICULOS" + " \n " +
                "4 > EXTRAS" + " \n " +
                "5 > LIXO" + " \n " +
                "6 > SAIR" + " \n "

        );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione uma Categoria");
        categoria = scanner.nextInt();
        switch(categoria){
            case 1: armas(saldo, categoria);
            case 2: drogas(saldo, categoria);
            case 3: veiculos(saldo, categoria);
            case 4: extras(saldo, categoria);
            case 5: lixo(saldo, categoria);
            case 6: System.exit(0) ;


        }

    }

    public static void main(String[] args) {
        float saldo = 1500.00f;
        int categoria = 0;


        menu(saldo, categoria);
    }




}