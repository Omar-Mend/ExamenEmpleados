package mx.com.dao;

import java.util.List;

import javax.persistence.Query;

import mx.com.domain.EmployeeWorkedHours;

public class EmployeeWorkedHoursDao extends GenericDao {
	
	@SuppressWarnings("unchecked")
	public List<EmployeeWorkedHours> listarHorasTrabajadas(){
		
		String consulta = "SELECT d FROM EmployeeWorkedHours d";
		em = getEntityManager();
		Query query = em.createQuery(consulta);
		return query.getResultList();
		
		
	}
	
	public void insertarHoras (EmployeeWorkedHours employeeWorkedHours) {
		
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(employeeWorkedHours);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		finally {
			if(em != null) {
				em.close();
			}
		}
		
	}
	
	public void actualizarHoras (EmployeeWorkedHours employeeWorkedHours) {
		
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.merge(employeeWorkedHours);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		finally {
			if(em != null) {
				em.close();
			}
		}
		
	}
	
	public void eliminarHoras (EmployeeWorkedHours employeeWorkedHours) {
		
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.refresh(em.merge(employeeWorkedHours));
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		finally {
			if(em != null) {
				em.close();
			}
		}
		
	}
	
	public EmployeeWorkedHours buscarIdHoras (EmployeeWorkedHours employeeWorkedHours) {
		em = getEntityManager();
		return em.find(EmployeeWorkedHours.class, employeeWorkedHours.getIdEmployeeWorkedHours());
		
	}
	
}
