package mx.com.dao;

import java.util.List;

import javax.persistence.Query;

import mx.com.domain.Genders;


public class GendersDao extends GenericDao {
	
	@SuppressWarnings("unchecked")
	public List<Genders> listarGeneros(){
		
		String consulta = "SELECT d FROM Genders d";
		em = getEntityManager();
		Query query = em.createQuery(consulta);
		return query.getResultList();
		
		
	}
	
	public void insertarGenero (Genders genders) {
		
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(genders);
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
	
	public void actualizarGenero (Genders genders) {
		
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.merge(genders);
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
	
	public void eliminarGenero (Genders genders) {
		
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.refresh(em.merge(genders));
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
	
	public Genders buscarIdGenero (Genders genders) {
		em = getEntityManager();
		return em.find(Genders.class, genders.getIdGenders());
		
	}
	
}