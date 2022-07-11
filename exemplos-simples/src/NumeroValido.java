
import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
 */
public class NumeroValido {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um valor entre 0 e 10: ");
        int numero = leia.nextInt();

        while (numero < 0 | numero > 10) {
            System.out.println("Valor inválido! Digite um valor entre 0 e 10: ");
            numero = leia.nextInt();
        }
    }

}
