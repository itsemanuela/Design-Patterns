package emanuela.carrubba.design.patterns.es3.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Maggiore extends Ufficiale{
    public Maggiore() {
        super(3000, "maggiore");
    }
}
