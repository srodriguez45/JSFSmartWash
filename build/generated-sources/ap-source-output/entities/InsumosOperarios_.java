package entities;

import entities.Insumos;
import entities.InsumosOperariosPK;
import entities.Operarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-11T12:52:43")
@StaticMetamodel(InsumosOperarios.class)
public class InsumosOperarios_ { 

    public static volatile SingularAttribute<InsumosOperarios, Date> fechaAdjunto;
    public static volatile SingularAttribute<InsumosOperarios, Boolean> estado;
    public static volatile SingularAttribute<InsumosOperarios, Insumos> insumos;
    public static volatile SingularAttribute<InsumosOperarios, InsumosOperariosPK> insumosOperariosPK;
    public static volatile SingularAttribute<InsumosOperarios, Operarios> operarios;

}