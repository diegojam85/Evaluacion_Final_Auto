package entities;

import java.sql.Date;

public class Ejecutivo {
	
	private Integer rutEjecutivo;
	private String nombre;
	private String departamento;

    public Ejecutivo(Integer rutEjecutivo, String nombre, String departamento) {
        this.rutEjecutivo = rutEjecutivo;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public Integer getRutEjecutivo() {
        return rutEjecutivo;
    }

    public void setRutEjecutivo(Integer rutEjecutivo) {
        this.rutEjecutivo = rutEjecutivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

        
        
}
