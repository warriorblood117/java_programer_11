package prueba.banco;

@FunctionalInterface
interface ValidadorTransaccion {
    boolean validate(Transaccion transaccion);
}

