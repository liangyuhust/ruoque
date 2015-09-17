package ruoque.crm.service;

import java.util.List;

import ruoque.crm.model.Comer;
import ruoque.crm.util.Pager;

public interface ComerManager {

	public Comer getComer(int id);  

	public List<Comer> getAllComer();  
	
	public Pager<Comer> getAllComer(int pageNum, int pageSize);

	public void addComer(Comer comer);  

	public boolean delComer(int id);  

	public boolean updateComer(Comer comer); 
}
