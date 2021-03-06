package net.tecgurus.minipos.model;
// Generated Oct 5, 2020, 8:15:58 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CompuestaId generated by hbm2java
 */
@Embeddable
public class CompuestaId implements java.io.Serializable {

	private int idcompuesta;
	private int idcompuestados;

	public CompuestaId() {
	}

	public CompuestaId(int idcompuesta, int idcompuestados) {
		this.idcompuesta = idcompuesta;
		this.idcompuestados = idcompuestados;
	}

	@Column(name = "idcompuesta", nullable = false)
	public int getIdcompuesta() {
		return this.idcompuesta;
	}

	public void setIdcompuesta(int idcompuesta) {
		this.idcompuesta = idcompuesta;
	}

	@Column(name = "idcompuestados", nullable = false)
	public int getIdcompuestados() {
		return this.idcompuestados;
	}

	public void setIdcompuestados(int idcompuestados) {
		this.idcompuestados = idcompuestados;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CompuestaId))
			return false;
		CompuestaId castOther = (CompuestaId) other;

		return (this.getIdcompuesta() == castOther.getIdcompuesta())
				&& (this.getIdcompuestados() == castOther.getIdcompuestados());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdcompuesta();
		result = 37 * result + this.getIdcompuestados();
		return result;
	}

}
