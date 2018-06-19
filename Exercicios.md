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

```

