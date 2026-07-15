package emanuela.carrubba.design.patterns.es2.entities;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerEsDue implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
//creo le pagine (foglie)

        System.out.println("****************************************ES 4**********************************");
        Pagina pagina1= new Pagina(1);
        Pagina pagina2= new Pagina(2);
        Pagina pagina3= new Pagina(3);
        Pagina pagina4= new Pagina(4);
        Pagina pagina5= new Pagina(5);

        //creo le sezioni (composit)
        Sezione sezione1= new Sezione();
        Sezione sezione2= new Sezione();
        Sezione sezione3= new Sezione();

        //nella sezione 1 aggiungo pagina 1 e 2
        sezione1.add(pagina1);
        sezione1.add(pagina2);

        //nella sezione 2 agg pagine 3 e 4
        sezione2.add(pagina3);
        sezione2.add(pagina4);

        //nella sezione 3 agg pagina 5
        sezione3.add(pagina5);

        //creo il libro e lo compongo (albero)
        Libro libro= new Libro("Fabio Volo", 14.50);

        // ora aggiungo le mie sezioni ai libri in modo che Libro per calcolare il numero di pagine
        //delegherà le sottosezioni che a loro volta chiameranno il metodo getNumeroPagine
libro.aggiungiElemento(sezione1);
libro.aggiungiElemento(sezione2);
libro.aggiungiElemento(sezione3);


        //chiamo il metodo per stampare
        libro.stampa();
        System.out.println("Il totale complessivo delle pagine presenti è" + " " + libro.getNumeroPagine());



    }
}
