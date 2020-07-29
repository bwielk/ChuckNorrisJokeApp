package webapplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import webapplication.services.ChuckNorrisJokeService;

@Controller
public class ChuckNorrisController {

    private ChuckNorrisJokeService chuckNorrisJokeService;

    @Autowired
    public ChuckNorrisController(ChuckNorrisJokeService chuckNorrisJokeService){
        this.chuckNorrisJokeService = chuckNorrisJokeService;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model){
        String joke =  chuckNorrisJokeService.getRandomQuote();
        model.addAttribute("joke", joke);
        return "chucknorris";  // name of the template to return
    }

}
