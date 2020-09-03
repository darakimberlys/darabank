package banco.modelao;


/**
 * @author Dara Kimberly
 *
 */

public abstract class Conta {

    private static int total = 0;
    protected double saldo;
    private int agencia;
    private int continha;
    private Cliente titular;



    public Conta(int agencia, int continha) {
        Conta.total++;
        //System.out.println("O total de contas : " + Conta.total);
        this.agencia = agencia;
        this.continha = continha;
        //this.saldo = 100;
        //System.out.println("Estou criando uma conta " + this.continha);
    }

    public abstract void deposita(double valor);

    /**
     *
     *
     *@param valor
     *@throws SaldoInsufienteException
     */

    public void saca(double valor) throws SaldoInsufienteException {
        if (this.saldo < valor) {
            throw new SaldoInsufienteException("Saldo: " + this.saldo + ", valor: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsufienteException {
        this.saca(valor);
        destino.deposita(valor);
        //this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getContinha() {
        return this.continha;
    }

    public void setContinha(int continha) {
        if (continha <= 0) {
            System.out.println("No pode valor menor ou igual a zero.");
        }
        this.continha = continha;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
        if (agencia <= 0) {
            System.out.println("No pode valor igual a zero");
            return;
        }
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    @Override
    public boolean equals(Object ref) {
        Conta outra = (Conta) ref;
        if (this.agencia != outra.agencia){
            return false;
        } if (this.continha != outra.continha){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  "agencia: " + agencia +
                ", conta: " + continha;
    }
}