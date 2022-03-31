package Patterns.Creationals.Abstract_Factory.Excercise;

import Patterns.Creationals.Abstract_Factory.Excercise.Alumnos.Interfaces.AlumnosRepository;
import Patterns.Creationals.Abstract_Factory.Excercise.Cursos.Interfaces.CursosRepository;
import Patterns.Creationals.Abstract_Factory.Excercise.Factories.IAbstractFactory;
import Patterns.Creationals.Abstract_Factory.Excercise.Factories.ProviderFactory;
import Patterns.Creationals.Abstract_Factory.Excercise.Types.TypesFactory;

import java.util.Arrays;

public class RunAbstractFactory {
    public static void main(String[] args) {

        IAbstractFactory factoryRelacional = ProviderFactory.getFactory(TypesFactory.RELACIONAL);
        IAbstractFactory factoryNoSql = ProviderFactory.getFactory(TypesFactory.NOSQL);

        CursosRepository cursosRepository = factoryRelacional.createRepositoryCursos();
        AlumnosRepository alumnosRepository = factoryRelacional.createRepositoryAlumnos();

        System.out.println(Arrays.toString( alumnosRepository.listaAlumnos() ));
        System.out.println(Arrays.toString( cursosRepository.listaCursos() ));

        CursosRepository cursosRepository2 = factoryNoSql.createRepositoryCursos();
        AlumnosRepository alumnosRepository2 = factoryNoSql.createRepositoryAlumnos();

        System.out.println(Arrays.toString( alumnosRepository2.listaAlumnos() ));
        System.out.println(Arrays.toString( cursosRepository2.listaCursos() ));

    }
}
