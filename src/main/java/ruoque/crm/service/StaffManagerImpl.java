package ruoque.crm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ruoque.crm.dao.StaffDao;
import ruoque.crm.model.Staff;
import ruoque.crm.util.Pager;

@Service("staffManager")
public class StaffManagerImpl implements StaffManager {
	
	@Resource
	private StaffDao staffDao;  

	public void setStaffDao(StaffDao staffDao) {  
	    this.staffDao = staffDao;  
	}  

	public Staff getStaff(int id) {  
	    return staffDao.getStaff(id);  
	}  

	public List<Staff> getAllStaff() {  
	    return staffDao.getAllStaff();  
	}  

	public void addStaff(Staff staff) {  
	    staffDao.addStaff(staff); 
	}  

	public boolean delStaff(int id) {
		return staffDao.delStaff(id);
	}

	public boolean updateStaff(Staff staff) {
		return staffDao.updateStaff(staff);
	}  

	public Pager<Staff> getAllStaff(int pageNum, int pageSize) {
		return staffDao.getAllStaff(pageNum, pageSize);
	}

	public Staff getStaffByStaffNo(String staffNo) {
		return staffDao.getStaffByStaffNo(staffNo);
	}


}
