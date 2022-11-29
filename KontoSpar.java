/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 19.10.2022
 * @author 
 */

public class KontoSpar extends Konto{
  
  // Anfang Attribute
  private int mindesteinlage = 1;
  // Ende Attribute
  
  public KontoSpar() {
  }
  
   
  // Anfang Methoden
  public boolean buchung(int betrag) {
    
    if (betrag >=1) {
      this.kontoStand = this.kontoStand + betrag;
      return true;
    } else {
      System.out.println("Ihre maximale Mindestgeldanlage darf" +(this.kontoStand-mindesteinlage-1) +"sein.");
      return false;
    } // end of if-else
  }


  // Ende Methoden
} // end of KontoSpar

