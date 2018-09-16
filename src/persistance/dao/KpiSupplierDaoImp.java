package persistance.dao;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import persistance.entities.KpiSupplier;

public class KpiSupplierDaoImp implements IKpiSupplierDao {

	@Override
	public void add(KpiSupplier r) {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();//j ai ouvert une session
		Transaction tx=s.beginTransaction();//commencer une transaction
		s.save(r);//enregistrer le client
		tx.commit();//valider la transaction d ajout
		s.close();//fermer la session
	}

	@Override
	public void delete(KpiSupplier r) {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();//j ai ouvert une session
		Transaction tx=s.beginTransaction();//commencer une transaction
		s.delete(r);//enregistrer le client
		tx.commit();//valider la transaction d ajout
		s.close();//fermer la session
	}

	@Override
	public void update(KpiSupplier r) {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();//j ai ouvert une session
		Transaction tx=s.beginTransaction();//commencer une transaction
		s.update(r);//enregistrer le client
		tx.commit();//valider la transaction d ajout
		s.close();//fermer la session
	}

	@Override
	public List<KpiSupplier> findAll() {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();//j ai ouvert une session
		List<KpiSupplier> l = s.createQuery("from KpiSupplier").list();//il faut le nom de la class non pas du table
		s.close();
		return l;
	}

	@Override
	public KpiSupplier findByid(int x) {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();//j ai ouvert une session
		KpiSupplier r=(KpiSupplier)s.get(KpiSupplier.class, x);//s.get retourne un objet donc il faut un cast
		s.close();
		return r;
	}

}
