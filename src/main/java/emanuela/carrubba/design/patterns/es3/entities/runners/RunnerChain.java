package emanuela.carrubba.design.patterns.es3.entities.runners;

import emanuela.carrubba.design.patterns.es3.entities.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerChain implements CommandLineRunner {
    public void run(String... args) throws Exception {

        // creo ufficiali

        Capitano capitano = new Capitano();
        Colonnello colonnello = new Colonnello();
        Generale generale = new Generale();
        Maggiore maggiore = new Maggiore();
        Tenente tenente = new Tenente();

        //inizio la catena
        tenente.setResponsabile(capitano);
        capitano.setResponsabile(maggiore);
        maggiore.setResponsabile(colonnello);
        colonnello.setResponsabile(generale);


        System.out.println("La catena di responsabilità è la seguente: ");
        tenente.verificaStipendio(1000); // il tenente risponde per se stesso
        tenente.verificaStipendio(3000);
        tenente.verificaStipendio(2000);
        tenente.verificaStipendio(4000); // il tenente passa al capitano -> maggiore -> colonnello -> generale
        tenente.verificaStipendio(6000);

    }

}
