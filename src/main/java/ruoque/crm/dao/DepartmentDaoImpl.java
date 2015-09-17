package ruoque.crm.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ruoque.crm.model.Department;
import ruoque.crm.util.Pager;

@Repository("departmentDao")
public class DepartmentDaoImpl implements DepartmentDao {

	@Resource
	private SessionFactory sessionFactory;  

	public void setSessionFactory(SessionFactory sessionFactory) {  
	    this.sessionFactory = sessionFactory;
	}  
	
	@Transactional
	public Department getDepartment(int id) {
		String hql = "from Department d where d.id=?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setInteger(0, id);  

	    return (Department)query.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Department> getAllDepartment() {
		String hql = "from Department";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  

	    return query.list();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public Pager<Department> getAllDepartment(int pageNum, int pageSize) {
		String hql = "from Department";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);
	    int totalSize=query.list().size();
	    int totalPage=totalSize%pageSize!=0?(totalSize/pageSize+1):(totalSize/pageSize);
	    if(totalPage<1)totalPage=1;
	    
	    query.setMaxResults(pageSize);
	    query.setFirstResult((pageNum-1)*pageSize);
	    
        Pager<Department> departments= new Pager<Department>();
        List<Department> ass=query.list();
        departments.setDatas(ass);
        departments.setPageNum(pageNum);
        departments.setPageSize(pageSize);
        departments.setTotalPage(totalPage);
        departments.setTotalSize(totalSize);
	    return departments;  
	}

	@Transactional
	public void addDepartment(Department department) {
		sessionFactory.getCurrentSession().save(department);

	}

	public boolean delDepartment(int id) {
		String hql = "delete Department d where d.id = ?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setInteger(0, id);  

	    return (query.executeUpdate() > 0); 
	}

	public boolean updateDepartment(Department department) {
		String hql = "update Department d set r.department = ?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setString(0, department.getDeparment()); 

	    return (query.executeUpdate() > 0);
	}

}
