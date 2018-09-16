package persistance.dao;

import java.util.List;

import persistance.entities.KpiSupplier;


public interface IKpiSupplierDao {
	public void add(KpiSupplier r);
	public void delete(KpiSupplier r);
	public void update(KpiSupplier r);
	public List<KpiSupplier> findAll();
	public KpiSupplier findByid(int x);
	
	
}
