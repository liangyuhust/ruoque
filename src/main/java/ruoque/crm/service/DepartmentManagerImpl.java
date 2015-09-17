package ruoque.crm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ruoque.crm.dao.DepartmentDao;
import ruoque.crm.model.Department;
import ruoque.crm.util.Pager;

@Service("departmentManager")
public class DepartmentManagerImpl implements DepartmentManager {
	
	@Resource
	private DepartmentDao departmentDao;

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	public Department getDepartment(int id) {
		return departmentDao.getDepartment(id);
	}

	public List<Department> getAllDepartment() {
		return departmentDao.getAllDepartment();
	}

	public Pager<Department> getAllDepartment(int pageNum, int pageSize) {
		return departmentDao.getAllDepartment(pageNum, pageSize);
	}

	public void addDepartment(Department department) {
		departmentDao.addDepartment(department);

	}

	public boolean delDepartment(int id) {
		return departmentDao.delDepartment(id);
	}

	public boolean updateDepartment(Department department) {
		return departmentDao.updateDepartment(department);
	}

}
