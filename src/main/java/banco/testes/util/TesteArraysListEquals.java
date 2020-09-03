package banco.testes.util;

import banco.modelao.*;

import java.util.ArrayList;

public class TesteArraysListEquals {

    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        ContaCorrente cc = new ContaCorrente(22,11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22,13);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22,13);
        boolean existe = lista.contains(cc3);
        System.out.println(existe);

        for (Conta conta : lista){
            System.out.println(conta);
        }
    }
}
