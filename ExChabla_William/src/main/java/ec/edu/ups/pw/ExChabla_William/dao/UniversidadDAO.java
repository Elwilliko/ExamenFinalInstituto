package ec.edu.ups.pw.ExChabla_William.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.pw.ExChabla_William.modelo.Universidad;

@Stateless
public class UniversidadDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(Universidad universidad) {
		
		em.persist(universidad);
		
	}
	
	public void update(Universidad universidad) {
		em.persist(universidad);

		
	}
	
	public Universidad read(int codigoUni) {
		
		Universidad u = em.find(Universidad.class, codigoUni);
		
		return u;
	}
	
	public void delete(int  codigoUni) {
		Universidad u = em.find(Universidad.class, codigoUni);

		em.remove(u);;
	}
	
	public List<Universidad> getUniversidades(String nombreUni){
		
		
		String jpql2 = "SELECT u FROM Universidad u"
				+"WHERE nombreUni = LIKE ?1 ";
		
		nombreUni = nombreUni + "%";
		
		Query query = em.createQuery(jpql2, Universidad.class);
		query.setParameter(1, nombreUni);
		
		List<Universidad> universidad = query.getResultList();
		return universidad;
				
	}
}
