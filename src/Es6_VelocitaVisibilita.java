/*Esercizio 6:
Si supponga che 'velocita' e 'visibilita' siano due variabili di tipo int.
Utilizzando la Scanner si scriva un'istruzione 'if'
che assegni alle variabili velocita e visibilità un determinato valore
e che mostri la parola 'Attenzione' se il valore della variabile velocita è maggiore di 25
e se il valore della variabile visibilita è minore di 30.
Una implementazione del programma è quella di non consentire il calcolo su valori
negativi di velocità e visibilità
*/
import java.util.Scanner;
public class Es6_VelocitaVisibilita {
    public static void main(String[] args) {
        Scanner velvis= new Scanner(System.in);
        int velocita=0, visibilita=0;
        System.out.println("VELOCITÀ E VISIBILITÀ\n");
        do{
        System.out.print("Si ingressi la VELOCITÀ: ");
        velocita= velvis.nextInt();
        System.out.print("Si ingressi la VISIBILITÀ: ");
        visibilita= velvis.nextInt();}
        while(velocita<0 && visibilita<0);

        if(velocita>25 && visibilita<30){
            System.out.println("\nATTENZIONE!\nLa velocità è maggiore di 25 e la visibilità è minore di 30");
        }
        else{
            System.out.println("\nNon ci sono problemi. Vada avanti");
        }
    }
}