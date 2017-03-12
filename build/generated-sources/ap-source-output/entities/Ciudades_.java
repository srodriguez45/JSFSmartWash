package entities;

import entities.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-12T00:50:36")
@StaticMetamodel(Ciudades.class)
public class Ciudades_ { 

    public static volatile ListAttribute<Ciudades, Usuarios> usuariosList;
    public static volatile SingularAttribute<Ciudades, String> countryCode;
    public static volatile SingularAttribute<Ciudades, String> district;
    public static volatile SingularAttribute<Ciudades, String> name;
    public static volatile SingularAttribute<Ciudades, Integer> id;

}