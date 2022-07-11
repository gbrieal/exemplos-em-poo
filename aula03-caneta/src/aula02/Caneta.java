package aula02;

public class Caneta {

    //Atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    //Métodos
    
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);    
        System.out.println("Está tampada? " + this.tampada);
    }
    public void rabiscar() {
        
        if (tampada == true) {
            System.out.println("Erro! Precisa destampar a caneta!");
    } else {
            System.out.println("Rabiscando...");
        }
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
}
