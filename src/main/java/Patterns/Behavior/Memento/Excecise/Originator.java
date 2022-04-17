package Patterns.Behavior.Memento.Excecise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Originator {

    private String nombre;
    private String apellido;

    public Memento createMemento(){
        Memento  memento = new Memento(this.nombre, this.apellido);

        return memento;
    }

    public void restoreMemento(Memento memento){
        this.nombre = memento.getNombre();
        this.apellido = memento.getApellido();
    }


}
