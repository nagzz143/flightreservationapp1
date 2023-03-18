package com.flight_reservation_app_1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_reservation_app_1.Repository.UserRepository;
import com.flight_reservation_app_1.entity.User;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping("/showLoginPage")
	public String showLoginPage() {
		return "login/login";
	}
	
	@RequestMapping("/showReg")
	public String showReg() {
		return"login/showReg";
	}
	
	@RequestMapping("/saveReg")
    public String saveReg(@ModelAttribute("user")User user) {
		userRepo.save(user);
	    return "login/login";
	}
	
	@RequestMapping("/verifyLogin")    
	public String verifyLogin(@RequestParam("emailId")String emailId, @RequestParam("password") String password, ModelMap ModelMap) {
		User user = userRepo.findByEmail(emailId);
		if(user!=null) {
		if(user.getEmail().equals(emailId) && user.getPassword().equals(password)){
		     return "findFlights";
	    }else {
	    	ModelMap.addAttribute("error","invalid username / password");
	    	 return "login/login";
	    }
		}else {
			ModelMap.addAttribute("error","invalid username / password");
	    	 return "login/login";
			
		}
}
	
}



	


