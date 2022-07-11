package aula02;

public class Caneta {

    //Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    //Métodos
    
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);    
        System.out.println("Está tampada? " + this.tampada);
    }
    void rabiscar() {
        
        if (tampada == true) {
            System.out.println("Erro! Precisa destampar a caneta!");
    } else {
            System.out.println("Rabiscando...");
        }
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
}
