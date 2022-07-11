
import java.util.Scanner;

public class NomeEIdade {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome;
        int idade;

        while (true) {
            System.out.println("Digite o nome: ");
            nome = leia.next();

            if (nome.equals("0")) {
                System.out.println("Para!");
                break;
            }

            System.out.println("Idade");
            idade = leia.nextInt();
            
            System.out.println("Continuando...");
        }
        
    }
}
