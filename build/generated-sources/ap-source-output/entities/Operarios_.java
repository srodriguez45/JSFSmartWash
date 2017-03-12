package entities;

import entities.Citas;
import entities.InsumosOperarios;
import entities.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-12T00:50:36")
@StaticMetamodel(Operarios.class)
public class Operarios_ { 

    public static volatile SingularAttribute<Operarios, Usuarios> usuariosId;
    public static volatile SingularAttribute<Operarios, String> sueldo;
    public static volatile SingularAttribute<Operarios, Integer> id;
    public static volatile ListAttribute<Operarios, Citas> citasList;
    public static volatile ListAttribute<Operarios, InsumosOperarios> insumosOperariosList;

}