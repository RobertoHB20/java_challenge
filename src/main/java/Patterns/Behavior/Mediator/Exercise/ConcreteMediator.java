package Patterns.Behavior.Mediator.Exercise;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class ConcreteMediator implements IMediator{

    private Tele tv;
    private Lampara lampara;


    @Override
    public String encender(Aparato aparato) {
        if(tv.equals(aparato)){
            return "TV encendida";
        }
        else if (lampara.equals(aparato)){
            return "Lampara encendida";
        }else{
            return "Aparato no encontrado";
        }
    }

    @Override
    public String apagar(Aparato aparato) {
        if(tv.equals(aparato)){
            return "TV apagada";
        }
        else if (lampara.equals(aparato)){
            return "Lampara apagada";
        }else{
            return "Aparato no encontrado";
        }
    }
}
