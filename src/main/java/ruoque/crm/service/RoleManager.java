package ruoque.crm.service;

import java.util.List;

import ruoque.crm.model.Role;
import ruoque.crm.util.Pager;

public interface RoleManager {
	public Role getRole(int id);  

	public List<Role> getAllRole();  
	
	public Pager<Role> getAllRole(int pageNum, int pageSize);

	public void addRole(Role role);  

	public boolean delRole(int id);  

	public boolean updateRole(Role role); 
}
