package entities;

public class CuentaCorriente {

	private String rutCliente;
	private String montoEjecutivo;
	
	public CuentaCorriente(String rutCliente, String montoEjecutivo) {
		super();
		this.rutCliente = rutCliente;
		this.montoEjecutivo = montoEjecutivo;
	}

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getMontoEjecutivo() {
        return montoEjecutivo;
    }

    public void setMontoEjecutivo(String montoEjecutivo) {
        this.montoEjecutivo = montoEjecutivo;
    }

        
        
}
