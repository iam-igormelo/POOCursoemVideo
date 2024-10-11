public class Luta {
    
    // ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    // METODOS
    public void marcarLuta(Lutador desafiante, Lutador desafiado) {
        if(desafiante.getCategoria() == desafiado.getCategoria() && desafiante != desafiado) {
            this.aprovada = true;
            this.desafiante = desafiante;
            this.desafiado = desafiado;
            System.out.println("A luta esta marcada!\n");
        } else {
            this.aprovada = false;
            System.out.println("A luta nao pode ser marcada para o mesmo lutador ou lutadores de categoria diferente");
        }
    }

    public void lutar() {
        if(this.aprovada) {
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();

            int vencedor = (int)(Math.random() * 3);
            System.out.println("==== RESULTADO DA LUTA ====");
            switch(vencedor) {
                case 0:
                    System.out.println("A luta terminou em empate!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitoria do " + this.desafiante.getNome() + "!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitoria do " + this.desafiado.getNome() + "!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
            }
            System.out.println("===========================\n");
        } else {
            System.out.println("A luta nao pode acontecer!");
        }
    }


    // GETTERS AND SETTERS
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
