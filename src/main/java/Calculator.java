public class Calculator {

    public static String cognome(String cognome) {

        int j = 0;
        String cf = "";

        for(int i = 0; i < cognome.length(); i++) {
            if(j == 3) {
                return cf;
            }
            if(cognome.charAt(i) != 'a' && cognome.charAt(i) != 'e' && cognome.charAt(i) != 'i' && cognome.charAt(i) != 'o' && cognome.charAt(i) != 'u') {
                cf += cognome.charAt(i);
                j++;
            }
        }

        for(int i = 0; i < cognome.length(); i++) {
            if(j == 3) {
                return cf;
            }

            if(cognome.charAt(i) == 'a' || cognome.charAt(i) == 'e' || cognome.charAt(i) == 'i' || cognome.charAt(i) == 'o' || cognome.charAt(i) == 'u') {
                cf += cognome.charAt(i);
                j++;
            }
        }

        while(j < 3) {
            cf += "x";
            j++;
        }
        return cf;
    }

    /*public static String nome() {

    }

    public static String annoNascita() {

    }

    public static String meseNascita() {

    }

    public static String giornoNascitaandSesso() {

    }

    public static String luogoNascita() {

    }

    public static String carattereControllo() {

    }*/
}
