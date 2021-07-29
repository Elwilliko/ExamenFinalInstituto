package ec.edu.ups.pw.ExChabla_William.util;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class Resources {
	
	@Produces
	@PersistenceContext(name = "evaluacionwsChablaWilliamPersistenceUnit")
	private EntityManager em;

}
