package ruoque.crm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ruoque.crm.model.Role;
import ruoque.crm.service.RoleManager;
import ruoque.crm.util.Pager;
import ruoque.crm.util.Status;

@Controller
@RequestMapping(value="role")
public class RoleController {

	@Resource
	private RoleManager roleManager;

	public void setRoleManager(RoleManager roleManager) {
		this.roleManager = roleManager;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	@ResponseBody
	public Status add(@ModelAttribute("role") Role role){
	    Status s=new Status();
		try {
			roleManager.addRole(role);
		    s.setStatus("success");
		    s.setMsg("成功增加角色!");
			return s;
		} catch (Exception e) {
			s.setStatus("fail");
			s.setMsg("增加角色失败!");
			return s;
		}
		
	}
	
	@RequestMapping(value="/roles",method=RequestMethod.GET,params="json")
	@ResponseBody
	public Pager<Role> list(@RequestParam("page") int page,@RequestParam("size") int size){
		return roleManager.getAllRole(page, size);
	}
	
}
