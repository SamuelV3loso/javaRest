package ifal.edu.pw2.demo.modelo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Atendimento {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private java.util.Date dataConsulta = new java.util.Date();

	@ManyToOne
	@JoinColumn(name="id_paciente", nullable=false)
	private Paciente paciente;

	@ManyToOne
	@JoinColumn(name="id_medico", nullable=false)
	private Medico medico;

	public Integer getId() {
		return id;
	}

	public java.util.Date getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(java.util.Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atendimento other = (Atendimento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
