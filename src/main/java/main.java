import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.print("introduce un numero: ");
        Scanner lectura = new Scanner(System.in);
        int n = lectura.nextInt();
        String modaba = "y modaba";
        for (int i = 0; i < n; i++) {
            modaba += "a";
            System.out.println(modaba);
        }
    }
}