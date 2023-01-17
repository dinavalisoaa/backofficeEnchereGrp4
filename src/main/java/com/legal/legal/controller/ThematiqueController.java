//package com.legal.legal.controller;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.legal.legal.model.Thematique;
//import com.legal.legal.repository.ThematiqueRepository;
//
//@Controller
//public class ThematiqueController {
//    @Autowired
//    ThematiqueRepository tRep;
//
//    @RequestMapping("/thematique")
//    public String Save(HttpServletRequest request, Model model) {
//        if (request.getParameter("nomThematique") != null) {
//            Thematique t = new Thematique();
//            t.setNomThematique(request.getParameter("nomThematique"));
//            tRep.Save(t);
//        }
//        if (request.getParameter("id") != null && request.getParameter("nomThematique") != null) {
//            Thematique thematique = new Thematique();
//            thematique.setId(Integer.parseInt(request.getParameter("id")));
//            thematique.setNomThematique(request.getParameter("nomThematique"));
//            tRep.Update(thematique);
//        }
//        model.addAttribute("content", "thematique");
//        model.addAttribute("contentpath", "View/thematique");
//        if (request.getParameter("idSupp") != null) {
//            tRep.Delete(Integer.parseInt(request.getParameter("idSupp")));
//            return "redirect:thematique";
//        }
//        model.addAttribute("Thematiques", tRep.findAll());
//        return "View/index";
//    }
//}
