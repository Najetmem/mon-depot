package ManagedBeans;

import java.util.ArrayList;
import java.util.Date;

import java.util.List;

import javax.faces.bean.ManagedBean;

import javax.faces.event.ActionEvent;



//import com.sun.corba.se.spi.orb.ParserData;


import persistance.dao.FournisseurDaoImp;
import persistance.dao.IfournisseurDao;
import persistance.dao.IKpiSupplierDao;
import persistance.dao.KpiSupplierDaoImp;
import persistance.entities.Fournisseur;
import persistance.entities.Kpi;
import persistance.entities.KpiSupplier;

@ManagedBean

public class KpimoisManagedBean {

	KpiSupplier KpiSupplier=new KpiSupplier();
    IKpiSupplierDao KpiSupplierdao=new KpiSupplierDaoImp();
    List<KpiSupplier> listeKpiSupplier=new ArrayList<KpiSupplier>();
    KpiSupplier selectedKpiSupplier=new KpiSupplier();
   Fournisseur selectedFournisseur=new Fournisseur();
   Kpi selectedkpi=new Kpi();
   Date selectedDate;
   IfournisseurDao cdi=new FournisseurDaoImp();
    Fournisseur Fournisseur=new Fournisseur();
   
	public Fournisseur getFournisseur() {
		return Fournisseur;
	}

    
	public Date getSelectedDate() {
	return selectedDate;
}

public void setSelectedDate(Date selectedDate) {
	this.selectedDate = selectedDate;
}


	public Kpi getSelectedkpi() {
	return selectedkpi;
}

public void setSelectedkpi(Kpi selectedkpi) {
	this.selectedkpi = selectedkpi;
}



	public Fournisseur getSelectedFournisseur() {
	return selectedFournisseur;
}


public void setSelectedFournisseur(Fournisseur selectedFournisseur) {
	this.selectedFournisseur = selectedFournisseur;
}


	public void setFournisseur(Fournisseur Fournisseur) {
		this.Fournisseur = Fournisseur;
	}

	private List <Fournisseur> l;
  
 
    Kpi kpi=new Kpi();
    
	

	public Kpi getkpi() {
		return kpi;
	}

	public void setkpi(Kpi kpi) {
		this.kpi = kpi;
	}

	public KpiSupplier getSelectedKpiSupplier() {
		return selectedKpiSupplier;
	}

	public void setSelectedKpiSupplier(KpiSupplier selectedKpiSupplier) {
		this.selectedKpiSupplier = selectedKpiSupplier;
	}
	
	public List<KpiSupplier> getListeKpiSupplier() {
		listeKpiSupplier=KpiSupplierdao.findAll();
		
		return listeKpiSupplier;
	}

	public void setListeKpiSupplier(List<KpiSupplier> listeKpiSupplier) {
		this.listeKpiSupplier = listeKpiSupplier;
	}

	
	public KpiSupplier getKpiSupplier() {
		return KpiSupplier;
	}

	public void setKpiSupplier(KpiSupplier KpiSupplier) {
		this.KpiSupplier = KpiSupplier;
	}

	public void ajouter(ActionEvent a)
	{ 

		KpiSupplierdao.add(KpiSupplier);
		
	}
	public void supprimer(ActionEvent a)
	{
		KpiSupplierdao.delete(selectedKpiSupplier);
	}
		
	
	public void modifier(ActionEvent a)
	{   
		KpiSupplierdao.update(selectedKpiSupplier);
		
	}
	public String editer()
	{
		return "ModifKpimois.xhtml";
	}


	public List <Fournisseur> getL() {
		return l;
	}


	public void setL(List <Fournisseur> l) {
		this.l = l;
	}

	
	
}
