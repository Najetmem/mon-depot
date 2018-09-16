package persistance.dao;

import java.util.List;

import persistance.entities.Kpi;

public interface IKpiDao {
	public void add(Kpi c);
	public void delete(Kpi c);
	public void update(Kpi c);
	public List<Kpi> findAll();
	public Kpi findByid(int x);
}
