# Exercício 1 
## O que são variáveis, e quais os seus tipos?
Variaveis são objetos que apontam para um endereço de memória, seus principais tipos são, Integer, Boolean, Double, String.



# Exercício 2 
## Explique com suas palavras, o que é Syntax (ou Sintaxe).
 Sintaxe é a gramatica de uma liguagem de programação,cada linguagem tem sua regra, é a forma como escrevemos os codigos para que IDE ou o Compilador e até mesmo outros programadores possa entender.

# Exercício 3 
## Escreva uma função que receba um número, via Scanner, e imprima se o número é par ou impar.

```java
mport java.util.Scanner;

public class Exercicio_3 {

    public static void verificaPar(){
        int x = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é par ");
        x = ler.nextInt();

        if((x  % 2) == 0)
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
        int x = 0;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é inteiro");
        x = ler.nextInt();

        if((x % 1) == 0)
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
        int x = 0;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é positivo ou negativo");
        x = ler.nextInt();

        if(x >= 0)
            System.out.println("Positivo");
        else
            System.out.println("Negativo");

    }

    public static void main(String args[]) {
        verificaPositivo();

    }
}
```

