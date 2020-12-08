package dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mysql.jdbc.Connection;

import model.Livre;

public class GestionLivreImp implements InterfaceGestionLivre {
	

	EntityManager em ;
	public void BookStoreImp () {
	EntityManagerFactory F = Persistence.createEntityManagerFactory("test1");
	em = F.createEntityManager();
	}

	@Override
	public Livre getLivreByID(int id) {
		em.getTransaction().begin();
		Query q = (Query) em.createQuery("select l from livre l where l.id = :idd");
		q.setParameter("idd", id).getSingleResult();
		//q.setParameter(1, id);
		Livre l = (Livre)q.getSingleResult();
		em.getTransaction().commit();
		return l;
	}

	@Override
	public List<Livre> getAllLivre() {
		em.getTransaction().begin();
		Query q = em.createQuery("select e from Livre l");
		List<Livre> l = q.getResultList();
		em.getTransaction().commit();
		return l;
	}

	@Override
	public void AjoutLivre(Livre l) {
		em.getTransaction().begin();
		em.persist(l);
		em.getTransaction().commit();
	}

	@Override
	public void ModifieLivreById(int id, String description,int qte ) {
	Livre l= em.find(Livre.class, id);
	em.getTransaction().begin();
	l.setDescription(description);
	l.setQte(qte);
	em.getTransaction().commit();
	}

	@Override
	public void DeleteLivre(Livre l) {
		em.getTransaction().begin();
		em.remove(l);
		em.getTransaction().commit();
		
	}
	
	

}
