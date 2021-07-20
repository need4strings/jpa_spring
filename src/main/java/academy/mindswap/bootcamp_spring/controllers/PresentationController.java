package academy.mindswap.bootcamp_spring.controllers;

import academy.mindswap.bootcamp_spring.services.PresentationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PresentationController {

    private PresentationService service;

    @GetMapping("/presentations")
    public String getPresentations(Model model) {
        model.addAttribute("presentations", service.getPresentations());
        //model.addAttribute("presentations", presentationThemeService.getPresentationThemes());
        return "presentations";
    }

    @Autowired
    public void setService(PresentationService service) {
        this.service = service;
    }
}