package entities;

import entities.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-12T00:50:36")
@StaticMetamodel(Roles.class)
public class Roles_ { 

    public static volatile ListAttribute<Roles, Usuarios> usuariosList;
    public static volatile SingularAttribute<Roles, Integer> id;
    public static volatile SingularAttribute<Roles, String> nombre;

}