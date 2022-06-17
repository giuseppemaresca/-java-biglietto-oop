package jana60;
import java.util.Scanner;
public class Biglietteria {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		int eta,km;
	    String scelta;
	do	
	{
		 do 
		 {
			 System.out.println("Inserisca la sua età");
				eta = Integer.parseInt(scanner.nextLine());
				
				if (eta<1)
				{
					System.out.println("Inserisca un età valida ");
				}
		 
		 } while(eta<1);
		 
		 do
			{
				System.out.println("Inserisca la distanza dell itinerario ");
				km = Integer.parseInt(scanner.nextLine());
				
				if (km<1)
					System.out.println("Inserisca una distanza valida");
			}while (km<1);
		 
		 Biglietto biglietto = new Biglietto(eta,km);
		 biglietto.stampaCostoBiglietto();
		 do
		 {
		 System.out.println("Vuole acquistare un nuovo biglietto? ");
		 scelta= scanner.nextLine();
		 if(!scelta.equalsIgnoreCase("si")&&!scelta.equalsIgnoreCase("no"))
		 {
		 System.out.println("Inserisci una scelta valida");
		 }
		 }while(!scelta.equalsIgnoreCase("si")&&!scelta.equalsIgnoreCase("no"));
	
	}while(scelta.equalsIgnoreCase("si"));
	
}
	
	 
}
	//Bonus Svolto
