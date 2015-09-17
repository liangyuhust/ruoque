package ruoque.crm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ruoque.crm.model.Staff;
import ruoque.crm.service.StaffManager;
import ruoque.crm.util.Pager;

@Controller
@RequestMapping(value="/staff")
public class StaffController {

	@Resource
	private StaffManager staffManager;  

	public void setStaffManager(StaffManager staffManager) {
		this.staffManager = staffManager;
	}

	@RequestMapping(value="/staffs",method=RequestMethod.GET,params="json")
	@ResponseBody
	public Pager<Staff> list(Model model){
		return staffManager.getAllStaff(1, 10);
	}
	
}
