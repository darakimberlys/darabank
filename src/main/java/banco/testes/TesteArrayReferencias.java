package banco.testes;
import banco.modelao.*;

public class TesteArrayReferencias {
    public static void main(String[] args) {
        ContaCorrente[] contas = new ContaCorrente[5];

        ContaCorrente cc1 = new ContaCorrente(22,11);

        contas[0] = cc1;
    }
}
