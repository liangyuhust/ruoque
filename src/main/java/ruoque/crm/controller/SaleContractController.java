package ruoque.crm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ruoque.crm.model.SaleContract;
import ruoque.crm.service.SaleContractManager;
import ruoque.crm.util.Pager;
import ruoque.crm.util.Status;

@Controller
@RequestMapping(value="/contract")
public class SaleContractController {

	@Resource
	private SaleContractManager saleContractManager;

	public void setAfterSalesManager(SaleContractManager saleContractManager) {
		this.saleContractManager = saleContractManager;
	}
	
	@RequestMapping(value="/contracts",method=RequestMethod.GET,params="json")
	@ResponseBody
	public Pager<SaleContract> list(Model model){
		return saleContractManager.getAllSaleContract(1, 10);
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	@ResponseBody
	public Status add(@ModelAttribute("saleContract") SaleContract saleContract){
	    Status s=new Status();
		try {
			saleContractManager.addSaleContract(saleContract);
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
