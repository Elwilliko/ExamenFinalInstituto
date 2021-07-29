package ec.edu.ups.pw.ExChabla_William.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Universidad {
	
	@Id
	private int codigoUni;
	
	@Column(length = 100, name = "uni_nombreUni")
	private String nombreUni;
	private String direccion;
	private String telefono;
	
	@OneToOne(mappedBy = "universidad")
	//@JoinColumn(name="id_carrera")
	private Carrera carrera;
	
	
	

	/**
	 * @return the nombreUni
	 */
	public String getNombreUni() {
		return nombreUni;
	}

	/**
	 * @param nombreUni the nombreUni to set
	 */
	public void setNombreUni(String nombreUni) {
		this.nombreUni = nombreUni;
	}

	/**
	 * @return the carreras
	 */
	

	/**
	 * @return the codigoUni
	 */
	public int getCodigoUni() {
		return codigoUni;
	}

	/**
	 * @param codigoUni the codigoUni to set
	 */
	public void setCodigoUni(int codigoUni) {
		this.codigoUni = codigoUni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombreUni;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombreUni) {
		this.nombreUni = nombreUni;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the carrera
	 */
	public Carrera getCarrera() {
		return carrera;
	}

	/**
	 * @param carrera the carrera to set
	 */
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

}
