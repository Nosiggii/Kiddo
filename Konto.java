
public abstract class Konto {
  
  // Anfang Attribute
  protected int kontoStand;
  // Ende Attribute

  // Anfang Methoden
  public int getKontoStand() {
    return kontoStand;
  }

  public abstract boolean buchung(int betrag);
    
  public void setKontoStand(int kontoStandNeu) {
    kontoStand = kontoStandNeu;
  }

  // Ende Methoden
} // end of Konto
  //kontoStand = kontoStand + betrag;
