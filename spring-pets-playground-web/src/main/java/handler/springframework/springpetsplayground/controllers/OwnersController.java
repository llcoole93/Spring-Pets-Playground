package handler.springframework.springpetsplayground.controllers;

import handler.springframework.springpetsplayground.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Evan on 4/7/2021
 */
@Controller
public class OwnersController {

    private final OwnerService ownerService;

    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners", "/owners/index", "/owners/index.html"})
    public String listowner(Model model) {
        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }
}
