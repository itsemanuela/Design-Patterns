package emanuela.carrubba.design.patterns.es2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Pagina implements ElementoLibro{
    int pagina;

    public Pagina(int pagina){
        this.pagina = pagina;
    }

    @Override
    public void stampa() {
        System.out.println("Sto stampando la pagina" + " " +  this.pagina);
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }
}
