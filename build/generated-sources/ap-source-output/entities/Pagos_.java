package entities;

import entities.Citas;
import entities.Comisiones;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-11T12:52:43")
@StaticMetamodel(Pagos.class)
public class Pagos_ { 

    public static volatile SingularAttribute<Pagos, Integer> estado;
    public static volatile SingularAttribute<Pagos, Date> fechaModificacion;
    public static volatile SingularAttribute<Pagos, Citas> citaId;
    public static volatile SingularAttribute<Pagos, Integer> iva;
    public static volatile SingularAttribute<Pagos, Float> valorTotal;
    public static volatile SingularAttribute<Pagos, String> concepto;
    public static volatile SingularAttribute<Pagos, Float> valor;
    public static volatile SingularAttribute<Pagos, Date> fechaCreacion;
    public static volatile SingularAttribute<Pagos, Integer> id;
    public static volatile ListAttribute<Pagos, Comisiones> comisionesList;

}