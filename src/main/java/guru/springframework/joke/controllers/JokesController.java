package guru.springframework.joke.controllers;

import guru.springframework.joke.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokesService jokesService;

    @Autowired
    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String getAuthors(Model model){
        model.addAttribute("joke", jokesService.getJoke());
        return "chucknorris";
    }
}
