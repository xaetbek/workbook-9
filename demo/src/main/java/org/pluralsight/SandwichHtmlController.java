package org.pluralsight;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SandwichHtmlController {
    @GetMapping("/sandwich-html")
    public String sandwichPage(Model model) {
        model.addAttribute("sandwich", "Grilled Cheese with Tomato 🍅🧀");
        return "sandwich";  // maps to sandwich.html
    }

    @GetMapping("/movies-html")
    public String moviePage(Model model) {
        model.addAttribute("movies", "The Godfather II");
        return "movies";  // maps to movies.html
    }
}