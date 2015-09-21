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

    public List<House> getAllHouse() {
        return null;
    }

    public Pager<House> getAllHouse(int pageNum, int pageSize) {
        return null;
    }

    public void addHouse(House house) {

    }

    public boolean delHouse(int id) {
        return false;
    }

    public boolean updateHouse(House house) {
        return false;
    }
}
