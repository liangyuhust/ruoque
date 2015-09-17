package ruoque.crm.service;

import java.util.List;

import ruoque.crm.model.Call;
import ruoque.crm.util.Pager;

public interface CallManager {

	public Call getCall(int id);  

	public List<Call> getAllCall();  
	
	public Pager<Call> getAllCall(int pageNum, int pageSize);

	public void addCall(Call call);  

	public boolean delCall(int id);  

	public boolean updateCall(Call call); 
}
