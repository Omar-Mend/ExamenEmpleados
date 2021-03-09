package mx.com.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GENDERS")
public class Genders implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_GENDERS")
	private int idGenders;
	
	private String name;
	
	public Genders() {}
	
	public Genders(int idGenders) {
		this.idGenders = idGenders;
		
	}
	
	
	public int getIdGenders() {
		return idGenders;
	}
	public void setIdGenders(int idGenders) {
		this.idGenders = idGenders;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Genders [idGenders=" + idGenders + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idGenders;
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
		Genders other = (Genders) obj;
		if (idGenders != other.idGenders)
			return false;
		return true;
	}
	
	

}
