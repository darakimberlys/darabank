package banco.testes;

import banco.modelao.*;

public class TesteContas {
    public static void main(String[] args) {


        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(22,222);
        cp.deposita(200.0);



        System.out.println("Saldo da conta Corrente " + cc.getSaldo());
        System.out.println("Saldo da conta poupança " + cp.getSaldo());
    }
}
