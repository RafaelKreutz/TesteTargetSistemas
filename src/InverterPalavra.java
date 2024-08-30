import java.util.Scanner;

public class InverterPalavra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a palavra para inverter: ");
        String palavra = sc.nextLine();

        StringBuilder builder = new StringBuilder();
        for (int i = palavra.length() - 1; i >= 0; i--) {
            builder.append(palavra.charAt(i));
        }
        String palavrainvertida = builder.toString();
        System.out.println("Inverso da Palavra: " + palavrainvertida);
    }
}
