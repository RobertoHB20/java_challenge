package Patterns.Creationals.Abstract_Factory.Excercise.Factories;

import Patterns.Creationals.Abstract_Factory.Excercise.Alumnos.Interfaces.AlumnosRepository;
import Patterns.Creationals.Abstract_Factory.Excercise.Cursos.Interfaces.CursosRepository;

public interface IAbstractFactory {

    public AlumnosRepository createRepositoryAlumnos();
    public CursosRepository createRepositoryCursos();

}
