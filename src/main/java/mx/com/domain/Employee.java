package mx.com.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EMPLOYEE")
	private Integer idEmployee;

	
	//@Column(name = "ID_GENDERS")
	@JoinColumn(name="ID_GENDERS", referencedColumnName = "ID_GENDERS")
	@ManyToOne
	private Genders genders;

	
	//@Column(name = "ID_JOBS")
	@JoinColumn(name="ID_JOBS", referencedColumnName = "ID_JOBS")
	@ManyToOne
	private Jobs jobs;
	
	private String name;
	private String last_name;
	private String birthdate;

	public Employee() {}
	
	public Employee(int idEmployee){
		this.idEmployee = idEmployee;
		
	}
	
	@OneToMany(mappedBy = "employee")
	private List<EmployeeWorkedHours> horasTrabajadas;
	
	
	
	public Integer getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(Integer idEmployee) {
		this.idEmployee = idEmployee;
	}

	

	public List<EmployeeWorkedHours> getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(List<EmployeeWorkedHours> horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	
	public Genders getGenders() {
		return genders;
	}

	public void setGenders(Genders genders) {
		this.genders = genders;
	}

	public Jobs getJobs() {
		return jobs;
	}

	public void setJobs(Jobs jobs) {
		this.jobs = jobs;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	

	@Override
	public String toString() {
		return "Employee [idEmployee=" + idEmployee + ", genders=" + genders + ", jobs=" + jobs + ", name=" + name
				+ ", last_name=" + last_name + ", birthdate=" + birthdate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEmployee;
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
		Employee other = (Employee) obj;
		if (idEmployee != other.idEmployee)
			return false;
		return true;
	}
	
	
	
	
}
