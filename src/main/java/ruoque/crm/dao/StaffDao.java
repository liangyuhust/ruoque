package ruoque.crm.dao;

import java.util.List;

import ruoque.crm.model.Staff;
import ruoque.crm.util.Pager;

public interface StaffDao {
	public Staff getStaff(int id);  
	
	public Staff getStaffByStaffNo(String staffNo);

	public List<Staff> getAllStaff();
	
	public Pager<Staff> getAllStaff(int pageNum,int pageSize);  

	public void addStaff(Staff staff);  

	public boolean delStaff(int id);  

	public boolean updateStaff(Staff staff);  

}
