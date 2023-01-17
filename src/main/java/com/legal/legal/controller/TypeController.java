package com.legal.legal.controller;

import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;
import model.Admin;
import model.Categorie;
import model.Parametrage;

//import com.itextpdf.text.pdf.parser.Path;
//import com.legal.legal.model.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.util.HtmlUtils;

//import com.legal.legal.repository.ThematiqueRepository;
//import com.legal.legal.repository.TypeRepository;
@Controller
public class TypeController {
//y typeRep;
//    @Autowired
//    ThematiqueRepository tRep;
//
//    @RequestMapping("/type")
//    public String Save(HttpServletRequest request, Model model) {
//        if (request.getParameter("pdf1") != null && request.getParameter("pdf2") != null) {
//            System.out.println("test");
//
//            String pdf1 = request.getParameter("pdf1");
//            String pdf2 = request.getParameter("pdf2");
//            String escape1 = HtmlUtils.htmlEscape(pdf1);
//            String escape2 = HtmlUtils.htmlEscape(pdf2);
//            System.out.println(escape2);
//            System.out.println(HtmlUtils.htmlUnescape(escape1));
//            Type type = new Type();
//            type.setIcon("");
//            type.setCommon(true);
//            type.setNomType(request.getParameter("nomtype"));
//            type.setIdThematique(Integer.parseInt(request.getParameter("idthematique")));
//            type.setState(Integer.parseInt(request.getParameter("state")));
//            type.setNumber(request.getParameter("number"));
//            type.setNotes(request.getParameter("notes"));
//            type.setSources(request.getParameter("sources"));
//            type.setSources(request.getParameter("subject"));
//            type.setContentMG(escape1);
//            type.setContentFR(escape2);
//            typeRep.Save(type);
//        }
//        // if (request.getParameter("nomtype") != null && request.getParameter("number")
//        // != null
//        // && request.getParameter("subject") != null && request.getParameter("state")
//        // != null
//        // && request.getParameter("notes") != null && request.getParameter("sources")
//        // != null
//        // && request.getParameter("idthematique") != null) {
//        // Type type = new Type();
//        // type.setNomType(request.getParameter("nomtype"));
//        // type.setIdThematique(Integer.parseInt(request.getParameter("idthematique")));
//        // type.setState(Integer.parseInt(request.getParameter("state")));
//        // type.setNumber(request.getParameter("number"));
//        // type.setNotes(request.getParameter("notes"));
//        // type.setSources(request.getParameter("sources"));
//        // type.setContentMG("-");
//        // type.setContentFR("-");
//        // type.setSubject(request.getParameter("subject"));
//        // type.setIcon("");
//        // type.setIdThematique(Integer.parseInt(request.getParameter("idthematique")));
//        // type.setCommon(true);
//        // // if (Integer.parseInt(request.getParameter("common")) == 1) {
//        // // type.setCommon(false);
//        // // }
//        // typeRep.Save(type);
//        // }
//        if (request.getParameter("id") != null && request.getParameter("nomtypeMod") != null
//                && request.getParameter("numberMod") != null
//                && request.getParameter("idthematiqueMod") != null) {
//            Type typeMod = new Type();
//            typeMod.setNomType(request.getParameter("nomtypeMod"));
//            typeMod.setIdThematique(Integer.parseInt(request.getParameter("idthematiqueMod")));
//            typeMod.setState(0);
//            typeMod.setNumber(request.getParameter("numberMod"));
//            typeMod.setNotes("");
//            typeMod.setSources("");
//
//            // typeMod.setContentMG(request.getParameter("contentmgMod"));
//            // typeMod.setContentFR(request.getParameter("contentfrMod"));
//
//            typeMod.setSubject(request.getParameter("idthematiqueMod"));
//            typeMod.setIcon("");
//            typeMod.setId(Integer.parseInt(request.getParameter("id")));
//            typeMod.setIdThematique(Integer.parseInt(request.getParameter("idthematiqueMod")));
//            typeMod.setCommon(true);
//            typeRep.Update(typeMod);
//        }
//        model.addAttribute("content", "type");
//        model.addAttribute("contentpath", "View/type");
//        if (request.getParameter("idSupp") != null) {
//            typeRep.Delete(Integer.parseInt(request.getParameter("idSupp")));
//            return "redirect:type";
//        }
//        model.addAttribute("Thematiques", tRep.findAll());
//        model.addAttribute("Types", typeRep.findAll());
//        model.addAttribute("TypeThematique", typeRep.findAllTypeThmeatique());
//        // String html = "<h2>Bonjour</h2>";
//        // String escape = HtmlUtils.htmlEscape(html);
//        // System.out.println(escape + "pppp");
//        // String escape1 = HtmlUtils.htmlEscape(escape, "UTF-8");
//        // System.out.println(escape1 + "pppp");
//        // String decode = HtmlUtils.htmlUnescape(escape1);
//        // System.out.println(decode + "pppp");
//        // try {
//        // typeRep.generateHTMLFromPDF("Loi-n-2015-005_COAP.pdf");
//        // } catch (Exception e) {
//        // // TODO Auto-generated catch block
//        // e.printStackTrace();
//        // }
//        return "View/index";
//    }
//
//    public boolean upload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
//        if (file.isEmpty()) {
//            redirectAttributes.addFlashAttribute("message", "Please");
//            return false;
//        }
//        try {
//            byte[] bytes = file.getBytes();
//            java.nio.file.Path path = Paths.get("ListePDF/" + file.getOriginalFilename() + ".pdf");
//            java.nio.file.Files.write(path, bytes);
//            return true;
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
//
//    @RequestMapping("/upload")
//    public String uploaded(HttpServletRequest request, @RequestParam("fileMG") MultipartFile fileMG,
//            @RequestParam("fileFR") MultipartFile fileFR,
//            RedirectAttributes redirectAttributes, Model model) {
//        if (request.getParameter("nomtype") != null && request.getParameter("number") != null
//                && request.getParameter("subject") != null && request.getParameter("state") != null
//                && request.getParameter("notes") != null && request.getParameter("sources") != null
//                && request.getParameter("idthematique") != null) {
//            Type type = new Type();
//            model.addAttribute("nomtype", request.getParameter("nomtype"));
//            model.addAttribute("idthematique", request.getParameter("idthematique"));
//            model.addAttribute("state", request.getParameter("state"));
//            model.addAttribute("number", request.getParameter("number"));
//            model.addAttribute("notes", request.getParameter("notes"));
//            model.addAttribute("sources", request.getParameter("sources"));
//            model.addAttribute("subject", request.getParameter("subject"));
//            if (fileMG.isEmpty() && fileFR.isEmpty()) {
//                redirectAttributes.addFlashAttribute("message", "Please");
//                return "redirect:type?error";
//            }
//            try {
//
//                byte[] bytes = fileMG.getBytes();
//                java.nio.file.Path path = Paths.get("ListePDF/" + fileMG.getOriginalFilename().replace(".pdf", ""));
//                java.nio.file.Files.write(path, bytes);
//                model.addAttribute("pdf1", fileMG.getOriginalFilename() + ".pdf");
//                typeRep.generateHTMLFromPDF("ListePDF/" + fileMG.getOriginalFilename(),
//                        fileMG.getOriginalFilename());
//                bytes = fileFR.getBytes();
//                path = Paths.get("ListePDF/" + fileFR.getOriginalFilename().replace(".pdf", ""));
//                model.addAttribute("pdf1", fileFR.getOriginalFilename() + ".pdf");
//                typeRep.generateHTMLFromPDF("ListePDF/" + fileFR.getOriginalFilename(),
//                        fileFR.getOriginalFilename());
//                java.nio.file.Files.write(path, bytes);
//                type.setIcon("");
//                type.setCommon(true);
//                type.setIcon("");
//                type.setCommon(true);
//                type.setNomType(request.getParameter("nomtype"));
//                type.setIdThematique(Integer.parseInt(request.getParameter("idthematique")));
//                type.setState(Integer.parseInt(request.getParameter("state")));
//                type.setNumber(request.getParameter("number"));
//                type.setNotes(request.getParameter("notes"));
//                type.setSources(request.getParameter("sources"));
//                type.setSources(request.getParameter("subject"));
//                type.setContentMG(fileMG.getOriginalFilename().replace(".pdf", ""));
//                type.setContentFR(fileFR.getOriginalFilename().replace(".pdf", ""));
//                typeRep.Save(type);
//            } catch (Exception ex) {
//                ex.printStackTrace();
//                return "redirect:type?error";
//            }
//        }
//        return "redirect:type";
//    }

    @RequestMapping("/login")
    public String AjoutTheme(HttpServletRequest request, Model model) {
        model.addAttribute("content", "type");
        model.addAttribute("contentpath", "View/type");
        return "index";
    }
    @RequestMapping("/index")
    public String AsjoutTheme(HttpServletRequest request, Model model) {
        model.addAttribute("content", "type");
        model.addAttribute("contentpath", "View/type");
        return "index";
    }
     
  @RequestMapping("/categorie")
    public String AjoutThesme(HttpServletRequest request, Model model) throws Exception {
        model.addAttribute("categorie", Categorie.categories());
        return "categories";
    }
    
  @RequestMapping("/parametrages")
    public String AsjoutThesme(HttpServletRequest request, Model model) throws Exception {
        model.addAttribute("parametrages", Parametrage.parametrages());
        return "parametrages";
    }
     @RequestMapping("/updateParametrages")
    public String up(HttpServletRequest request, Model model) throws Exception {
        Parametrage gorie=new Parametrage();
        gorie.setValue(request.getParameter("value"));
        gorie.setId(Integer.parseInt(request.getParameter("id").toString()));
        gorie.update("Id",null);
        model.addAttribute("parametrages", Parametrage.parametrages());
        return "redirect:parametrages";
    } 
    @GetMapping("/actionlogin")
    public String actionlogin(HttpServletRequest request, Model model) throws Exception {
        model.addAttribute("content", "type");
        Admin min = new Admin();
        min.setMdp(request.getParameter("mdp"));
        min.setLogin(request.getParameter("login"));
        model.addAttribute("contentpath", "View/type");
        if (min.getLoginId() == -1) {
            return "redirect:actionlogin";
        }
        model.addAttribute("categorie", Categorie.categories());
        return "home";
    }


}
