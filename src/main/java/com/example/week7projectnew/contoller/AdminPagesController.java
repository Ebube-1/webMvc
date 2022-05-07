package com.example.week7projectnew.contoller;

import com.example.week7projectnew.models.PageRepository;
import com.example.week7projectnew.models.data.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/admin/pages")
public class AdminPagesController {

    @Autowired
    private PageRepository pageRepo;

//    public AdminPagesController(PageRepository pageRepo) {
//        this.pageRepo = pageRepo;
//    }

    @GetMapping
    public String index(Model model){
        List<Page> pages = pageRepo.findAll();
        model.addAttribute("pages", pages);
        return"admin/pages/index";
    }

    @GetMapping("/add")
    public String add(@ModelAttribute Page page){
        //model.addAttribute("page", new Page());

        return "admin/pages/add";
    }

    public String add(@Valid Page page, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){

        if(bindingResult.hasErrors()){
            return "admin/pages/add";
        }
        return null;
    }

}
