package ruoque.crm.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ruoque.crm.model.Staff;
import ruoque.crm.util.Pager;

@Repository("staffDao")
public class StaffDaoImpl implements StaffDao {
	
	@Resource
	private SessionFactory sessionFactory;  

	public void setSessionFactory(SessionFactory sessionFactory) {  
	    this.sessionFactory = sessionFactory;
	}  

	@Transactional
	public Staff getStaff(int id) {
		String hql = "from Staff s where s.id=?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setInteger(0, id);  

	    return (Staff)query.uniqueResult();  
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Staff> getAllStaff() {
		String hql = "from Staff";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  

	    return query.list();  
	}

	@Transactional
	public void addStaff(Staff staff) {
		 sessionFactory.getCurrentSession().save(staff);  
		
	}

	@Transactional
	public boolean delStaff(int id) {
		String hql = "delete Staff s where s.id = ?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setInteger(0, id);  

	    return (query.executeUpdate() > 0);  
	}

	@Transactional
	public boolean updateStaff(Staff staff) {
		String hql = "update Staff s set s.name = ? where s.id = ?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setString(0, staff.getName());  
	    query.setLong(2, staff.getId());  

	    return (query.executeUpdate() > 0);  
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public Pager<Staff> getAllStaff(int pageNum, int pageSize) {
		String hql = "from Staff";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);
	    int totalSize=query.list().size();
	    int totalPage=totalSize%pageSize!=0?(totalSize/pageSize+1):(totalSize/pageSize);
	    if(totalPage<1)totalPage=1;
	    query.setMaxResults(pageSize);
	    query.setFirstResult((pageNum-1)*pageSize);
	    
        Pager<Staff> staffs= new Pager<Staff>();
        List<Staff> ss=query.list();
        staffs.setDatas(ss);
        staffs.setPageNum(pageNum);
        staffs.setPageSize(pageSize);
        staffs.setTotalPage(totalPage);
        staffs.setTotalSize(totalSize);
	    return staffs;  
	}

	@Transactional
	public Staff getStaffByStaffNo(String staffNo) {
		String hql = "from Staff s where s.staffNo=?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setString(0, staffNo);  

	    return (Staff)query.uniqueResult();
	}

}
