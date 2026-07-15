package emanuela.carrubba.design.patterns.es3.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Colonnello extends Ufficiale{
    public Colonnello() {
        super(4000, "colonnello");
    }
}
