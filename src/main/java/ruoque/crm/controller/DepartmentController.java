package ruoque.crm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ruoque.crm.model.Department;
import ruoque.crm.service.DepartmentManager;
import ruoque.crm.util.Pager;
import ruoque.crm.util.Status;

@Controller
@RequestMapping(value="/department")
public class DepartmentController {
	@Resource
	private DepartmentManager departmentManager;

	public void setDepartmentManager(DepartmentManager departmentManager) {
		this.departmentManager = departmentManager;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	@ResponseBody
	public Status addDepartment(@ModelAttribute("department") Department department){
		Status s=new Status();
		try {
			departmentManager.addDepartment(department);
		    s.setStatus("success");
		    s.setMsg("成功增加部门或分子公司!");
			return s;
		} catch (Exception e) {
			s.setStatus("fail");
			s.setMsg("增加部门或分子公司失败!");
			return s;
		}
	}
	
	@RequestMapping(value="/departments",method=RequestMethod.GET,params="json")
	@ResponseBody
	public Pager<Department> list(@RequestParam("page") int page,@RequestParam("size") int size){
		return departmentManager.getAllDepartment(page, size);
	}

}
