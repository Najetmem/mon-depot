package persistance.dao;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import persistance.entities.Fournisseur;


public class FournisseurDaoImp implements IfournisseurDao {

	
	@Override
	public void add(Fournisseur c) {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();//j ai ouvert une session
		Transaction tx=s.beginTransaction();//commencer une transaction
		s.save(c);//enregistrer le Fournisseur
		tx.commit();//valider la transaction d ajout
		s.close();//fermer la session
	
	}

	@Override
	public void delete(Fournisseur c) {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();//j ai ouvert une session
		Transaction tx=s.beginTransaction();//commencer une transaction
		s.delete(c);//enregistrer le Fournisseur
		tx.commit();//valider la transaction d ajout
		s.close();//fermer la session
	}

	@Override
	public void update(Fournisseur c) {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();//j ai ouvert une session
		Transaction tx=s.beginTransaction();//commencer une transaction
		s.update(c);//enregistrer le Fournisseur
		tx.commit();//valider la transaction d ajout
		s.close();//fermer la session
	}

	@Override
	public List<Fournisseur> findAll() {

		Session s=Dbsession.getSessionFactory().openSession();//j ai ouvert une session
		List<Fournisseur> l = s.createQuery("from Fournisseur").list();//il faut le nom de la class non pas du table
		s.close();
		return l;
	}

	@Override
	public Fournisseur findByid(int x) {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();//j ai ouvert une session
		Fournisseur Fournisseur=(Fournisseur)s.get(Fournisseur.class, x);//s.get retourne un objet donc il faut un cast
		s.close();
		return Fournisseur;
	}
	
	/*public static void main (String[] args)
	{
		
		IFournisseurDao t= new FournisseurDaoImp();
	Fournisseur c= new Fournisseur(55,"Tounsi","Mohamed","Menzah");
	t.add(c); // si on ne le fait pas la creation ne se fait pas
	/*List<Fournisseur> listclt=t.findAll();
	for(int i=0;i<listclt.size();i++)
	{
		Fournisseur Fournisseur=listclt.get(i);
		System.out.println(Fournisseur.getPrenom());
		//sysout +ctrl espace
	}*/
	/*Fournisseur c1=t.findByid(55);

	c1.setNom("nour");
	t.update(c1);
	System.out.println("le Fournisseur est "+c1.getNom());
	//t.delete(c1);

	}*/
	

}

