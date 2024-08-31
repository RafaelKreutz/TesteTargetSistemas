import java.util.Scanner;
public class PorcentagemFaturamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] lista = new double[5];
        String[] listastring = new String[5];

        PorcentagemFaturamentoObj[] listaobj = new PorcentagemFaturamentoObj[5];

        double total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o faturamento para calcular a porcentagem: ");
            lista[i] = sc.nextDouble();
            sc.nextLine();
            System.out.println("Digite o Estado que teve esse faturamento: EX: RJ, SP, RS, etc...");
            listastring[i] = sc.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            total += lista[i];
        }
        for (int i = 0; i < 5; i++) {
            double porcentagem = (lista[i] / total) * 100;
            PorcentagemFaturamentoObj obj = new PorcentagemFaturamentoObj(porcentagem, lista[i], listastring[i]);
            listaobj[i] = obj;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(listaobj[i].toString());
        }
    }
}
