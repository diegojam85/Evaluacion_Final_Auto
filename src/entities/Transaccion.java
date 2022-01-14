package entities;

public class Transaccion {
	
	private String rutCliente;
	private String rutDuenio;
	private String idCuenta;
	private String montoTransferencia;
        private String cuentaTransferencia;
        private String tipoCuenta;

    public Transaccion(String rutCliente, String rutDuenio, String idCuenta, String montoTransferencia, String cuentaTransferencia, String tipoCuenta) {
        this.rutCliente = rutCliente;
        this.rutDuenio = rutDuenio;
        this.idCuenta = idCuenta;
        this.montoTransferencia = montoTransferencia;
        this.cuentaTransferencia = cuentaTransferencia;
        this.tipoCuenta = tipoCuenta;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getRutDuenio() {
        return rutDuenio;
    }

    public void setRutDuenio(String rutDuenio) {
        this.rutDuenio = rutDuenio;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getMontoTransferencia() {
        return montoTransferencia;
    }

    public void setMontoTransferencia(String montoTransferencia) {
        this.montoTransferencia = montoTransferencia;
    }

    public String getCuentaTransferencia() {
        return cuentaTransferencia;
    }

    public void setCuentaTransferencia(String cuentaTransferencia) {
        this.cuentaTransferencia = cuentaTransferencia;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

        
        
}
