/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 19.10.2022
 * @author 
 */

public class KontoGiro extends Konto{
  
  // Anfang Attribute
  private int ueberziehlimit = -100; 
  // Ende Attribute
  
  KontoGiro() {

  }

  // Anfang Methoden

  public boolean buchung(int betrag) {
    if ((betrag + this.kontoStand)>= ueberziehlimit) {
      this.kontoStand = this.kontoStand + betrag;
      return true;
    } else {
      System.out.println("Ihre maximale Abbuchung darf" +(this.kontoStand-ueberziehlimit-1) +"sein.");
      return false;
    } // end of if-else
  }

  

  // Ende Methoden
} // end of KontoGiro

