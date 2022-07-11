package aula02;

public class Aula02 {

    public static void main(String[] args) { //no método main não consigo manipular os PRIVADOS
        
        Caneta c1 = new Caneta(); //Criou objeto c1 (instanciar)
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = false;
        c1.tampar();
        c1.status();
        //c1.rabiscar();
        
        
    }
    
}
