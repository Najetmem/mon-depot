package ManagedBeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;


import persistance.dao.KpiDaoImp;
import persistance.dao.IKpiDao;
import persistance.entities.Kpi;
@ManagedBean
public class KpiManagedBean {
	
	Kpi kpi=new Kpi();
    IKpiDao kpidao=new KpiDaoImp();
    List<Kpi> listekpi;
    Kpi selectedkpi=new Kpi();
    
	public Kpi getSelectedkpi() {
		return selectedkpi;
	}

	public void setSelectedkpi(Kpi selectedkpi) {
		this.selectedkpi = selectedkpi;
	}

	
	public List<Kpi> getListekpi() {
		listekpi=kpidao.findAll();
		return listekpi;
	}

	public void setListekpi(List<Kpi> listekpi) {
		this.listekpi = listekpi;
	}
	
	public Kpi getkpi() {
		return kpi;
	}

	public void setkpi(Kpi kpi) {
		this.kpi = kpi;
	}

	public String ajouter(ActionEvent a)
	{
		kpidao.add(kpi);
		return "ConsultationKpi.xhtml";
		
	}
	public void supprimer(ActionEvent a)
	{
		kpidao.delete(selectedkpi);
	}
		
	
	public void modifier(ActionEvent a)
	{
		kpidao.update(selectedkpi);
		
	}
	public String editer()
	{
		return "Modifkpi.xhtml";
	}
	
}
