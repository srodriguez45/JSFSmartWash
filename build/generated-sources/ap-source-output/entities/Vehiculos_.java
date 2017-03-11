package entities;

import entities.Citas;
import entities.Marcas;
import entities.TiposVehiculos;
import entities.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-11T12:52:43")
@StaticMetamodel(Vehiculos.class)
public class Vehiculos_ { 

    public static volatile ListAttribute<Vehiculos, Usuarios> usuariosList;
    public static volatile SingularAttribute<Vehiculos, String> estado;
    public static volatile SingularAttribute<Vehiculos, Date> fechaModificacion;
    public static volatile SingularAttribute<Vehiculos, String> color;
    public static volatile SingularAttribute<Vehiculos, Date> modelo;
    public static volatile SingularAttribute<Vehiculos, Usuarios> usuarioId;
    public static volatile SingularAttribute<Vehiculos, TiposVehiculos> tipoVehiculoId;
    public static volatile SingularAttribute<Vehiculos, Marcas> marcaId;
    public static volatile SingularAttribute<Vehiculos, String> observaciones;
    public static volatile SingularAttribute<Vehiculos, Date> fechaCreacion;
    public static volatile SingularAttribute<Vehiculos, Integer> id;
    public static volatile ListAttribute<Vehiculos, Citas> citasList;
    public static volatile SingularAttribute<Vehiculos, String> placa;

}