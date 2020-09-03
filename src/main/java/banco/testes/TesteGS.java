package banco.testes;
import banco.modelao.*;
public class TesteGS {
    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22,11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22,13);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(1);
        System.out.println(ref.getContinha());
    }
}
