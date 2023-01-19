package com.legal.legal.controller;

//package com.legal.legal.controller;
//
//import java.util.ArrayList;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.legal.legal.model.TextJuridique;
//import com.legal.legal.repository.LegalRepository;
//import com.legal.legal.repository.ThematiqueRepository;
//
//@Controller
//public class LegalController {
//    @Autowired
//    LegalRepository lRep;
//
//    @RequestMapping("/pdf")
//    public String Pdf(HttpServletRequest request) {
//        return "pdf/" + request.getParameter("nom");
//    }
//
//    // Select
//    @RequestMapping(value = "/textJuridique", method = RequestMethod.GET, produces = "application/json")
//    @ResponseBody
//    @CrossOrigin
//    public ArrayList<TextJuridique> getTextJuridiue() {
//        ArrayList<TextJuridique> __data = new ArrayList<TextJuridique>();
//        try {
//            __data = lRep.findAll();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return __data;
//    }
//}
