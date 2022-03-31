package Patterns.Creationals.Abstract_Factory.Excercise.Alumnos.Impl;

import Patterns.Creationals.Abstract_Factory.Excercise.Alumnos.Interfaces.AlumnosRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlumnosNoSQLRepository implements AlumnosRepository {
    private List<String> alumnos;

    public AlumnosNoSQLRepository(){
        alumnos = new ArrayList<>(Arrays.asList("Pepe", "Toño", "Cesar"));
    }

    @Override
    public String[] listaAlumnos() {
        String[] result = new String[alumnos.size()];
        return alumnos.toArray(result);
    }

    @Override
    public void agregaAlumno(String alumno) {

        this.alumnos.add(alumno);
    }

    @Override
    public void borrarAlumno(String alumno) {

        this.alumnos.remove(alumno);
    }
}
