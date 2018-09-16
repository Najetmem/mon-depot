package ManagedBeans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import javax.faces.event.ActionEvent;
import persistance.dao.FournisseurDaoImp;
import persistance.dao.IfournisseurDao;
import persistance.entities.Fournisseur;
import persistance.entities.KpiSupplier;

@ManagedBean

public class FournisseurManagedBean {
KpimoisManagedBean kp= new KpimoisManagedBean();
	Fournisseur Fournisseur=new Fournisseur();
    IfournisseurDao Fournisseurdao=new FournisseurDaoImp();
    List<Fournisseur> listefrs;
    Fournisseur selectedfrs=new Fournisseur();
    
   
	public double totalnote(Fournisseur f)
	{
		double tot=0.0;
		
		for(KpiSupplier l: kp.getListeKpiSupplier())
		{
			if( l.getFournisseur().getIdfrs().equals(f) )
    	tot= tot+ l.getNote();
		}
		return tot;
		
		
	}


	
	
   


	public Fournisseur getSelectedfrs() {
		return selectedfrs;
	}

	public void setSelectedfrs(Fournisseur selectedfrs) {
		this.selectedfrs = selectedfrs;
	}

	public List<Fournisseur> getListefrs() {
		listefrs=Fournisseurdao.findAll();
		
		return listefrs;
	}

	public void setListefrs(List<Fournisseur> listefrs) {
		this.listefrs = listefrs;
	}

	public Fournisseur getFournisseur() {
		return Fournisseur;
	}

	public void setFournisseur(Fournisseur Fournisseur) {
		this.Fournisseur = Fournisseur;
	}
	
	public void ajouter(ActionEvent a)
	{
		Fournisseurdao.add(Fournisseur);
		
	}
	public void supprimer(ActionEvent a)
	{
		Fournisseurdao.delete(selectedfrs);
	}
		
	
	public void modifier(ActionEvent a)
	{
		Fournisseurdao.update(selectedfrs);
		
	}
	public String editer()
	{
		return "Modiffrs.xhtml";
	}
	
	
	
	
}
