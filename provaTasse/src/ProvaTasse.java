


import java.util.Scanner;
/**
 *
 * @author e.carabbio
 */
public class ProvaTasse {

 
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     
     System.out.print("quanto prendi?: ");
     double ammontare = in.nextDouble();
     
     System.out.print("sposato? [Y/N]: ");
     String input = in.next();
     int stato;
     if (input.equals("Y"))
     {
     stato=Valore_tasse.SPOSATO;
     }
     else
     {
     stato=Valore_tasse.SINGLE;
     }
     Valore_tasse atax = new Valore_tasse(ammontare,stato);
     System.out.println("tasse: " + atax.getTax());
         
    }
    
}
