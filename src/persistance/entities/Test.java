/*package persistance.entities;


import java.text.SimpleDateFormat;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 
public class Test {
 
    public static void main(String[] args) throws Exception {
    	try
    	{
    	
    	/*Configuration configuration = new Configuration().configure();
		ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
		registry.applySettings(configuration.getProperties());
	     ServiceRegistry serviceRegistry = registry.buildServiceRegistry();

		// builds a session factory from the service registry
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	
		// obtains the session
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Fournisseur frs1 = new Fournisseur();
		frs1.setAdressefrs("hongkong");
		frs1.setMailContact("mail3");
		frs1.setNomfrs("frs3");
		
		Kpi kpi=new Kpi();
		kpi.setDescription("quality");
		kpi.setPoids(30);
		 Set<Fournisseur> frs = new HashSet<Fournisseur>();
		 frs.add(frs1);
		kpi.setFournisseurs(frs);
		 Set<Kpi> kpis = new HashSet<Kpi>();
		 kpis.add(kpi);
		frs1.setKpismois(kpis);
	
		session.save(frs1);
		session.save(kpi);
		
		session.getTransaction().commit();
		session.close();		
	}
    }*/
 
    /*   Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
 
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        
        Transaction tx = session.beginTransaction();
        
       KpiSupplier kp=new KpiSupplier();
        kp.setDate(new SimpleDateFormat("dd/MM/yyyy").parse("01/09/2018"));
        kp.setNote(20);
       Fournisseur f= new Fournisseur(null,"Huawei","huawei@huawei","huawei",null);
       kp.setFournisseur(f);
       Kpi kpi=new Kpi(null,"Quality",30,null);
      kp.setKpi(kpi);
	//	Fournisseur fournisseur=(Fournisseur)session.get(Fournisseur.class, 1);//s.get retourne un objet donc il faut un cast
		Set<KpiSupplier> kpis = new HashSet<KpiSupplier>();
		kpis.add(kp);
		f.setKpisupplier(kpis);
	    kpi.setKpisupplier(kpis);
		session.save(f);
		session.save(kpi);
	    session.save(kp);

		
       
        System.out.println("Object saved successfully.....!!");
      
      
       /* List<KpiSupplier> l = session.createQuery("from KpiSupplier").list();
      for(Iterator<KpiSupplier> it=l.iterator(); it.hasNext();) 
            System.out.println(it.next()); 
       /* for(Kpimois s : l)
            System.out.println(s.getFournisseur().getIdfrs());*/
  
        /*tx.commit();
        session.close();
        factory.close();
    	// loads configuration and mappings
    }
        catch (Exception e) {
        	   e.printStackTrace(); // put a break-point here and inspect the 'e'
        	}
    }
}*/