package aula07;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

//MÉTODOS PÚBLICOS    
    public void apresentar(){
        System.out.println("______________________________________________________________");
        System.out.println("Chegou a hora! Vamos apresentar o lutador "+this.getNome());
        System.out.println("Diretamente de "+this.getNacionalidade());
        System.out.println("Com "+this.getIdade()+" anos");
        System.out.println("Altura de "+this.getAltura());
        System.out.println("Pesando "+this.getPeso()+" quilos.");
        System.out.println("Com "+this.getVitorias()+" vitória(s)");
        System.out.println(this.getVitorias()+" derrota(s)");
        System.out.println("E "+this.getEmpates()+" empate(s)");
        System.out.println("Da categoria "+this.getCategoria());
    }
    
    public void status(){
        System.out.println("LUTADOR___________________________________");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Nacionalidade: "+this.getNacionalidade());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Altura: "+this.getAltura());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Categoria: "+this.getCategoria());
        System.out.println("Vitórias: "+this.getVitorias());
        System.out.println("Derrotas: "+this.getVitorias());
        System.out.println("Empates: "+this.getEmpates());
    }
    
    public void ganharLuta(){
            this.setVitorias(this.getVitorias()+1);
        System.out.println("Vitória nesta luta!");
    }
    
    public void perderLuta(){
            this.setVitorias(this.getVitorias()+1);
        System.out.println("Derrota nesta luta!");
    }
    
    public void empatarLuta(){
            this.setEmpates(this.getEmpates()+1);
        System.out.println("Empate nesta luta!");
    }

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    
    }
    
    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private void setCategoria() {
        if (this.getPeso()<52.2) {
            this.categoria="Inválido";
        } else if (this.getPeso()<=70.3){
        this.categoria="Leve";
    } else if (this.getPeso()<=83.9) {
            this.categoria="Médio";
        } else if (this.getPeso()<=120.2) {
            this.categoria="Pesado";
        } else {
            this.categoria="Inválido";
        }
        this.categoria = categoria;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
