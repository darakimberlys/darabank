package banco.modelao;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int agencia, int continha) { //aqui ele torna explicito que ele quer usar o construtor com esses atributos
        super(agencia, continha);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public String toString() {
        return "Conta Poupanca, "  + super.toString();
    }
}
