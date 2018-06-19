# Exercício 1 
## O que são variáveis, e quais os seus tipos?
Variaveis são objetos que apontam para um endereço de memória, seus principais tipos são, Integer, Boolean, Double, String.



# Exercício 2 
## Explique com suas palavras, o que é Syntax (ou Sintaxe).
 Sintaxe é a gramatica de uma liguagem de programação,cada linguagem tem sua regra, é a forma como escrevemos os codigos para que IDE ou o Compilador e até mesmo outros programadores possa entender.

# Exercício 3 
## Escreva uma função que receba um número, via Scanner, e imprima se o número é par ou impar.

```java
import java.util.Scanner;

public class Exercicio_3 {

    public static void verificaPar(){
        int numero = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é par ");
        numero = ler.nextInt();

        if((numero  % 2) == 0)
            System.out.println("par");
        else
            System.out.println("impar");
    }

    public static void main(String args[]) {
        verificaPar();

    }
}
```

# Exercício 4
## Escreva uma função que receba um parâmetro e informe se o mesmo é ou não um número inteiro.

```java
import java.util.Scanner;

public class Exercicio_4 {

    public static void verificaInteiro(){
        int numero = 0;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é inteiro");
        numero = ler.nextInt();

        if((numero % 1) == 0)
            System.out.println("É inteiro");
        else
            System.out.println("Não é inteiro");
    }
    public static void main(String args[]) {
        verificaInteiro();
    }
}

```
# Exercício 5
## Escreva uma função para ler um valor, via Scanner, e alertar se é positivo ou negativo. Considere o valor zero como positivo.

```java
import java.util.Scanner;

public class Exercicio_5 {

    public static void verificaPositivo(){
        int numero = 0;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é positivo ou negativo");
        numero = ler.nextInt();

        if(numero >= 0)
            System.out.println("Positivo");
        else
            System.out.println("Negativo");

    }

    public static void main(String args[]) {
        verificaPositivo();

    }
}
```
# Exercício 6
## Escreva uma função que leia o código de origem de um produto, via Scanner, e imprima na tela a região de sua procedência conforme a tabela abaixo.

```java
import java.util.Scanner;

public class Exercicio_6 {

    public static String verificaCodigo(){
        int numero = 0;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o número do código de origem do produto");
        numero = ler.nextInt();

        switch (numero) {
            case 1: return "Sul";
            case 2: return "Norte";
            case 3: return "Leste";
            case 4: return "Oeste";
            case 5: case 6: return "Nordeste";
            case 7: case 8: case 9: return "Sudeste";
            case 10: return "Centro-Oeste";
            case 11: return "Noroeste";
            default: return "Importado";
        }
    }
    public static void main(String args[]) {

        System.out.println(verificaCodigo());
    }
}


```
# Exercício Hardcore 3
```java
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

```

