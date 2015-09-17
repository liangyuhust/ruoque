package ruoque.crm.dao;

import java.util.List;

import ruoque.crm.model.Department;
import ruoque.crm.util.Pager;

public interface DepartmentDao {
	public Department getDepartment(int id);  

	public List<Department> getAllDepartment();
	
	public Pager<Department> getAllDepartment(int pageNum,int pageSize);  

	public void addDepartment(Department department);  

	public boolean delDepartment(int id);  

	public boolean updateDepartment(Department department);  
}
