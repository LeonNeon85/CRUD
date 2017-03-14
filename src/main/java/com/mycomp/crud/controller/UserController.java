package com.mycomp.crud.controller;

import com.mycomp.crud.model.User;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {
		
		private static UserBo userBo = UserHibernateController.getUserBo();
	
	 	@RequestMapping(value = "/", method = RequestMethod.GET)
	    public String index() {
	        return "index";
	    }
	 
	    @RequestMapping(value = "user", method = RequestMethod.GET)
	    public ModelAndView user() {
	        return new ModelAndView("user", "command", new User());
	    }
	        
	        

	    @RequestMapping(value = "addUser", method = RequestMethod.POST)
	    public String addUser(@ModelAttribute("mvc-dispatcher") User user,
	                             ModelMap model) {
	    	    	
	    	if (userBo.searhUser(user).isEmpty()) {
	    		
	    		// Add to DB
	    		userBo.create(user);		    	
		        model.addAttribute("id", user.getId());
		        model.addAttribute("name", user.getName());
		        model.addAttribute("age", user.getAge());
		        model.addAttribute("admin", user.getAdmin()); 
		        return "result";
	    	} else {
	    		model.addAttribute("textMessage", "User is alredy created.");
	    		return "message";
	    	}	
	    }
	    
	    	    	    
	    //////////////////	    
	    @RequestMapping(value = "update", method = RequestMethod.POST)
	    public String updateUser(@ModelAttribute("mvc-dispatcher") User user, ModelMap model) {  
	    
	    	List<User> users = userBo.searhUser(user);
	    	if (users.isEmpty()) {
	    		model.addAttribute("textMessage", "User does not exist.");
	    		return "message";
	    	}
	    	// получаю юзера с БД с заполненным ID
	    	user = users.get(0);
	    	
	    	 model.addAttribute("id", user.getId());
		     model.addAttribute("name", user.getName());
		     model.addAttribute("age", user.getAge());
		     model.addAttribute("admin", user.getAdmin());
		     model.addAttribute("createdDate", user.getCreatedDate()); 
		     
	        return "update";
	    }
	    
	    @RequestMapping(value = "updateUser", method = RequestMethod.POST)
	    public String updateUserSubmit(@ModelAttribute("mvc-dispatcher") User newUser, ModelMap model, 
	    		@RequestParam(name = "id", required = false) Integer id) {  
	    
	    	userBo.update(id, newUser);
		     
	    	model.addAttribute("textMessage", "User data updated.");
    		return "message";
	    }
	    
	    
	    
	    
	    //////////////////
	    
	      
	    @RequestMapping(value = "searchUser", method = RequestMethod.POST)
	    public String searchUser(@ModelAttribute("mvc-dispatcher") User user, ModelMap model) { 
	    	
	    	if (!checkDate(user)) {
	    		model.addAttribute("textMessage", "Data is incorrect.");
	    		return "message";
	    	}	
	    	    	
	    	List<User> find = userBo.searhUser(user);
	    	
	    	if (find.isEmpty()) {
	    		model.addAttribute("textMessage", "User didn't found.");
	    		return "message";
	    	}
	    	
	    	
	    	if (!find.isEmpty() && find.get(0) != null) {
	    		model.addAttribute("userList", find);		       		    	
	    	}	    	
	    		    	
	    	return "search";
	    }
	    
	    
	    @RequestMapping(value = "deleteUser", method = RequestMethod.POST)
	    public String deleteUser(@ModelAttribute("mvc-dispatcher") User user,
	                             ModelMap model) {
	    
	    	List<User> users = userBo.searhUser(user);
	    	if (users.isEmpty()) {
	    		model.addAttribute("textMessage", "User does not exist.");
	    		return "message";
	    	}
	    	   	
	    	userBo.delete(users.get(0));
	    	
	    	model.addAttribute("textMessage", "User is deleted.");
    		return "message";	    	
	    }
	    
	    
	    //////////////////////////////////
	    
	    @RequestMapping(value = "/showAllUsers", method = RequestMethod.POST)	    
	    public String showAllUsers(@ModelAttribute("mvc-dispatcher") User user,
	                             ModelMap model 	                            
	                            ,@RequestParam(name = "page", required = false) Integer page) {
	    	//int page = 1;
	    	int recordsPerPage = 10;	    	
	    	
	    	List<User> users = userBo.showAllUsers();	
	    	
	    	int noOfRecords = users.size();
	    	int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);   		
	    	
	    	if (page == null || page == 0) {
	    		page = 1;
	    	}
	    	
	    	int fromIndex =(page-1) * recordsPerPage;
	    	int toIndex = page * recordsPerPage;
	    	
	    	if (toIndex > noOfRecords) {
	    		toIndex = noOfRecords;
	    	}
	    	
	    	List<User> listUsersPerPage = users.subList(fromIndex, toIndex);   
	    	
	    	model.addAttribute("userList", listUsersPerPage);
	    	model.addAttribute("noOfPages", noOfPages);
	    	model.addAttribute("currentPage", page);  
	    	model.addAttribute("noOfRecords", noOfRecords);  
	    	
	        return "showAll";
	    }
	 
	    
	    @RequestMapping(value = "/showAllUsers", method = RequestMethod.GET)	    
	    public String showAllUsersGet(@ModelAttribute("mvc-dispatcher") User user,
	                             ModelMap model 	                            
	                            ,@RequestParam(name = "page", required = false) Integer page) {	    	
	    	return showAllUsers(user, model, page);  
	    }
	    
	  	    
	    
	    private boolean checkDate(User user) {
	    	if (user.getName().isEmpty() || user.getName() == null || user == null) {
	    		return false;
	    	}   	
	    		    	
	    	if (user.getAge() == 0) {	    		
	    	}	    	
	    	return true;
	    }
	    
	    
}
