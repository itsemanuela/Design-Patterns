package emanuela.carrubba.design.patterns.es3.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Tenente extends Ufficiale{
    public Tenente() {
        super(1000, "tenente");

    }
}
