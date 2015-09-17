package ruoque.crm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ruoque.crm.model.Comer;
import ruoque.crm.service.ComerManager;
import ruoque.crm.util.Pager;
import ruoque.crm.util.Status;

@Controller
@RequestMapping(value="/comer")
public class ComerController {

	@Resource
	private ComerManager comerManager;

	public void setComerManager(ComerManager comerManager) {
		this.comerManager = comerManager;
	}
	
	@RequestMapping(value="/comers",method=RequestMethod.GET,params="json")
	@ResponseBody
	public Pager<Comer> list(@RequestParam("page") int page,@RequestParam("size") int size){
		System.out.println(page);
		System.out.println(size);
		return comerManager.getAllComer(page, size);
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	@ResponseBody
	public Status add(@ModelAttribute("comer") Comer comer){
		Status s=new Status();
		try {
			comerManager.addComer(comer);
			s.setStatus("success");
		    s.setMsg("成功增加来人信息!");
			return s;
		} catch (Exception e) {
			s.setStatus("fail");
			s.setMsg("增加来人信息失败!");
			return s;
		}
	}
}
