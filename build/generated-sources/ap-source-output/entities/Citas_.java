package entities;

import entities.Operarios;
import entities.Pagos;
import entities.Servicios;
import entities.Vehiculos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-11T12:52:43")
@StaticMetamodel(Citas.class)
public class Citas_ { 

    public static volatile ListAttribute<Citas, Servicios> serviciosList;
    public static volatile SingularAttribute<Citas, String> estado;
    public static volatile SingularAttribute<Citas, Integer> calificacion;
    public static volatile SingularAttribute<Citas, Date> fechaModificacion;
    public static volatile SingularAttribute<Citas, Date> fechaInicio;
    public static volatile SingularAttribute<Citas, Vehiculos> vehiculoId;
    public static volatile SingularAttribute<Citas, Operarios> operariosId;
    public static volatile SingularAttribute<Citas, Date> fechaCreacion;
    public static volatile SingularAttribute<Citas, Integer> id;
    public static volatile SingularAttribute<Citas, String> comentario;
    public static volatile SingularAttribute<Citas, Date> fechaFinalizacion;
    public static volatile ListAttribute<Citas, Pagos> pagosList;

}