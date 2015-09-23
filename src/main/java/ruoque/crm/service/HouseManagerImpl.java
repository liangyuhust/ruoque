package ruoque.crm.service;

import org.springframework.stereotype.Service;
import ruoque.crm.dao.HouseDao;
import ruoque.crm.model.House;
import ruoque.crm.util.Pager;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liangyu on 9/23/15.
 */
@Service("houseManager")
public class HouseManagerImpl implements HouseManager {

    @Resource
    private HouseDao houseDao;

    public void setHouseDao(HouseDao houseDao) {
        this.houseDao = houseDao;
    }

    public House getHouse(int id) {
        return null;
    }

    public List<House> getAllHouse() {
        return null;
    }

    public Pager<House> getAllHouse(int pageNum, int pageSize) {
        return null;
    }

    public void addHouse(House call) {

    }

    public boolean delHouse(int id) {
        return false;
    }

    public boolean updateHouse(House call) {
        return false;
    }
}
