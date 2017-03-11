package entities;

import entities.Vehiculos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-11T12:52:43")
@StaticMetamodel(Marcas.class)
public class Marcas_ { 

    public static volatile SingularAttribute<Marcas, Integer> id;
    public static volatile ListAttribute<Marcas, Vehiculos> vehiculosList;
    public static volatile SingularAttribute<Marcas, String> nombre;

}