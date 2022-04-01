package ar.com.cdt.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author lsaracco
 */

@Entity
public class Socio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nombreCompleto;
	private String ic;
	private String plan;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getIc() {
		return ic;
	}

	public void setIc(String ic) {
		this.ic = ic;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombreCompleto=" + nombreCompleto + ", ic=" + ic + ", plan=" + plan + "]";
	}
}