package mx.com.dao;

import java.util.List;

import javax.persistence.Query;

import mx.com.domain.Employee;

public class EmployeeDao extends GenericDao {
	
	
	@SuppressWarnings("unchecked")
	public List<Employee> listarEmpleados(){
		
		String consulta = "SELECT d FROM Employee d";
		em = getEntityManager();
		Query query = em.createQuery(consulta);
		return query.getResultList();
		
		
	}
	
	public void insertarEmpleado (Employee employee) {
		
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(employee);
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
	
	public void actualizarEmpleado (Employee employee) {
		
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.merge(employee);
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
	
	public void eliminarEmpleado (Employee employee) {
		
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.refresh(em.merge(employee));
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
	
	public Employee buscarIdEmpleado (Employee employee) {
		em = getEntityManager();
		return em.find(Employee.class, employee.getIdEmployee());
		
	}
	
}