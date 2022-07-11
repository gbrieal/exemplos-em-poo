package excontabanco;

public class ContaBanco {

    private int numConta;
    protected String tipo;
    public String dono;
    private float saldo;
    public boolean status;
    
    public void statusAtual(){
        System.out.println("_________________________________________");
        System.out.println("Número da conta: "+this.getNumConta());
        if (this.getStatus()==true) {
        System.out.println("Status da conta: aberta");
        } else {
            System.out.println("Status da conta: fechada/inexistente");
        }
        System.out.println("Dono(a) da conta: "+this.getDono());
        System.out.println("Tipo da Conta: "+this.getTipo());
        System.out.println("Saldo atual: "+this.getSaldo());
    }
    
    public void abrirConta(String t, String dono){
        this.setTipo(t);
        this.setDono(dono);
        this.setStatus(true);
        if (this.getTipo()=="CC") {
                this.setSaldo(50);
                System.out.println("Conta de "+this.getDono()+" criada com sucesso!");
            } else if (this.getTipo()=="CP") {
                this.setSaldo(150);
                System.out.println("Conta de "+this.getDono()+" criada com sucesso!");
        } 
    }
    
    public void fecharConta(){
        if (this.getSaldo()>0) {
            System.out.println("Não é possível fechar esta conta com dinheiro em conta, favor efetuar saque total!");
        } else if (this.getSaldo()<0) {
            System.out.println("Há pendências nesta conta, favor efetuar realizar o pagamento!");
        } else {
            this.setStatus(false);
            System.out.println("Conta de "+this.getDono()+" fechada com sucesso!");
        }
    }
    
    public void depositar (float d){
        this.setSaldo(this.getSaldo()+d);
        System.out.println("Depósito realizado com sucesso na conta de "+this.getDono());
    }
    
    public void sacar (float s){
        if (s>this.getSaldo()) {
            System.out.println("Não é possível realizar esta operação, saldo indisponível!");
        } else {
            this.setSaldo(this.getSaldo()-s);
            System.out.println("Saque realizado com sucesso na conta de "+this.getDono());
        }
    }
    
    public void pagarMensal(){
        float m=0;
        if (this.getTipo()=="CC") {
            m=12;
        } if (this.getTipo()=="CP") {
            m=20;
        } 
        this.setSaldo(this.getSaldo()-m);
    }
    
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
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
    
        
    
}
