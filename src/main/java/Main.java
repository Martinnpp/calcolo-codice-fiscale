import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci in questo ordine: cognome, nome, sesso, luogo di nascita, provincia (sigla), giorno, mese, anno");

        String[] input = sc.nextLine().split(" ");
        for(int i = 0; i < input.length; i++) {
            input[i] = input[i].toUpperCase();
        }

        User user = new User(
                input[0],
                input[1],
                input[2],
                input[3],
                input[4],
                input[5],
                input[6],
                input[7]
        );
        System.out.println(user.getCognome() + user.getNome());

        String cf = "";
        cf += Calculator.cognome(user.getCognome());
        cf += Calculator.nome(user.getNome());
        cf += Calculator.dataNascita(user.getDataNascita(), user.getSesso());

        System.out.println(cf);
    }
}
