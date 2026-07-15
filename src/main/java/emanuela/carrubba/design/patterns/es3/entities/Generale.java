package emanuela.carrubba.design.patterns.es3.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Generale extends Ufficiale{
    public Generale() {
        super(5000, "generale");
    }
}
