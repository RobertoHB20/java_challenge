package Patterns.Creationals.Abstract_Factory.Excercise.Factories;

import Patterns.Creationals.Abstract_Factory.Excercise.Alumnos.Impl.AlumnosRelacionalRepository;
import Patterns.Creationals.Abstract_Factory.Excercise.Alumnos.Interfaces.AlumnosRepository;
import Patterns.Creationals.Abstract_Factory.Excercise.Cursos.Impl.CursoRelacionalRepository;
import Patterns.Creationals.Abstract_Factory.Excercise.Cursos.Interfaces.CursosRepository;

public class RelacionalFactory implements IAbstractFactory{


    @Override
    public AlumnosRepository createRepositoryAlumnos() {
        return new AlumnosRelacionalRepository();
    }

    @Override
    public CursosRepository createRepositoryCursos() {
        return new CursoRelacionalRepository();
    }
}
