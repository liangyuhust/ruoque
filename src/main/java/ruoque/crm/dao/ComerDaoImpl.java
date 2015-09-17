package ruoque.crm.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ruoque.crm.model.Comer;
import ruoque.crm.util.Pager;

@Repository("comerDao")
public class ComerDaoImpl implements ComerDao {
	@Resource
	private SessionFactory sessionFactory;  

	public void setSessionFactory(SessionFactory sessionFactory) {  
	    this.sessionFactory = sessionFactory;
	}  

	@Transactional
	public Comer getComer(int id) {
		String hql = "from Comer c where c.id=?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setInteger(0, id);  

	    return (Comer)query.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Comer> getAllComer() {
		String hql = "from Comer";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  

	    return query.list();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public Pager<Comer> getAllComer(int pageNum, int pageSize) {
		String hql = "from Comer";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);
	    int totalSize=query.list().size();
	    int totalPage=totalSize%pageSize!=0?(totalSize/pageSize+1):(totalSize/pageSize);
	    if(totalPage<1)totalPage=1;
	    
	    query.setMaxResults(pageSize);
	    query.setFirstResult((pageNum-1)*pageSize);
	    
        Pager<Comer> comers= new Pager<Comer>();
        List<Comer> cs=query.list();
        comers.setDatas(cs);
        comers.setPageNum(pageNum);
        comers.setPageSize(pageSize);
        comers.setTotalPage(totalPage);
        comers.setTotalSize(totalSize);
	    return comers;  
	}

	@Transactional
	public void addComer(Comer comer) {
		sessionFactory.getCurrentSession().save(comer);
	}

	@Transactional
	public boolean delComer(int id) {
		String hql = "delete Comer c where c.id = ?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setInteger(0, id);  

	    return (query.executeUpdate() > 0); 
	}

	@Transactional
	public boolean updateComer(Comer comer) {
		String hql = "update Comer c set c.name = ?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setString(0, comer.getName()); 

	    return (query.executeUpdate() > 0);
	}

}
