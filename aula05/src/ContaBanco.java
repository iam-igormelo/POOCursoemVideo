public class ContaBanco {
    public int numConta;
    protected String tipo; // CC ou CP
    private String dono;
    private float saldo;
    private boolean status;


    // CONSTRUCTOR
    public ContaBanco() {
        this.status = false;
        this.saldo = 0f;
    }


    // METODOS
    public void estadoAtual() {
        System.out.println("------------------------");
        System.out.println("Conta: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("Status: " + this.status);
        System.out.println("------------------------");
    }

    public void abrirConta(String tipo) {
        if(tipo == "CC" || tipo == "cc") {
            this.tipo = tipo;
            this.status = true;
            this.saldo += 50f;
            System.out.println("Sua conta corrente foi aberta com sucesso!");
        } else if (tipo == "CP" || tipo == "cp") {
            this.tipo = tipo;
            this.status = true;
            this.saldo += 150f;
            System.out.println("Sua conta poupanca foi aberta com sucesso!");
        } else {
            System.out.println("Tipo de conta invalida!");
        }
    }

    public void fecharConta() {
        if(this.saldo == 0) {
            this.status = false;
            System.out.println("Conta encerrada com sucesso!");
        } else if(this.saldo > 0){
            System.out.println("Voce nao pode encerrar a conta pois ela possui saldo");
        } else {
            System.out.println("Voce nao pode encerrar a conta pois ela possui debito");
        }
        
    }

    public void depositar(float valor) {
        if(this.status) {
            this.saldo += valor;
            System.out.println("Deposito relizado com sucesso!");
        } else {
            System.out.println("A conta esta fechada, nao e possivel realizar o deposito! ");
        }
    }

    public void sacar(float valor) {
        if(this.status && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else if(this.status == false){
            System.out.println("Nao foi possivel realizar o saque pois a conta esta fechada");
        } else {
            System.out.println("Nao foi possivel realizar o saque pois a conta nao possui saldo suficiente");
        }
    }

    public void pagarMensal() {
        if(this.saldo >= 12f && (this.tipo == "CC" || this.tipo == "cc")) {
            this.saldo -= 12f;
            System.out.println("Taxa mensal debitada com sucesso!");
        } else if(this.saldo >= 20f && (this.tipo == "CP" || this.tipo == "cp")) {
            this.saldo -= 20f;
            System.out.println("Taxa mensal debitada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }


    // GETTERS AND SETTERS
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
