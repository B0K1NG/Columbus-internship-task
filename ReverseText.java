import java.util.Scanner;

public class ReverseText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Iveskite teksta: ");
        String tekstas = scanner.nextLine();
        
        String atbulas = reverseText(tekstas);
        System.out.println("Atbulas: " + atbulas);
        
        scanner.close(); // Uždarome scanner objektą
    }

    public static String reverseText(String tekstas) {
        StringBuilder sb = new StringBuilder(tekstas);
        return sb.reverse().toString();
    }
}
