package bancoconta;

public class BancoConta {

    public static void main(String[] args) {
    ContaBanco c1 = new ContaBanco();
    c1.setNumConta(1000);
    c1.setDono("Jubileu");
    c1.abrirConta("CC");
    c1.depositar(100);
    //c1.fecharConta();
    
    ContaBanco c2 = new ContaBanco();
    c2.setNumConta(2000);
    c2.setDono("Creusa");
    c2.abrirConta("CP");
    c2.depositar(500);
    c2.sacar(1000);
    
    c1.estadoAtual();
    c2.estadoAtual();
    }
    
}
