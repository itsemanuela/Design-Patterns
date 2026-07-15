package emanuela.carrubba.design.patterns.es2.entities;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements ElementoLibro{
    private List<ElementoLibro> sottoSezione=new ArrayList<>();

    public void add(ElementoLibro elemento){
        sottoSezione.add(elemento); // agg la sottosezione alla lista di elementi
    }

    @Override
    public void stampa() {
for(ElementoLibro elemento:sottoSezione){
    elemento.stampa();
    System.out.println("Sto stampando la sottosezioni di " + sottoSezione.size());
}
    }

    @Override
    public int getNumeroPagine() {
        return sottoSezione.stream().mapToInt(ElementoLibro::getNumeroPagine).sum();
    }
}
