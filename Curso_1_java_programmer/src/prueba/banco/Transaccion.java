package prueba.banco;

enum TipoTransaccion {
    INGRESO,
    EGRESO
}
class Transaccion {
    private String nombre;
    private String apellido;
    private TipoTransaccion tipoTransaccion;
    private Double monto;
    private String ciudad;
    private String pais;
    private String detalle;
    private String claveVerificacion;
    private boolean esSospechosa;

    public Transaccion(String nombre, String apellido, TipoTransaccion tipoTransaccion, Double monto, String ciudad, String pais, String detalle, String claveVerificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoTransaccion = tipoTransaccion;
        this.monto = monto;
        this.ciudad = ciudad;
        this.pais = pais;
        this.detalle = detalle;
        this.claveVerificacion = claveVerificacion;

        // Realizar las validaciones
        if (monto < 0 || monto == 0) {
            System.out.println("Monto no válido: " + monto);
        }
        if (claveVerificacion != null) {
            System.out.println("Esta transacción está protegida.");
        }
        if (detalle.toLowerCase().contains("fraude")) {
            esSospechosa = true;
        }
        if (!(tipoTransaccion.equals("Pagado") || tipoTransaccion.equals("Retirado"))) {
            System.out.println("Tipo de transacción no válido: " + tipoTransaccion);
        }
    }

    public Double getMonto() {
        return monto;
    }

    public boolean esSospechosa() {
        return esSospechosa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TipoTransaccion getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getClaveVerificacion() {
        return claveVerificacion;
    }

    public void setClaveVerificacion(String claveVerificacion) {
        this.claveVerificacion = claveVerificacion;
    }

    public boolean isEsSospechosa() {
        return esSospechosa;
    }

    public void setEsSospechosa(boolean esSospechosa) {
        this.esSospechosa = esSospechosa;
    }

    public void marcarSospechosa() {
    }
}
