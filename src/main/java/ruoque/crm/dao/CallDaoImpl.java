package ruoque.crm.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ruoque.crm.model.Call;
import ruoque.crm.util.Pager;

@Repository("callDao")
public class CallDaoImpl implements CallDao {
	@Resource
	private SessionFactory sessionFactory;  

	public void setSessionFactory(SessionFactory sessionFactory) {  
	    this.sessionFactory = sessionFactory;
	}  

	@Transactional
	public Call getCall(int id) {
		String hql = "from Call c where c.id=?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setInteger(0, id);  

	    return (Call)query.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Call> getAllCall() {
		String hql = "from Call";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  

	    return query.list();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public Pager<Call> getAllCall(int pageNum, int pageSize) {
		String hql = "from Call";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);
	    int totalSize=query.list().size();
	    int totalPage=totalSize%pageSize!=0?(totalSize/pageSize+1):(totalSize/pageSize);
	    if(totalPage<1)totalPage=1;
	    
	    query.setMaxResults(pageSize);
	    query.setFirstResult((pageNum-1)*pageSize);
	    
        Pager<Call> calls= new Pager<Call>();
        List<Call> cs=query.list();
        calls.setDatas(cs);
        calls.setPageNum(pageNum);
        calls.setPageSize(pageSize);
        calls.setTotalPage(totalPage);
        calls.setTotalSize(totalSize);
	    return calls;  
	}

	@Transactional
	public void addCall(Call call) {
		sessionFactory.getCurrentSession().save(call);
		
	}

	@Transactional
	public boolean delCall(int id) {
		String hql = "delete Call c where c.id = ?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setInteger(0, id);  

	    return (query.executeUpdate() > 0); 
	}

	@Transactional
	public boolean updateCall(Call call) {
		String hql = "update Call c set c.name = ?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setString(0, call.getName()); 

	    return (query.executeUpdate() > 0);
	}

}
