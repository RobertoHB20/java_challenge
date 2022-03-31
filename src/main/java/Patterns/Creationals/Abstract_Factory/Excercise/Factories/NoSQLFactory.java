package Patterns.Creationals.Abstract_Factory.Excercise.Factories;

import Patterns.Creationals.Abstract_Factory.Excercise.Alumnos.Impl.AlumnosNoSQLRepository;
import Patterns.Creationals.Abstract_Factory.Excercise.Alumnos.Interfaces.AlumnosRepository;
import Patterns.Creationals.Abstract_Factory.Excercise.Cursos.Impl.CursoNoSQLRepository;
import Patterns.Creationals.Abstract_Factory.Excercise.Cursos.Interfaces.CursosRepository;

public class NoSQLFactory implements IAbstractFactory{

    @Override
    public AlumnosRepository createRepositoryAlumnos() {
        return new AlumnosNoSQLRepository();
    }

    @Override
    public CursosRepository createRepositoryCursos() {
        return new CursoNoSQLRepository();
    }
}
