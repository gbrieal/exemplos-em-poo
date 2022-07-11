package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void abrirConta(String t, boolean s){
        setTipo(t);
        getStatus();
        if(s==true){
        if(t=="CC"){
            this.saldo=50;
        } if(t=="CP"){
            setSaldo(150);
        }
    } else{
            System.out.println("Conta existente!");
        }
    }
    public void fecharConta(){
        if(this.saldo>0){
            System.out.println("Existe saldao na conta, favor efetuar saque total!");
        } if(this.saldo<0){
            System.out.println("Conta em débito, favor efetuar o pagamento!");
        } else {
            setStatus(false);
        }
    }
    public void sacar(float s){
        if(getStatus()==true && getSaldo()>0){
            setSaldo(getSaldo()-s);
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }
    public void depositar(float v){
        if(this.status==true){
            setSaldo(getSaldo()+v);
        } else {
            System.out.println("Impossível fazer depósito!");
        }
    }
    public void pagarMensal(){
        float m=0;
        if(getTipo()=="CC"){
            m=12;
        } if(getTipo()=="CP"){
            m=20;
        }
        if(getStatus()==true){
            if(getSaldo()>0){
        setSaldo(getSaldo()-m);
    } else {
                System.out.println("Sem saldo na conta para realizar este pagamento");
            }
        } else {
            System.out.println("Conta Inexistente!");
        }
    }
    public ContaBanco(){
        this.saldo=0;
        this.status=false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
}
    