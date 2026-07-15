package emanuela.carrubba.design.patterns.es2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
@Setter
public class Libro implements ElementoLibro{
    private String autori;
    private double prezzo;
    private List<ElementoLibro> elementi= new ArrayList<>();

    public Libro(String autori, double prezzo) {
        this.autori = autori;
        this.prezzo = prezzo;

    }

    //metodo per agg un elemento

    public void aggiungiElemento(ElementoLibro elem){
        this.elementi.add(elem);
    }

    //override dei metodi dell'interfaccia elemento libro
    @Override
    public void stampa() {
        System.out.println("Sto stampando il libro di" + " " +  autori + " "  + "al prezzo di" + " " +  prezzo);
        for (ElementoLibro elem : elementi) {
            elem.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
        return elementi.stream().mapToInt(ElementoLibro::getNumeroPagine).sum();
    }
}
