package prueba.banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Banco {
    public static void main(String[] args) {
        List<Transaccion> transaccionesValidas = new ArrayList<>();
        List<Transaccion> transaccionesActuales = new ArrayList<>();
        List<Transaccion> transaccionesInvalidas = new ArrayList<>();

        Transaccion transaccion = new Transaccion("John", "Doe", TipoTransaccion.INGRESO, 100.0, "Ciudad", "Pais", "Detalle", "Clave");

        ValidadorTransaccion validarMontoNoNegativo =  (data -> data.getMonto() > 0 );
        ValidadorTransaccion validarMontoNoNull = data -> data.getMonto() !=  null;
        ValidadorTransaccion validaClaveVerificacion =  data -> data.getClaveVerificacion() != null ;
        ValidadorTransaccion validarFraude = data -> data.getDetalle().contains("fraude");

        if (validarMontoNoNegativo.validate(transaccion) && validarMontoNoNull.validate(transaccion)){
            if(validaClaveVerificacion.validate(transaccion)){
                System.out.println("Esta protegido por clave de verificación");
            }
            if(validarFraude.validate(transaccion)){
                System.out.println("Es un fraude");
            }
        }

    }
}