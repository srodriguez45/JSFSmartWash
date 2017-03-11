package entities;

import entities.Ciudades;
import entities.Operarios;
import entities.Roles;
import entities.Vehiculos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-11T12:52:43")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> apellidos;
    public static volatile SingularAttribute<Usuarios, String> barrio;
    public static volatile SingularAttribute<Usuarios, Boolean> estado;
    public static volatile SingularAttribute<Usuarios, Date> fechaModificacion;
    public static volatile SingularAttribute<Usuarios, String> tipoIdentificacion;
    public static volatile ListAttribute<Usuarios, Vehiculos> vehiculosList1;
    public static volatile SingularAttribute<Usuarios, String> direccion;
    public static volatile SingularAttribute<Usuarios, Integer> identificacion;
    public static volatile ListAttribute<Usuarios, Vehiculos> vehiculosList;
    public static volatile SingularAttribute<Usuarios, Ciudades> ciudadId;
    public static volatile SingularAttribute<Usuarios, String> nombres;
    public static volatile SingularAttribute<Usuarios, String> token;
    public static volatile SingularAttribute<Usuarios, Boolean> terminosCondiciones;
    public static volatile ListAttribute<Usuarios, Operarios> operariosList;
    public static volatile ListAttribute<Usuarios, Roles> rolesList;
    public static volatile SingularAttribute<Usuarios, Date> fechaCreacion;
    public static volatile SingularAttribute<Usuarios, String> contrasena;
    public static volatile SingularAttribute<Usuarios, Integer> id;
    public static volatile SingularAttribute<Usuarios, Integer> telefono;
    public static volatile SingularAttribute<Usuarios, String> sexo;
    public static volatile SingularAttribute<Usuarios, String> email;

}