import java.util.Random;

public class MinMaxNumeriai {
    public static void main(String[] args) {
        int[] skaiciai = new int[100]; // Masyvo ilgis 100
        Random random = new Random();

        for (int i = 0; i < skaiciai.length; i++) {
            skaiciai[i] = random.nextInt(1000); // Sugeneruoja atsitiktinį skaičių nuo 0 iki 999
        }

        int maziausias = skaiciai[0];
        int didziausias = skaiciai[0];

        for (int i = 1; i < skaiciai.length; i++) {
            if (skaiciai[i] < maziausias) {
                maziausias = skaiciai[i];
            }
            if (skaiciai[i] > didziausias) {
                didziausias = skaiciai[i];
            }
        }

        System.out.println("Maziausias skaicius: " + maziausias);
        System.out.println("Didziausias skaicius: " + didziausias);
    }
}
