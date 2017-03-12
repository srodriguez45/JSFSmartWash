package entities;

import entities.Servicios;
import entities.Vehiculos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-11T15:54:02")
@StaticMetamodel(TiposVehiculos.class)
public class TiposVehiculos_ { 

    public static volatile ListAttribute<TiposVehiculos, Servicios> serviciosList;
    public static volatile SingularAttribute<TiposVehiculos, Integer> id;
    public static volatile ListAttribute<TiposVehiculos, Vehiculos> vehiculosList;
    public static volatile SingularAttribute<TiposVehiculos, String> nombre;

}