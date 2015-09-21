package ruoque.crm.dao;

import ruoque.crm.model.House;
import ruoque.crm.util.Pager;

import java.util.List;

/**
 * Created by liangyu on 9/23/15.
 */
public interface HouseDao {
    public House getHouse(int id);

    public List<House> getAllHouse();

    public Pager<House> getAllHouse(int pageNum,int pageSize);

    public void addHouse(House house);

    public boolean delHouse(int id);

    public boolean updateHouse(House house);
}
