package entities;

import entities.Pagos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-11T15:54:02")
@StaticMetamodel(Comisiones.class)
public class Comisiones_ { 

    public static volatile SingularAttribute<Comisiones, Boolean> estado;
    public static volatile SingularAttribute<Comisiones, Pagos> pagoId;
    public static volatile SingularAttribute<Comisiones, String> valor;
    public static volatile SingularAttribute<Comisiones, Integer> id;

}