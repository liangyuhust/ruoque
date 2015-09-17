package ruoque.crm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ruoque.crm.dao.ComerDao;
import ruoque.crm.model.Comer;
import ruoque.crm.util.Pager;

@Service("comerManager")
public class ComerManagerImpl implements ComerManager {
	@Resource
	private ComerDao comerDao;

	public void setComerDao(ComerDao comerDao) {
		this.comerDao = comerDao;
	}

	public Comer getComer(int id) {
		return comerDao.getComer(id);
	}

	public List<Comer> getAllComer() {
		return comerDao.getAllComer();
	}

	public Pager<Comer> getAllComer(int pageNum, int pageSize) {
		return comerDao.getAllComer(pageNum, pageSize);
	}

	public void addComer(Comer comer) {
		comerDao.addComer(comer);
	}

	public boolean delComer(int id) {
		return comerDao.delComer(id);
	}

	public boolean updateComer(Comer comer) {
		return comerDao.updateComer(comer);
	}

}
