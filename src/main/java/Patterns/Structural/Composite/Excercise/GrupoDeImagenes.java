package Patterns.Structural.Composite.Excercise;

import java.util.ArrayList;
import java.util.List;

public class GrupoDeImagenes implements IGrafico{

    private List<IGrafico> childGraf;

    public GrupoDeImagenes() {
        childGraf = new ArrayList<>();
    }

    @Override
    public void pintar() {

        this.childGraf.stream().forEach( e -> e.pintar() );

    }

    public void addGrafico(IGrafico grafico){
        this.childGraf.add(grafico);
    }

    public void removeGrafico(IGrafico grafico){
        this.childGraf.remove(grafico);
    }
}
