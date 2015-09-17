package ruoque.crm.controller;

import java.security.MessageDigest;
import java.util.Date;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ruoque.crm.model.Staff;
import ruoque.crm.service.StaffManager;
import ruoque.crm.util.Status;

@Controller
public class StaffLoginController {

	@Resource
	private StaffManager staffManager;  

	public void setStaffManager(StaffManager staffManager) {
		this.staffManager = staffManager;
	}

	private static String getRandomString(int length) { //length表示生成字符串的长度
	    String base = "abcdefghijklmnopqrstuvwxyz0123456789";   
	    Random random = new Random();   
	    StringBuffer sb = new StringBuffer();   
	    for (int i = 0; i < length; i++) {   
	        int number = random.nextInt(base.length());   
	        sb.append(base.charAt(number));   
	    }
	    return sb.toString();   
	 }  
	
	private final static String MD5(String s) {
        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};       
        try {
            byte[] btInput = s.getBytes();
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

	/**
	 *
	 * @param staff
	 *
	 * @return
	 */
	@RequestMapping(value="/reg",method=RequestMethod.POST)
	@ResponseBody
	public Status reg(@ModelAttribute("staff") Staff staff){
		String salt=getRandomString(5);
		String password=MD5(staff.getPassword()+salt);
		staff.setSalt(salt);
		staff.setPassword(password);
		Date created_at= new Date();   
		staff.setCreated_at(created_at);
		Status s=new Status();
		try {
			staffManager.addStaff(staff);
		    s.setStatus("success");
		    s.setMsg("成功增加角色!");
			return s;
		} catch (Exception e) {
			s.setStatus("fail");
			s.setMsg("增加角色失败!");
			return s;
		}
	}
	
	@RequestMapping(value={"/login","/"},method=RequestMethod.GET)
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="/attempt",method=RequestMethod.POST)
	public String attempt(@RequestParam("username") String username,
			@RequestParam("password") String password,
			HttpServletRequest request,HttpServletResponse response){
		if(username==null||username.length()<1){
			return "redirect:/login";
		}
		if(password==null||password.length()<1){
			return "redirect:/login";
		}
		Staff staff=staffManager.getStaffByStaffNo(username);
		if(staff==null){
			return "redirect:/login";
		}
		String pwd=MD5((password+staff.getSalt()));
		if(pwd.equals(staff.getPassword())){
			ObjectMapper objectMapper =new ObjectMapper();
			Cookie cookie;
			try {
				cookie = new Cookie("_staff", objectMapper.writer().writeValueAsString(staff));
				response.addCookie(cookie);
				} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
			return "redirect:/showWorkBench";
		}else{
			return "redirect:/login";
		}
		
	}
	
	
	@RequestMapping(value="/showWorkBench",method=RequestMethod.GET)
	public String showWorkBench(final String msg){
		return "showWorkBench";
	}
	
	
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logout(HttpServletRequest request,HttpServletResponse response){
		Cookie[] cookies=request.getCookies();
		for(Cookie cookie:cookies){
			if(cookie.getName().equals("_staff")){
				cookie.setMaxAge(0);
				break;
			}
		}
		return "redirect:/login";
	}
}
