package mx.com.dao;

import java.util.List;

import javax.persistence.Query;

import mx.com.domain.Jobs;

public class JobsDao extends GenericDao{
	

	@SuppressWarnings("unchecked")
	public List<Jobs> listarPuestos(){
		
		String consulta = "SELECT d FROM Jobs d";
		em = getEntityManager();
		Query query = em.createQuery(consulta);
		return query.getResultList();
		
		
	}
	
	public void insertarPuesto (Jobs jobs) {
		
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(jobs);
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
	
	public void actualizarPuesto (Jobs jobs) {
		
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.merge(jobs);
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
	
	public void eliminarPuesto (Jobs jobs) {
		
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.refresh(em.merge(jobs));
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
	
	public Jobs buscarIdPuesto (Jobs jobs) {
		em = getEntityManager();
		return em.find(Jobs.class, jobs.getIdJobs());
		
	}
	
}
