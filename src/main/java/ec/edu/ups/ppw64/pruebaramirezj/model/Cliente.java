package ec.edu.ups.ppw64.pruebaramirezj.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLIENTES")
public class Cliente {
	@Id
	@Column(name = "DNI", unique = true, nullable = false, length = 10)
	private String dni;

	@Column(name = "NOMBRE", unique = true, nullable = false, length = 13)
	private String nombre;

	@Column(name = "DIRECCION", unique = false, nullable = false, length = 200)
	private String direccion;

	@Column(name = "CUEN", unique = false, nullable = false, length = 10)
	private String codunelna;

	@Column(name = "CONSUMOKW", unique = false, nullable = false, precision = 2, scale = 2)
	private double consumokw;

	@Column(name = "FECHAREVISO", unique = false, nullable = false, length = 10)
	private String fechaRevision;

	@Column(name = "DEUDA", unique = false, nullable = false, precision = 2, scale = 2)
	private double deudaPendiente;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodunelna() {
		return codunelna;
	}

	public void setCodunelna(String codunelna) {
		this.codunelna = codunelna;
	}

	public double getConsumokw() {
		return consumokw;
	}

	public void setConsumokw(double consumokw) {
		this.consumokw = consumokw;
	}

	public String getFechaRevision() {
		return fechaRevision;
	}

	public void setFechaRevision(String fechaRevision) {
		this.fechaRevision = fechaRevision;
	}

	public double getDeudaPendiente() {
		return deudaPendiente;
	}

	public void setDeudaPendiente(double deudaPendiente) {
		this.deudaPendiente = deudaPendiente;
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", codunelna=" + codunelna
				+ ", consumokw=" + consumokw + ", fechaRevision=" + fechaRevision + ", deudaPendiente=" + deudaPendiente
				+ "]";
	}

	
}
