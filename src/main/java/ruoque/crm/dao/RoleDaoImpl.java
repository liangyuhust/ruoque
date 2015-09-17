package ruoque.crm.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ruoque.crm.model.Role;
import ruoque.crm.util.Pager;

@Repository("roleDao")
public class RoleDaoImpl implements RoleDao {
	
	@Resource
	private SessionFactory sessionFactory;  

	public void setSessionFactory(SessionFactory sessionFactory) {  
	    this.sessionFactory = sessionFactory;
	}  

	@Transactional
	public Role getRole(int id) {
		String hql = "from Role r where r.id=?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setInteger(0, id);  

	    return (Role)query.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Role> getAllRole() {
		String hql = "from Role";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  

	    return query.list();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public Pager<Role> getAllRole(int pageNum, int pageSize) {
		String hql = "from Role";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);
	    int totalSize=query.list().size();
	    int totalPage=totalSize%pageSize!=0?(totalSize/pageSize+1):(totalSize/pageSize);
	    if(totalPage<1)totalPage=1;
	    
	    query.setMaxResults(pageSize);
	    query.setFirstResult((pageNum-1)*pageSize);
	    
        Pager<Role> roles= new Pager<Role>();
        List<Role> ass=query.list();
        roles.setDatas(ass);
        roles.setPageNum(pageNum);
        roles.setPageSize(pageSize);
        roles.setTotalPage(totalPage);
        roles.setTotalSize(totalSize);
	    return roles;  
	}

	@Transactional
	public void addRole(Role role) {
		sessionFactory.getCurrentSession().save(role);
	}

	@Transactional
	public boolean delRole(int id) {
		String hql = "delete Role r where r.id = ?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setInteger(0, id);  

	    return (query.executeUpdate() > 0); 
	}

	@Transactional
	public boolean updateRole(Role role) {
		String hql = "update Role r set r.permission = ?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setString(0, role.getPermission()); 

	    return (query.executeUpdate() > 0);
	}

}
