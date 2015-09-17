package ruoque.crm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ruoque.crm.model.SaleOrder;
import ruoque.crm.service.SaleOrderManager;
import ruoque.crm.util.Pager;
import ruoque.crm.util.Status;

@Controller
@RequestMapping(value="/order")
public class SaleOrderController {
	@Resource
	private SaleOrderManager saleOrderManager;

	public void setSaleManager(SaleOrderManager saleOrderManager) {
		this.saleOrderManager = saleOrderManager;
	}
	
	@RequestMapping(value="/orders",method=RequestMethod.GET,params="json")
	@ResponseBody
	public Pager<SaleOrder> list(Model model){
		return saleOrderManager.getAllSaleOrder(1, 10);
	}

	@RequestMapping(value="/add",method=RequestMethod.GET)
	@ResponseBody
	public Status add(@ModelAttribute("saleOrder") SaleOrder saleOrder){
	    Status s=new Status();
		try {
			saleOrderManager.addSaleOrder(saleOrder);;
		    s.setStatus("success");
		    s.setMsg("成功增加角色!");
			return s;
		} catch (Exception e) {
			s.setStatus("fail");
			s.setMsg("增加角色失败!");
			return s;
		}
		
	}
}
