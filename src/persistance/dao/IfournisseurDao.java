package persistance.dao;

import java.util.List;


import persistance.entities.Fournisseur;


public interface IfournisseurDao {
	
	public void add(Fournisseur c);
	public void delete(Fournisseur c);
	public void update(Fournisseur c);
	public List<Fournisseur> findAll();
	public Fournisseur findByid(int x);
	
	
	
}
