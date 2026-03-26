import java.time.LocalDate;
import java.util.HashMap;

public class Calculator {

    private static HashMap<Integer, String> mesi = new HashMap<Integer, String>();

    public Calculator() {
        mesi.put(1, "A");
        mesi.put(2, "B");
        mesi.put(3, "C");
        mesi.put(4, "D");
        mesi.put(5, "E");
        mesi.put(6, "H");
        mesi.put(7, "L");
        mesi.put(8, "M");
        mesi.put(9, "P");
        mesi.put(10, "R");
        mesi.put(11, "S");
        mesi.put(12, "T");
    }

    public static String cognome(String cognome) {
        int j = 0;
        String cf = "";

        for(int i = 0; i < cognome.length(); i++) {
            if(j == 3) return cf.toUpperCase();
            if(cognome.charAt(i) != 'A' && cognome.charAt(i) != 'E' && cognome.charAt(i) != 'I' && cognome.charAt(i) != 'O' && cognome.charAt(i) != 'U') {
                cf += cognome.charAt(i);
                j++;
            }
        }

        for(int i = 0; i < cognome.length(); i++) {
            if(j == 3) return cf.toUpperCase();
            if(cognome.charAt(i) == 'A' || cognome.charAt(i) == 'E' || cognome.charAt(i) == 'I' || cognome.charAt(i) == 'O' || cognome.charAt(i) == 'U') {
                cf += cognome.charAt(i);
                j++;
            }
        }

        while(j < 3) {
            cf += "x";
            j++;
        }
        return cf.toUpperCase();
    }

    public static String nome(String nome) {
        int j = 0;
        String cf = "";

        for(int i = 0; i < nome.length(); i++) {
            if(nome.charAt(i) != 'A' && nome.charAt(i) != 'E' && nome.charAt(i) != 'I' && nome.charAt(i) != 'O' && nome.charAt(i) != 'U') {
                cf += nome.charAt(i);
                j++;
            }
        }
        if(j >= 4) return Support.takeFirstFour(cf).toUpperCase();
        if(j == 3) return cf.substring(0, 3).toUpperCase();

        for(int i = 0; i < nome.length(); i++) {
            if(j == 3) return cf.toUpperCase();
            if(nome.charAt(i) == 'A' || nome.charAt(i) == 'E' || nome.charAt(i) == 'I' || nome.charAt(i) == 'O' || nome.charAt(i) == 'U') {
                cf += nome.charAt(i);
                j++;
            }
        }

        while(j < 3) {
            cf += "x";
            j++;
        }
        return cf.toUpperCase();
    }

    public static String dataNascita(LocalDate dataNascita, Sesso sesso) {
        String cf = "";
        Integer annoNascita = Integer.valueOf(dataNascita.getYear());

        cf += annoNascita.toString().substring(2, 4);
        cf += mesi.get(Integer.valueOf(dataNascita.getMonthValue()));
        return cf;
    }
/*
    public static String meseNascita() {

    }

    public static String giornoNascitaandSesso() {

    }

    public static String luogoNascita() {

    }

    public static String carattereControllo() {

    }*/
}
