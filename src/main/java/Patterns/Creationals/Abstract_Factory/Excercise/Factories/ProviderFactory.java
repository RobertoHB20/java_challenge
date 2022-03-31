package Patterns.Creationals.Abstract_Factory.Excercise.Factories;

import Patterns.Creationals.Abstract_Factory.Excercise.Types.TypesFactory;

public class ProviderFactory {

    public static IAbstractFactory getFactory(TypesFactory typesFactory){

        switch (typesFactory){
            case NOSQL:
                return new NoSQLFactory();
            case RELACIONAL:
                return new RelacionalFactory();
            default:
                return null;
        }

    }

}
