import java.util.Scanner;

/**
 * Created by Developer on 02/03/2017.
 */
public class Esercizio1 {
    public static void main(String[]args){

        String i;
        String j;
        String somma;

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci un numero");

        i=scanner.nextLine();

        System.out.println("insersci altro numero");

        j=scanner.nextLine();

        somma=Integer.parseInt(i)+Integer.parseInt(j)+"";

        //System.out.println("la sooma è: " + somma);
        System.out.println(Integer.parseInt(somma));

//// ce ne un altro metodo mettendo nextInt e dichiarando somma=i+j e dichiarando int i e int j al posto di String i e String j
    }

}
