package entities;

import entities.Citas;
import entities.TiposVehiculos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-11T12:52:43")
@StaticMetamodel(Servicios.class)
public class Servicios_ { 

    public static volatile SingularAttribute<Servicios, TiposVehiculos> idTipoVehiculo;
    public static volatile SingularAttribute<Servicios, Integer> estado;
    public static volatile SingularAttribute<Servicios, Date> fechaModificacion;
    public static volatile SingularAttribute<Servicios, Float> valor;
    public static volatile SingularAttribute<Servicios, Date> fechaCreacion;
    public static volatile SingularAttribute<Servicios, Integer> id;
    public static volatile SingularAttribute<Servicios, Float> porcentajeComision;
    public static volatile SingularAttribute<Servicios, String> nombre;
    public static volatile ListAttribute<Servicios, Citas> citasList;

}