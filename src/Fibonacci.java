import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para verificar se ele faz parte da sequência de fibonacci: ");
        int number = sc.nextInt();

        boolean fibonacci = false;

        int fnumber = 0;
        int snumber = 1;
        int tnumber = snumber + fnumber;

        if (number == 0 || number == 1){
            fibonacci = true;
        }

        while ( tnumber <= number) {
            if (tnumber == number) {
                fibonacci = true;
            }
            fnumber = snumber;
            snumber = tnumber;
            tnumber = snumber + fnumber;
        }
        if (fibonacci) {
            System.out.println("Número " + number + " faz parte da sequência de Fibonacci");
        }
        else{
            System.out.println("Número " + number + " não faz parte da sequência de Fibonacci");
        }
    }
}
