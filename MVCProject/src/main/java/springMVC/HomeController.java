package springMVC;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/add")
	public ModelAndView Home(@RequestParam("email")String email,@RequestParam("password")String password,Model model,HttpServletRequest request) {
		System.out.println("calling Controller");
//		model.addAttribute("name","Yashas Rai");
//		model.addAttribute("USN","1vk17cv032");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name","Yashas Rai");
		modelAndView.addObject("USN","1vk17cv032");
		modelAndView.addObject("email",request.getParameter("email"));
		modelAndView.addObject("password",password);
		

		
		modelAndView.setViewName("home");
		
		
        return modelAndView;
		
	}
	@RequestMapping("/get")
	public String watch(Model model,HttpServletRequest request) {
		System.out.println("calling 2nd Controller");
		model.addAttribute("name","Shanul Huda");
		model.addAttribute("address","Hsr layout");
		model.addAttribute("email",request.getParameter("email"));
		model.addAttribute("password",request.getParameter("password"));
		return "watch";

	}
	
	@RequestMapping(value="/form", method = RequestMethod.POST)
//	public String fillform(@RequestParam("email") String mail,@RequestParam("password") String password,@RequestParam("checkbox") Boolean check,HttpServletRequest request,Model model) {
//	public String fillform(HttpServletRequest request) {
	public String fillform(@ModelAttribute Login login,HttpServletRequest request,Model model) {
//	System.out.println(mail);
//		System.out.println(password);
//		if(check!=null) {
//		System.out.println(check);}
//		System.out.println(request.getParameter("password"));
		model.addAttribute("email",request.getParameter("email"));
		model.addAttribute("password",request.getParameter("password"));
		System.out.println("This email fetching directly   " +login.getEmail());
		System.out.println("This checkbox fetching directly   " +login.getChechbox());
		
		
		
		return "redirect:/add";
		
	}
	@RequestMapping("/complex")
	public String addForm(@ModelAttribute ComplexForm complexForm,HttpServletRequest request,Model model) {
		System.out.println(complexForm.getFirstName());
		System.out.println(complexForm.getLastName());
		System.out.println(complexForm.getZipcode());
		System.out.println(complexForm.getState());
		System.out.println(complexForm.getCourse());
		System.out.println(complexForm.getMulti());
		System.out.println(complexForm.getExampleRadios());
		
		
	return "watch2";
	}

}
