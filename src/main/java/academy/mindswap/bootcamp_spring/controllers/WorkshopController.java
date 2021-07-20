package academy.mindswap.bootcamp_spring.controllers;

import academy.mindswap.bootcamp_spring.services.WorkshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkshopController {

    private WorkshopService service;

    @GetMapping("/workshops")
    public String getWorkshops(Model model) {
        model.addAttribute("workshops", service.getWorkshops());
        //model.addAttribute("presentations", presentationThemeService.getPresentationThemes());
        return "workshops";
    }

    @Autowired
    public void setService(WorkshopService service) {
        this.service = service;
    }

}