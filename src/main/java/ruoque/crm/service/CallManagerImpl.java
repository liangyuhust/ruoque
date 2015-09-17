package ruoque.crm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ruoque.crm.dao.CallDao;
import ruoque.crm.model.Call;
import ruoque.crm.util.Pager;

@Service("callManager")
public class CallManagerImpl implements CallManager {
	
	@Resource
	private CallDao callDao;

	public void setCallDao(CallDao callDao) {
		this.callDao = callDao;
	}

	public Call getCall(int id) {
		return callDao.getCall(id);
	}

	public List<Call> getAllCall() {
		return callDao.getAllCall();
	}

	public Pager<Call> getAllCall(int pageNum, int pageSize) {
		return callDao.getAllCall(pageNum, pageSize);
	}

	public void addCall(Call call) {
		callDao.addCall(call);
	}

	public boolean delCall(int id) {
		return callDao.delCall(id);
	}

	public boolean updateCall(Call call) {
		return callDao.updateCall(call);
	}

}
