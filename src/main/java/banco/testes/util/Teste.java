package banco.testes.util;

import banco.modelao.*;
import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        ContaCorrente cc = new ContaCorrente(22,11);
        //Cliente cliente = new Cliente();
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22,13);
        lista.add(cc2);



        System.out.println(lista.size());
        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getContinha());

        lista.remove(0);
        System.out.println(lista.size());

        ContaCorrente cc3 = new ContaCorrente(22,21);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(33,55);
        lista.add(cc4);

        for(int i=0; i<lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }
        System.out.println("----------------------------------------");
        for(Conta conta : lista){
            System.out.println(conta);
        }

    }
}
