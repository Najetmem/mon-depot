package persistance.dao;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import persistance.entities.Kpi;

public class KpiDaoImp implements IKpiDao {

	@Override
	public void add(Kpi h) {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();//j ai ouvert une session
		Transaction tx=s.beginTransaction();//commencer une transaction
		s.save(h);//enregistrer le client
		tx.commit();//valider la transaction d ajout
		s.close();//fermer la session
	}

	@Override
	public void delete(Kpi h) {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();//j ai ouvert une session
		Transaction tx=s.beginTransaction();//commencer une transaction
		s.delete(h);//enregistrer le client
		tx.commit();//valider la transaction d ajout
		s.close();//fermer la session
	}

	@Override
	public void update(Kpi h) {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();//j ai ouvert une session
		Transaction tx=s.beginTransaction();//commencer une transaction
		s.update(h);//enregistrer le client
		tx.commit();//valider la transaction d ajout
		s.close();//fermer la session
	}

	@Override
	public List<Kpi> findAll() {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();//j ai ouvert une session
		List<Kpi> l = s.createQuery("from Kpi").list();//il faut le nom de la class non pas du table
		s.close();
		return l;
	}

	@Override
	public Kpi findByid(int x) {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();//j ai ouvert une session
		Kpi h=(Kpi)s.get(Kpi.class, x);//s.get retourne un objet donc il faut un cast
		s.close();
		return h;
	}

}
