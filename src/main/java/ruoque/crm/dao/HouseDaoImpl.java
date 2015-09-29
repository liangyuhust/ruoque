package ruoque.crm.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ruoque.crm.model.House;
import ruoque.crm.util.Pager;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liangyu on 9/23/15.
 */

@Repository("HouseDao")
public class HouseDaoImpl implements HouseDao {

    @Resource
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public House getHouse(int id) {
        String hql = "from House h where h.id=?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setInteger(0, id);

        return (House)query.uniqueResult();
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<House> getAllHouse() {
        String hql = "from House";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);

        return query.list();
    }

    @Transactional
    public Pager<House> getAllHouse(int pageNum, int pageSize) {
        String hql = "from House";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        int totalSize=query.list().size();
        int totalPage=totalSize%pageSize!=0?(totalSize/pageSize+1):(totalSize/pageSize);
        if(totalPage<1)totalPage=1;

        query.setMaxResults(pageSize);
        query.setFirstResult((pageNum-1)*pageSize);

        Pager<House> houses= new Pager<House>();
        List<House> hs=query.list();
        houses.setDatas(hs);
        houses.setPageNum(pageNum);
        houses.setPageSize(pageSize);
        houses.setTotalPage(totalPage);
        houses.setTotalSize(totalSize);
        return houses;
    }

    @Transactional
    public void addHouse(House house) {
        sessionFactory.getCurrentSession().save(house);
    }

    @Transactional
    public boolean delHouse(int id) {
        String hql = "delete House h where h.id = ?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setInteger(0, id);

        return (query.executeUpdate() > 0);
    }

    @Transactional
    public boolean updateHouse(House house) {
        String hql = "update House h set h.building = ?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setString(0, house.getBuilding());

        return (query.executeUpdate() > 0);
    }
}
