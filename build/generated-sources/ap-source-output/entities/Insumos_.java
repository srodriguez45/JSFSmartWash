package entities;

import entities.InsumosOperarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-11T15:54:02")
@StaticMetamodel(Insumos.class)
public class Insumos_ { 

    public static volatile SingularAttribute<Insumos, Boolean> estado;
    public static volatile SingularAttribute<Insumos, Date> fechaModificacion;
    public static volatile SingularAttribute<Insumos, String> tipoAsignacion;
    public static volatile SingularAttribute<Insumos, Integer> valor;
    public static volatile SingularAttribute<Insumos, Date> fechaCreacion;
    public static volatile SingularAttribute<Insumos, Integer> id;
    public static volatile SingularAttribute<Insumos, String> nombre;
    public static volatile ListAttribute<Insumos, InsumosOperarios> insumosOperariosList;

}