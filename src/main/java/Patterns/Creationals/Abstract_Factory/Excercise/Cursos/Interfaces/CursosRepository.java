package Patterns.Creationals.Abstract_Factory.Excercise.Cursos.Interfaces;

public interface CursosRepository {

    String[] listaCursos();

    void agregarCurso(String curso);

    void borrarCurso(String curso);

}
