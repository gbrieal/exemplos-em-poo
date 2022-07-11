package aula02;

public class Aula02 {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta(); // Criou objeto c1 (instanciar)
        
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        
        c2.modelo = "ok";
        c2.cor = "Vermelha";
        c2.destampar();
        c2.status();
        c2.rabiscar();

    }
    
}
