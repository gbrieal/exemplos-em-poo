package aula04;

public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void tampar() {
        this.tampada = true;
    } 
    public void destampar(){
        this.tampada = false;
    }
    public void status() {
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ponta: "+this.getPonta());
        System.out.println("Cor: "+this.cor);
        System.out.println("Tampada: "+this.tampada);
    }
    public Caneta(String m, String c, float p) { //Método Construtor tem o mesmo nome da Classe
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }
}
