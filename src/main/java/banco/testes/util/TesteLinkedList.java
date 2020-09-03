package banco.testes.util;

import banco.modelao.*;
import java.util.LinkedList;
import java.util.List;

public class TesteLinkedList {

    public static void main(String[] args) {
        List<Conta> lista = new LinkedList<Conta>();

        ContaCorrente cc = new ContaCorrente(22,11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22,13);
        lista.add(cc2);

        for (Conta conta : lista){
            System.out.println(conta);
        }
    }
}
