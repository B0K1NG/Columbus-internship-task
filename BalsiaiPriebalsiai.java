public class BalsiaiPriebalsiai {
    public static void main(String[] args) {
        String tekstas = "Programuotojo ar tiesiog bet kokio IT specialisto profesija taps vis labiau įprasta.";
        tekstas = tekstas.toLowerCase();

        int balsiuSkaicius = 0;
        int priebalsiuSkaicius = 0;

        for (int i = 0; i < tekstas.length(); i++) {
            char simbolis = tekstas.charAt(i);
            if (Character.isLetter(simbolis)) {
                if (simbolis == 'a' || simbolis == 'e' || simbolis == 'i' || simbolis == 'o' || simbolis == 'u') {
                    balsiuSkaicius++;
                } else {
                    priebalsiuSkaicius++;
                }
            }
        }

        System.out.println("Balsiu skaicius: " + balsiuSkaicius);
        System.out.println("Priebalsiu skaicius: " + priebalsiuSkaicius);
    }
}
