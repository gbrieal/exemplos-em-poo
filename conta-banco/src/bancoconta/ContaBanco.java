package bancoconta;

public class ContaBanco {
public int numConta;
protected String tipo;
private String dono;
private float saldo;
private boolean status;

public void estadoAtual (){
    System.out.println("______________________________________");
    System.out.println("Número da conta: "+this.getNumConta());
    System.out.println("Proprietário(a): "+this.getDono());
    if (this.getStatus()==true) {
    System.out.println("Conta tipo: "+this.getTipo());   
    } else {
        System.out.println("Conta inexistente");
    }
    System.out.println("Saldo atual: R$ "+this.getSaldo());
    if (this.getStatus()==true) {
        System.out.println("Status: Ativa");
    } else {
        System.out.println("Status: Inativa");
    }
    }

public void abrirConta(String t){
    this.setTipo(t);
    this.setStatus(true);
    if("CC".equals(t)){
            this.setSaldo(50);
        } if(t=="CP"){
            this.setSaldo(150);
        } 
        System.out.println("Conta aberta com sucesso!");
    }

public void fecharConta(){
    if(this.getSaldo()>0){
        System.out.println("Há saldo na conta, favor efetuar saque total!");
    } if(this.getSaldo()<0){
        System.out.println("Há pendencias na conta, favor realizar o pagamento!");
    } else {
        this.setStatus(false);
    }
    System.out.println("Conta fechada com sucesso!");
}

public void sacar(float v){
    if (this.getStatus()) {  
    if(this.getSaldo()>=v){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Saque realizado na conta de "+this.getDono());
        } else if(this.getSaldo()<v || this.getSaldo()<0){
            System.out.println("Impossível realizar saque neste valor, saldo insuficiente!");
        } else {
            System.out.println("Não é possível realizar esta operação, conta inexistente!");
        }
    }
}

public void depositar(float v){
    if(this.getStatus()){
        this.setSaldo(this.getSaldo()+v);
        System.out.println("Depósito realizado na conta de "+this.getDono());
    } else {
        System.out.println("Não é possível realizar esta operação, conta inexistente!");
    }
}

public void pagarMensal(){
    float m=0;
    if(this.getTipo()=="CC"){
            m=12;
        } if(this.getTipo()=="CP"){
            m=20;
        } if(this.getSaldo()>0){
            setSaldo(this.getSaldo()-m);
            System.out.println("Mensalidade paga da conta de "+this.getDono());
        } else {
            System.out.println("Impossível realizar esta operação, saldo insuficiente, favor realizar depósito!");
        }
    }

    public ContaBanco() {
        this.saldo=0;
        this.status=false;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

}
