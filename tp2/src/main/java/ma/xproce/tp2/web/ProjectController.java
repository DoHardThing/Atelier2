package ma.xproce.tp2.web;

import ma.xproce.tp2.dao.entities.Creator;
import ma.xproce.tp2.service.CreatorManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
public class ProjectController {
    @Autowired
    private CreatorManager creatorManager;
    //get index
    @GetMapping("/index")
    public String acceuil(Model model) {
        List<Creator> creators= creatorManager.getAllCreator();
        model.addAttribute("listCreators", creators);
        return "index";
    }
    @GetMapping("")
    public String acceuil1() {
        return "redirect:/index";
    }

    //get details Creator
    @GetMapping("detailsCreator")
    public String detailCreator(Model model,
                                @RequestParam(name = "id") Integer id) {

        Creator creator = creatorManager.getCreatorById(id);
        model.addAttribute("creatorWithDetails", creator);
        return "detailCreator" ;
    }

    //get ajouterProduit



    //post ajouterProduit
}
