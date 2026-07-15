package emanuela.carrubba.design.patterns.es3.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class  Ufficiale {
    protected  Ufficiale responsabile;
    protected int stipendio;
    protected String funzione;


    public Ufficiale( int stipendio, String funzione) {

        this.stipendio = stipendio;
        this.funzione = funzione;
    }

    //metodo comune per settare responsabile
    public void setResponsabile(Ufficiale responsabile) {
        this.responsabile = responsabile;
    }

 //metodo comune per iniziare la catena
 public void verificaStipendio(int importoRichiesto) {
        //verifico se lo stipendio corrisponde
     if (this.stipendio == importoRichiesto) {
         System.out.println("Trovato: " + this.funzione + " percepisce esattamente " + this.stipendio);
     }
     // se c'è un responsbaile vado avanti
     else if (responsabile != null) {
         responsabile.verificaStipendio(importoRichiesto);
     }
     // se la catena finisce e nessuno corrisponde
     else {
         System.out.println("Nessun ufficiale percepisce esattamente " + importoRichiesto);
     }
 }
}
