package ruoque.crm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ruoque.crm.model.Call;
import ruoque.crm.service.CallManager;
import ruoque.crm.util.Pager;
import ruoque.crm.util.Status;

@Controller
@RequestMapping(value="/call")
public class CallController {

	@Resource
	private CallManager callManager;

	public void setCallManager(CallManager callManager) {
		this.callManager = callManager;
	}
	
	@RequestMapping(value="/calls",method=RequestMethod.GET,params="json")
	@ResponseBody
	public Pager<Call> list(@RequestParam("page") int page,@RequestParam("size") int size){
		return callManager.getAllCall(page, size);
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	@ResponseBody
	public Status add(@ModelAttribute("call") Call call){
		Status s=new Status();
		try {
			callManager.addCall(call);
		    s.setStatus("success");
		    s.setMsg("成功增加来电信息!");
			return s;
		} catch (Exception e) {
			s.setStatus("fail");
			s.setMsg("增加来电信息失败!");
			return s;
		}
	}
}
