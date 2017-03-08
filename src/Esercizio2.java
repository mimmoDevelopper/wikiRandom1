import java.util.Scanner;

public class Esercizio2 {
    public static void main (String[]args){
     int prezzoEuro;
     int prezzoCentesimi;
    // double prezzoTotale;
     int percentuale;

        Scanner scanner = new  Scanner(System.in);

        System.out.println("metti il primo prezzo");
        prezzoEuro =scanner.nextInt();
        System.out.println("metti secondo prezzo");
        prezzoCentesimi = scanner.nextInt();
        System.out.println("metti la percentuale");
        percentuale = scanner.nextInt();

        System.out.println("IL TUO PREZZO FINALE IN EURO è "+prezzoEuro+prezzoCentesimi*0.1);

    }
}
