package banco.testes;
import banco.modelao.*;

public class Teste {
    public static void main(String[] args) {
        System.out.println("x");

        ContaCorrente cc = new ContaCorrente(22, 33);
        ContaPoupanca cp= new ContaPoupanca(33, 22);

        System.out.println(cc);
        System.out.println(cp);

        println(cc);

    }

    static void println() {

    }

    static void println(int a) {

    }

    static void println(boolean valor) {

    }
    static void println(ContaCorrente conta) {

    }
}
