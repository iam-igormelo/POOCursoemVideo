public class Lutador {

    // ATRIBUTOS
    private String nome, nacionalidade, categoria;
    private int idade;
    private double altura, peso;
    private int vitorias, derrotas, empates;


    // CONSTRUTOR
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }


    // METODOS
    public void apresentar() {
        System.out.println("--------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.nome);
        System.out.println("Diretamente do(a) " + this.nacionalidade);
        System.out.println("com " + this.idade + " anos e " + this.altura + "m");
        System.out.println("pesando: " + this.peso + "Kg");
        System.out.println(this.vitorias + " vitorias");
        System.out.println(this.derrotas + " derrotas e");
        System.out.println(this.empates + " empates!");
    }

    public void status() {
        System.out.println(this.nome + " e um peso " + this.categoria);
        System.out.println("Ganhou " + this.vitorias + " vezes");
        System.out.println("Perdeu " + this.derrotas + " vezes");
        System.out.println("Empatou " + this.empates + " vezes");
    }

    public void ganharLuta() {
        this.vitorias += 1;
    }

    public void perderLuta() {
        this.derrotas += 1;
    }

    public void empatarLuta() {
        this.empates += 1;
    }


    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2 || this.peso > 120.2) {
            this.categoria = "Invalido";
        } else if(this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if(this.peso <= 83.9) {
            this.categoria = "Medio";
        } else {
            this.categoria = "Pesado";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}