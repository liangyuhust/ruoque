package ruoque.crm.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ruoque.crm.model.SaleOrder;
import ruoque.crm.util.Pager;

@Repository("saleOrderDao")
public class SaleOrderDaoImpl implements SaleOrderDao {
	@Resource
	private SessionFactory sessionFactory;  

	public void setSessionFactory(SessionFactory sessionFactory) {  
	    this.sessionFactory = sessionFactory;
	}  

	@Transactional
	public SaleOrder getSaleOrder(int id) {
		String hql = "from SaleOrder s where s.id=?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setInteger(0, id);  

	    return (SaleOrder)query.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<SaleOrder> getAllSaleOrder() {
		String hql = "from SaleOrder";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  

	    return query.list();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public Pager<SaleOrder> getAllSaleOrder(int pageNum, int pageSize) {
		String hql = "from SaleOrder";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);
	    int totalSize=query.list().size();
	    int totalPage=totalSize%pageSize!=0?(totalSize/pageSize+1):(totalSize/pageSize);
	    if(totalPage<1)totalPage=1;
	    
	    query.setMaxResults(pageSize);
	    query.setFirstResult((pageNum-1)*pageSize);
	    
        Pager<SaleOrder> sales= new Pager<SaleOrder>();
        List<SaleOrder> ss=query.list();
        sales.setDatas(ss);
        sales.setPageNum(pageNum);
        sales.setPageSize(pageSize);
        sales.setTotalPage(totalPage);
        sales.setTotalSize(totalSize);
	    return sales;  
	}

	@Transactional
	public void addSaleOrder(SaleOrder saleOrder) {
		sessionFactory.getCurrentSession().save(saleOrder);
	}

	@Transactional
	public boolean delSaleOrder(int id) {
		String hql = "delete SaleOrder s where s.id = ?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setInteger(0, id);  

	    return (query.executeUpdate() > 0); 
	}

	@Transactional
	public boolean updateSaleOrder(SaleOrder sale) {
		String hql = "update SaleOrder s set s.name = ?,s.age=? where s.id = ?";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    query.setInteger(0, sale.getId());  

	    return (query.executeUpdate() > 0);
	}

}
