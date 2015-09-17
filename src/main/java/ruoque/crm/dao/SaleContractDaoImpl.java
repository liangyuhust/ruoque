package ruoque.crm.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ruoque.crm.model.SaleContract;
import ruoque.crm.util.Pager;

@Repository("saleContractDaoDao")
public class SaleContractDaoImpl implements SaleContractDao {
	@Resource
	private SessionFactory sessionFactory;  

	public void setSessionFactory(SessionFactory sessionFactory) {  
	    this.sessionFactory = sessionFactory;
	}  

	@Transactional
	public SaleContract getSaleContract(int id) {
		String hql = "from SaleContract s where s.id=?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setInteger(0, id);  

	    return (SaleContract)query.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<SaleContract> getAllSaleContract() {
		String hql = "from SaleContract";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  

	    return query.list();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public Pager<SaleContract> getAllSaleContract(int pageNum, int pageSize) {
		String hql = "from SaleContract";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);
	    int totalSize=query.list().size();
	    int totalPage=totalSize%pageSize!=0?(totalSize/pageSize+1):(totalSize/pageSize);
	    if(totalPage<1)totalPage=1;
	    
	    query.setMaxResults(pageSize);
	    query.setFirstResult((pageNum-1)*pageSize);
	    
        Pager<SaleContract> afterSaless= new Pager<SaleContract>();
        List<SaleContract> ass=query.list();
        afterSaless.setDatas(ass);
        afterSaless.setPageNum(pageNum);
        afterSaless.setPageSize(pageSize);
        afterSaless.setTotalPage(totalPage);
        afterSaless.setTotalSize(totalSize);
	    return afterSaless;  
	}

	@Transactional
	public void addSaleContract(SaleContract saleContract) {
		sessionFactory.getCurrentSession().save(saleContract);
		
	}

	@Transactional
	public boolean delSaleContract(int id) {
		String hql = "delete SaleContract s where s.id = ?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setInteger(0, id);  

	    return (query.executeUpdate() > 0); 
	}

	@Transactional
	public boolean updateSaleContract(SaleContract saleContract) {
		String hql = "update SaleContract s set s.orderName = ?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setString(0, saleContract.getOrderName()); 

	    return (query.executeUpdate() > 0);
	}

}
