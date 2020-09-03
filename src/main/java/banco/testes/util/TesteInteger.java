package banco.testes.util;

import java.util.ArrayList;
import java.util.List;

public class TesteInteger {
    public static void main(String[] args) {
        int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 29; //Integer
        Integer idadeRef = Integer.valueOf(29);
        int valor = idadeRef.intValue();


        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); //Autoboxing



    }
}
