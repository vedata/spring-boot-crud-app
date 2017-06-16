package mtc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import mtc.app.Repository.MtcRepository;
import mtc.app.model.EventSeverityDowngrade;

@Controller
public class MtcController {
	@Autowired
	MtcRepository repository;
	
	@RequestMapping("/home")
	public String home(){
		return "home";
	    }
	
	@RequestMapping(value={"/login"})
	public String login(){
	    return "login";
	    }
	
    @RequestMapping(value="/403")
    public String Error403(){
        return "403";
    }
    
    @RequestMapping(value={"/welcome"}, method = RequestMethod.GET)
    public String welcome(){
        return "welcome";
    }
    

    @RequestMapping("/show")
    public String messages(Model model) {
        model.addAttribute("maintenance", repository.findAll());
        return "showmtc";
    }
		
    
    @RequestMapping(value = "/maintenance", method = RequestMethod.POST )
    @ResponseBody
    public String saveCustomer(@RequestParam String hostname, @RequestParam String source) {
    	repository.save(new EventSeverityDowngrade(hostname, source));
    	System.out.println(hostname);
    	return "redirect:/show";
    }
    
	@RequestMapping("/findbyid")
	public String findById(@RequestParam("id") Long id, Model model){
		EventSeverityDowngrade result = null;
	    model.addAttribute("maintenance", repository.findOne(id));
		return "/showmtc";
	}
	
	@RequestMapping("/findbyhostname")
	public String fetchDataByHostname(@RequestParam("hostname") String hostname, Model model){
	    model.addAttribute("maintenance", repository.findByHostname(hostname));
		return "/showmtc";
	}
    
 }
