

public class Steuerung {
  
  // Anfang Referenz Attribute
  private KontoGiro meinKontoGiro = new KontoGiro();
  private KontoSpar meinKontoSpar = new KontoSpar(); 
  private Konto_GUI4 gui4;
  // Ende Attribute
  
  public Steuerung() {
  }

  // Anfang Methoden
  public void buchungGiro(int betrag) {
    meinKontoGiro.buchung(betrag);
  }
  
  public void buchungSpar(int betrag) {
    meinKontoSpar.buchung(betrag);
  }
  
  public int getKontoStandGiro() {
    return  meinKontoGiro.getKontoStand();
    //meinKontoGiro.getKontoGiro();
    
  }
  public int getKontoStandSpar() {
    return meinKontoSpar.getKontoStand();
   
  }

  // Ende Methoden
} // end of Steuerung

