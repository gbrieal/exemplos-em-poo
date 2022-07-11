package excontabanco;

public class ExContaBanco {

    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.abrirConta("CC", "Gabriel");
        c1.setNumConta(1111);
        c1.sacar(50);
        c1.fecharConta();   
        c1.statusAtual();
    }
    
}
