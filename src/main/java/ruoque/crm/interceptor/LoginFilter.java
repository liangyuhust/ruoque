package ruoque.crm.interceptor;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

import ruoque.crm.model.Staff;

import com.fasterxml.jackson.databind.ObjectMapper;

public class LoginFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
        String[] notFilter = new String[] {"/login","/attempt"};  
        String uri = request.getRequestURI();  
        boolean doFilter = true;  
        for (String s : notFilter) {  
            if (uri.indexOf(s)==-1) {  
                doFilter = false;  
                break;  
            }  
        }  
        if (doFilter) {  
        	Cookie[] cookies=request.getCookies();
    		boolean isStaff=false;
    		for(Cookie cookie:cookies){
    			if(cookie.getName().equals("_staff")){
    				ObjectMapper objectMapper =new ObjectMapper();
    				Staff staff=objectMapper.readValue(cookie.getValue(), Staff.class);
    				System.out.println("你好"+staff.getPhone());
    				isStaff=true; 
    				break;
    			}
    		}
    		if(isStaff){
    			filterChain.doFilter(request, response);
    		}else{
    			response.sendRedirect("/login");
    		}
        } else {  
            filterChain.doFilter(request, response);  
        }   
	}

}
