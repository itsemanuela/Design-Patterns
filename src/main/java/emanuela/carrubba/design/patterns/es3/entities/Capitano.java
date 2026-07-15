package emanuela.carrubba.design.patterns.es3.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Capitano extends Ufficiale{
    public Capitano() {
        super(2000, "capitano");
    }
}
