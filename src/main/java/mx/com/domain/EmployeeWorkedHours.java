package mx.com.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_WORKED_HOURS")
public class EmployeeWorkedHours implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EMPLOYEE_WORKED_HOURS")
	private int idEmployeeWorkedHours; 
	
	@ManyToOne
	@JoinColumn(name="ID_EMPLOYEE", referencedColumnName = "ID_EMPLOYEE")
	private Employee employee;
	
	@Column(name = "WORKED_HOURS")
	private int workedHours;
	
	@Column(name = "WORKED_DATE")
	private String workedDate;
	
	
	
	public EmployeeWorkedHours() {}
	
	public EmployeeWorkedHours(int idEmployeeWorkedHours) {
		this.idEmployeeWorkedHours = idEmployeeWorkedHours; 
		
	}

	

	public int getIdEmployeeWorkedHours() {
		return idEmployeeWorkedHours;
	}

	public void setIdEmployeeWorkedHours(int idEmployeeWorkedHours) {
		this.idEmployeeWorkedHours = idEmployeeWorkedHours;
	}
	

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}

	public String getWorkedDate() {
		return workedDate;
	}

	public void setWorkedDate(String workedDate) {
		this.workedDate = workedDate;
	}

	@Override
	public String toString() {
		return "EmployeeWorkedHours [idEmployeeWorkedHours=" + idEmployeeWorkedHours + ", employee=" + employee
				+ ", workedHours=" + workedHours + ", workedDate=" + workedDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEmployeeWorkedHours;
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
		EmployeeWorkedHours other = (EmployeeWorkedHours) obj;
		if (idEmployeeWorkedHours != other.idEmployeeWorkedHours)
			return false;
		return true;
	}
	
	
	
}
