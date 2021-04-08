package handler.springframework.springpetsplayground.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Evan on 4/7/2021
 */
@Controller
public class OwnersController {
    @RequestMapping({"/owners", "/owners/index", "/owners/index.html"})
    public String listowner() {
        return "owners/index";
    }
}
