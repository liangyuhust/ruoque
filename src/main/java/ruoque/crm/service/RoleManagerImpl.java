package ruoque.crm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ruoque.crm.dao.RoleDao;
import ruoque.crm.model.Role;
import ruoque.crm.util.Pager;

@Service("roleManager")
public class RoleManagerImpl implements RoleManager {

	@Resource
	private RoleDao roleDao;

	public void setSaleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}
	
	public Role getRole(int id) {
		return roleDao.getRole(id);
	}

	public List<Role> getAllRole() {
		return roleDao.getAllRole();
	}

	public Pager<Role> getAllRole(int pageNum, int pageSize) {
		return roleDao.getAllRole(pageNum, pageSize);
	}

	public void addRole(Role role) {
		roleDao.addRole(role);
	}

	public boolean delRole(int id) {
		return roleDao.delRole(id);
	}

	public boolean updateRole(Role role) {
		// TODO Auto-generated method stub
		return false;
	}

}
