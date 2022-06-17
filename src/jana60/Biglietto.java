package jana60;
import java.text.DecimalFormat;
public class Biglietto 
{

	//attributi
	private double prezzoKm = 0.21, scontoMinorenni = 0.2, scontoOver65 = 0.40;
	private int eta, km, Minorenni = 18, Over65 = 65;
	DecimalFormat df = new DecimalFormat ("0.00€");
	
	
	
	//Costruttore
         public Biglietto(int eta, int km)
         {
	          super();
	          this.eta = eta;
	          this.km = km;
         }
         
     // getter&setter
         public int geteta() 
         {
        	 return eta;
        	 
         }
         
         public void seteta(int eta)
         {
        	 this.eta = eta;
         }
         
         public int getkm() 
         {
        	 return km;
        	 
         }
         
         public void setkm(int km)
         {
        	 this.eta = km;
         }
         
      //Metodi
         
         
         public double getPrezzoTotale () 
         {
        	 double prezzoBase=0.0;
        	 prezzoBase=km*prezzoKm;
        	 
        	 if(eta<Minorenni)
        	 {
        	     return prezzoBase-(prezzoBase*scontoMinorenni);
             }
        	 else if(eta>Over65)
        	 {
        		 return prezzoBase-(prezzoBase*scontoOver65);
        	 }
        	 else
        	 {
        		 return prezzoBase;
        	 }
           }
      
         public String getFormattedPrezzoTotale()
         {
        	 return df.format(getPrezzoTotale());
         }
       
        public void stampaCostoBiglietto() 
        {
        	System.out.println("Il costo del tuo biglietto è: "+getFormattedPrezzoTotale());
        	
        }
}