package Patterns.Creationals.Abstract_Factory.Excercise.Alumnos.Interfaces;

public interface AlumnosRepository {

    String[] listaAlumnos();

    void agregaAlumno(String alumno);

    void borrarAlumno(String alumno);
}
