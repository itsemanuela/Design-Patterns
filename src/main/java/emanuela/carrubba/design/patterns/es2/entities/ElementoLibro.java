package emanuela.carrubba.design.patterns.es2.entities;


//questa è la scatola principale, al suo interno posso esserci libri, pagine o sezioni
//deve avere un metodo stampa e un metodo per recuperare il num di pagine
public interface ElementoLibro {
void stampa();
int getNumeroPagine();
}
