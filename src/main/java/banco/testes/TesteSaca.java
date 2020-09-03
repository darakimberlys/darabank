package banco.testes;

import banco.modelao.*;

public class TesteSaca {
    public static void main(String[] args) {
        Conta acc = new ContaCorrente(1213, 321);
        acc.deposita(200.0);


        System.out.println(acc.getSaldo());
    }
}
