import java.sql.SQLOutput;
import java.util.Scanner;

public class Array {
    static void main(String[] args) {

        /*
        *Peça ao usuário para informar 5 números inteiros.
        * Armazene esses números em um array.
        * Depois, o programa deve mostrar o maior número armazenado.
        * E por fim, deve mostrar a soma de todos os números.
         */

        int[] numerosInt = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vou te dar o maior número que você digitar entre os 5.");
        System.out.println("Digite o 1ª: ");
        numerosInt[0] = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o 2ª: ");
        numerosInt[1] = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o 3ª: ");
        numerosInt[2] = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o 4ª: ");
        numerosInt[3] = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o 5ª: ");
        numerosInt[4] = scanner.nextInt();
        scanner.nextLine();

        int maior = numerosInt[0];
        int soma = 0;

        for (int i = 0; i < numerosInt.length; i++) {
            soma += numerosInt[i];
            if (numerosInt[i] > maior) {
                maior = numerosInt[i];
            }
        }
        System.out.println("A soma total é: " +soma);
        System.out.println("O numero maior é: "+maior);



        scanner.close();
    }
}
