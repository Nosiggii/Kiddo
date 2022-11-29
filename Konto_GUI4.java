import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 29.11.2022
 * @author 
 */

public class Konto_GUI4 extends JFrame {
  // Anfang Attribute
  private JTextField tfEinAuszahlen = new JTextField();
  private JNumberField jNumberField1 = new JNumberField();
  private JNumberField jNumberField2 = new JNumberField();
  private JTextField jTextField2 = new JTextField();
  private JTextField tfKontostand = new JTextField();
  private JButton bGirokontoausfuehren = new JButton();
  private JButton bSparkontoausfuehren = new JButton();
  private JNumberField jNumberField3 = new JNumberField();
  // Ende Attribute
  
  Steuerung st1 = new Steuerung();
  
  public Konto_GUI4() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 607; 
    int frameHeight = 444;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Konto_GUI4");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    tfEinAuszahlen.setBounds(75, 73, 150, 20);
    tfEinAuszahlen.setText("Ein/Auszahlen");
    cp.add(tfEinAuszahlen);
    jNumberField1.setBounds(408, 64, 99, 44);
    jNumberField1.setText("");
    cp.add(jNumberField1);
    jNumberField2.setBounds(422, 241, 75, 20);
    jNumberField2.setText("");
    cp.add(jNumberField2);
    jTextField2.setBounds(131, 323, 294, 44);
    cp.add(jTextField2);
    tfKontostand.setBounds(227, 240, 150, 20);
    tfKontostand.setText("Kontostand");
    cp.add(tfKontostand);
    bGirokontoausfuehren.setBounds(82, 151, 139, 25);
    bGirokontoausfuehren.setText("Girokonto ausfuehren");
    bGirokontoausfuehren.setMargin(new Insets(2, 2, 2, 2));
    bGirokontoausfuehren.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bGirokontoausfuehren_ActionPerformed(evt);
      }
    });
    cp.add(bGirokontoausfuehren);
    bSparkontoausfuehren.setBounds(397, 156, 147, 25);
    bSparkontoausfuehren.setText("Sparkonto ausfuehren");
    bSparkontoausfuehren.setMargin(new Insets(2, 2, 2, 2));
    bSparkontoausfuehren.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSparkontoausfuehren_ActionPerformed(evt);
      }
    });
    cp.add(bSparkontoausfuehren);
    jNumberField3.setBounds(96, 240, 75, 20);
    jNumberField3.setText("");
    cp.add(jNumberField3);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Konto_GUI4
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Konto_GUI4();
  } // end of main
  
  public void bGirokontoausfuehren_ActionPerformed(ActionEvent evt) {
    st1.buchungGiro(jNumberField1.getInt());
    jNumberField3.setInt(st1.getKontoStandGiro());
    jNumberField1.setInt(0);
    jTextField2.setText("Buchung erfolgt");
  } // end of bGirokontoausfuehren_ActionPerformed

  public void bSparkontoausfuehren_ActionPerformed(ActionEvent evt) {
    st1.buchungSpar(jNumberField1.getInt());
    jNumberField2.setInt(st1.getKontoStandSpar());
    jNumberField1.setInt(0);
    jTextField2.setText("Buchung erfolgt");
  } // end of bSparkontoausfuehren_ActionPerformed

  public void zeigeKontoStandGiro() {
    jNumberField3.setInt(st1.getKontoStandGiro());
    
  }

  public void zeigeKontoStandSpar() {
    jNumberField2.setInt(st1.getKontoStandSpar());
    
  }

  public void zeigeBuchungsErfolg() {
    jNumberField1.setInt(0);
    
  }

  // Ende Methoden
} // end of class Konto_GUI4

