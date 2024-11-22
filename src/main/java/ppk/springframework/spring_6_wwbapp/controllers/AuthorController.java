package ppk.springframework.spring_6_wwbapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ppk.springframework.spring_6_wwbapp.services.AuthorService;
import ppk.springframework.spring_6_wwbapp.services.BookService;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {

        model.addAttribute("authors", authorService.findAll());

        return "authors";
    }
}
