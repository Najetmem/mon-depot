package persistance.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class KpiSupplier  implements java.io.Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@Column(unique = true, nullable = false)
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idkpisupplier;
@ManyToOne(fetch = FetchType.EAGER)
	private Fournisseur fournisseur=new Fournisseur();
@ManyToOne(fetch = FetchType.EAGER)
	private Kpi kpi=new Kpi();
	@Temporal(TemporalType.DATE)
	private Date date;
	private double note;
	public KpiSupplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KpiSupplier(Integer idkpisupplier,
			Date date,double note,Fournisseur fournisseur,Kpi kpi) {
		super();
		this.note=note;
		this.idkpisupplier = idkpisupplier;
		this.fournisseur = fournisseur;
		this.kpi = kpi;
		this.date = date;
	}
	public Integer getIdkpisupplier() {
		return idkpisupplier;
	}
	public void setIdkpisupplier(Integer idkpisupplier) {
		this.idkpisupplier = idkpisupplier;
	}
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	public Kpi getKpi() {
		return kpi;
	}
	public void setKpi(Kpi kpi) {
		this.kpi = kpi;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getNote() {
		return note;
	}
	public void setNote(double note) {
		this.note = note;
	}
	
	
	
	
	
	
}
