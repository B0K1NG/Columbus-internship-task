import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class DuplikuotiNumeriai {
    public static void main(String[] args) {
        int[] skaiciai = new int[100]; // Masyvo ilgis 100
        Random random = new Random();

        for (int i = 0; i < skaiciai.length; i++) {
            skaiciai[i] = random.nextInt(1000); // Sugeneruoja atsitiktinį skaičių nuo 0 iki 999
        }

        Set<Integer> besidubliuojantys = new HashSet<>();
        Set<Integer> pasikartojantys = new HashSet<>();

        for (int skaicius : skaiciai) {
            if (!besidubliuojantys.add(skaicius)) {
                pasikartojantys.add(skaicius);
            }
        }

        System.out.println("Besidubliuojantys skaiciai: " + pasikartojantys);
    }
}
