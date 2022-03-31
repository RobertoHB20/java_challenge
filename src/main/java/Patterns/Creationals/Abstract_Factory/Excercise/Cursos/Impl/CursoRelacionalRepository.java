package Patterns.Creationals.Abstract_Factory.Excercise.Cursos.Impl;

import Patterns.Creationals.Abstract_Factory.Excercise.Cursos.Interfaces.CursosRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CursoRelacionalRepository implements CursosRepository {

    private List<String> cursos;

    public CursoRelacionalRepository(){
        cursos = new ArrayList<>(Arrays.asList("MySQL", "SQL Server"));
    }

    @Override
    public String[] listaCursos() {
        String[] result = new String[cursos.size()];
        return cursos.toArray(result);
    }

    @Override
    public void agregarCurso(String curso) {
        cursos.add(curso);

    }

    @Override
    public void borrarCurso(String curso) {
        cursos.remove(curso);
    }
}
