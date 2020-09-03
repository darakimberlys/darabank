package banco.testes.util;

import banco.modelao.Conta;
import banco.modelao.ContaCorrente;
import banco.modelao.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteOito {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 33);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<Conta>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta : lista) {
            System.out.println(conta);
        }

        lista.sort(new Comparator<Conta>() { //clase anonima

                       @Override
                       public int compare(Conta c1, Conta c2) {
                           return Integer.compare(c1.getContinha(), c2.getContinha());
                       }
                   }
        );
        System.out.println("----------------");

        for (Conta conta : lista) {
            System.out.println(conta);
        }
    }

}
