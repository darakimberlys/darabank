package banco.testes;

public class TesteString {
    public static void main(String[] args) {

        int a = 3;
        String nome = "Alura"; //nome> referencia isso é um object literal

        String outra = nome.replace("A", "a");
        System.out.println(outra);

        char c = nome.charAt(2);
        System.out.println(c);

        int posicao = nome.indexOf("ur");
        System.out.println(posicao);

        String sub = nome.substring(1);
        System.out.println(sub);

        String vazio = "";
        System.out.println(vazio.isEmpty());

        String nomea = "ALURA";
        CharSequence cs = new StringBuilder("al");
        nomea = nomea.replace("AL", cs);
        System.out.println(nomea);
    }
}
