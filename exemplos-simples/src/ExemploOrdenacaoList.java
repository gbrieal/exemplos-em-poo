
import java.util.ArrayList;
import java.util.List;

public class ExemploOrdenacaoList {

    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>() {
            {
                new Gato("Jon", 18, "preto");
                new Gato("Simba", 6, "tigrado");
                new Gato("Jon", 12, "amarelo");

            }
        };

        System.out.println(meusGatos);

        System.out.println("Ordem de Inserção");
        System.out.println(meusGatos);

    }
}

class Gato {

    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" + "nome=" + nome + ", idade=" + idade + ", cor=" + cor + '}';
    }

}
