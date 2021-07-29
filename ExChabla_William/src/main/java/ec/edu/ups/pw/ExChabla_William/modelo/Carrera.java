package ec.edu.ups.pw.ExChabla_William.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Carrera {
	
	@Id
	private int codigoCar;
	
	private String nombreCarrera;
	private String director;
	
	@OneToOne
	@JoinColumn(name= "id_carrera")
	private Universidad universidad;
	/**
	 * @return the codigoCar
	 */
	
	
	public int getCodigoCar() {
		return codigoCar;
	}
	/**
	 * @return the universidad
	 */
	public Universidad getUniversidad() {
		return universidad;
	}
	/**
	 * @param universidad the universidad to set
	 */
	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}
	/**
	 * @param codigoCar the codigoCar to set
	 */
	public void setCodigoCar(int codigoCar) {
		this.codigoCar = codigoCar;
	}
	/**
	 * @return the nombreCarrera
	 */
	public String getNombreCarrera() {
		return nombreCarrera;
	}
	/**
	 * @param nombreCarrera the nombreCarrera to set
	 */
	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}
	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}
	
	
	
	

}
