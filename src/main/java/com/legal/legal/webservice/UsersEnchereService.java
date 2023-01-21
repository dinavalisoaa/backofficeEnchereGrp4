package com.legal.legal.webservice;

import java.util.List;
import java.util.ArrayList;
import model.*;
import com.google.gson.*;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import utils.Fail;
import utils.Message;
import utils.Success;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RestController
@CrossOrigin
public class UsersEnchereService {
//creer son propres en Encheres

    @PostMapping("/users/{id}/encheres")
    String Create(@RequestParam double prixMin,
            @PathVariable int id, @RequestParam int categorieId,
            @RequestParam String descriProduit, @RequestParam double durer, @RequestHeader String token) throws Exception {
        HashMap _val_ = new HashMap<String, Object>();

        Gson gson = new Gson();
        try {
            TokenHandler tokens = new TokenHandler().ToToken(token);
            int usersId = tokens.getUtilisateur();
            System.err.println(usersId);
        } catch (Exception d) {
            _val_.put("error", new Fail(d.getMessage(), "404"));
            return gson.toJson(_val_);
        }
        String texte = "";// gson.toJson(new Message(new Success(idKilo, "Success")));

        try {
            Enchere enchere = new Enchere();
            enchere.setCategorieId(categorieId);
//            enchere.setDateDebut(dateDebut);
            enchere.setPrixMin(prixMin);
            enchere.setUsersId(id);
            enchere.setDescriProduit(descriProduit);
            enchere.setDurer(durer);
            enchere.insert(null);
            texte = gson.toJson(new Message(new Success(enchere.getLastID(), "Success")));
        } catch (Exception ex) {
            texte = gson.toJson(new Message(new Fail("500", ex.getMessage())));
            
        }
        return texte;
    }

    @PutMapping("/users/{id}/encheres/{ide}/addpictures")
    String change(
            @PathVariable int id,
            @PathVariable int ide, @RequestHeader String body) throws Exception {
        Gson gson = new Gson();
        String texte = "";// gson.toJson(new Message(new Success(idKilo, "Success")));
        try {
            EncherePhoto enp = new EncherePhoto();
            enp.setEnchereId(ide);
            enp.setPhoto(body);
            enp.insert(null);
            texte = gson.toJson(new Message(new Success(200, "Success")));
        } catch (Exception ex) {
            texte = gson.toJson(new Message(new Fail("500", ex.getMessage())));
//            
        }
        return texte;
    }

    //update un encheres adjuger
    @PutMapping("/users/{id}/encheres/{idc}/ajd")
    String updateAdj(@RequestParam double prixMin,
            @PathVariable int idc,
            @PathVariable int id) throws Exception {
        Gson gson = new Gson();
        String texte = "";// gson.toJson(new Message(new Success(idKilo, "Success")));

        try {
            Enchere enchere = new Enchere();
//            enchere.setCategorieId(categorieId);
//            enchere.setDateDebut(dateDebut);
//            enchere.setPrixMin(prixMin);
            enchere.setUsersId(id);
//            enchere.setDescriProduit(descriProduit);
//            enchere.setDurer(durer);
            enchere.setId(idc);
            enchere.setUsersId(id);
            enchere.setState(1);

            enchere.update("id", null);
            texte = gson.toJson(new Message(new Success(id, "Update Ok!!")));
        } catch (Exception ex) {
            texte = gson.toJson(new Message(new Fail("500", ex.getMessage())));
            
        }
        return texte;
    }
// update d'un enchere

    @PutMapping("/users/{id}/encheres/{idc}")
    String update(@PathVariable int id, @PathVariable int idc, HttpServletRequest rq, @RequestHeader String token) throws Exception {
        HashMap _val_ = new HashMap<String, Object>();

        Gson gson = new Gson();
        try{
        TokenHandler tokens = new TokenHandler().ToToken(token);
        int usersId = tokens.getUtilisateur();
        }catch(Exception d){
        _val_.put("error",new Fail(d.getMessage(),"404"));
        return gson.toJson(_val_);
        }
        String texte = "";// gson.toJson(new Message(new Success(idKilo, "Success")));

        try {
            Enchere enchere = new Enchere();
            if (rq.getParameter("categorieId") != null) {
                enchere.setCategorieId(Integer.parseInt(rq.getParameter("categorieId")));
            }
            if (rq.getParameter("prixMin") != null) {
                enchere.setPrixMin(Double.parseDouble((rq.getParameter("prixMin"))));
            }
            if (rq.getParameter("durer") != null) {
                enchere.setDurer(Double.parseDouble((rq.getParameter("durer"))));
            }

            if (rq.getParameter("descriProduit") != null) {
                enchere.setDescriProduit(rq.getParameter("descriProduit"));

            }
            enchere.setUsersId(id);
            enchere.setId(idc);
            enchere.update("id", null);
            texte = gson.toJson(new Message(new Success(id, "Update Ok!!")));
        } catch (Exception ex) {
            texte = gson.toJson(new Message(new Fail("500", ex.getMessage())));
//            
        }
        return texte;
    }

    @PostMapping("/users/{id}/encheres/{idc}/addPic")
    String updatePic(@PathVariable int id, @PathVariable int idc, @RequestParam String photo) throws Exception {
        Gson gson = new Gson();
        String texte = "";// gson.toJson(new Message(new Success(idKilo, "Success")));

        try {
            EncherePhoto o = new EncherePhoto();
            o.setEnchereId(idc);
            o.setPIC(photo);
//            o.setPhoto(photo.toString());
//            o.insert(null);
            texte = gson.toJson(new Message(new Success(id, "Insert Ok!!")));
        } catch (Exception ex) {
            texte = gson.toJson(new Message(new Fail("500", ex.getMessage())));
//         /   
        }
        return texte;
    }

    //  get tous les encheresz
//    ArrayList<Enchere> advancedSearch(String cle)
    @GetMapping("/users/{id}/encheres")
    String getOne(@PathVariable int id, @RequestHeader String token) throws Exception {
        HashMap _val_ = new HashMap<String, Object>();

        Gson gson = new Gson();
        try {
            TokenHandler tokens = new TokenHandler().ToToken(token);
            int usersId = tokens.getUtilisateur();
            System.err.println(usersId);
        } catch (Exception d) {
            _val_.put("error", new Fail(d.getMessage(), "404"));
            return gson.toJson(_val_);
        }
        Enchere am = new Enchere();
        am.setUsersId(id);
//        String texte = gson.toJson(am.select(null));
//        return texte;
        _val_.put("data", am.select(null));
        return gson.toJson(_val_);
    }

    @GetMapping("/users/{id}/encheres/search")
    String recherhce(@PathVariable int id, HttpServletRequest request, @RequestHeader String token) throws Exception {
        HashMap _val_ = new HashMap<String, Object>();

        Gson gson = new Gson();
        try {
            TokenHandler tokens = new TokenHandler().ToToken(token);
            int usersId = tokens.getUtilisateur();
            System.err.println(usersId);
        } catch (Exception d) {
            _val_.put("error", new Fail(d.getMessage(), "404"));
            return gson.toJson(_val_);
        }  Enchere am = new Enchere();
        am.setUsersId(id);
        Enchere enchere = new Enchere();
        if (request.getParameter("datedebut") != null) {
            enchere.setDateDebut(request.getParameter("datedebut"));
        }
        if (request.getParameter("dateexp") != null) {
            enchere.setDateDebut(request.getParameter("dateexp"));
        }
        if (request.getParameter("state") != null) {
            enchere.setState(Integer.valueOf(request.getParameter("state")));
        }
        if (request.getParameter("prixmin") != null) {
            enchere.setPrixMin(Double.valueOf(request.getParameter("prixmin")));
        }
        String key = null;//"";
        if (request.getParameter("cle") != null) {
            key = request.getParameter("cle");
        }
        ArrayList<Enchere> sera = enchere.advancedSearch(key);
        _val_.put("data", sera);
        return gson.toJson(_val_);
    }

    @GetMapping("/users/{id}/encheres/{idc}")
    String getOneEnc(@PathVariable int id, @PathVariable int idc) throws Exception {
        Enchere am = new Enchere();
        am.setUsersId(id);
        am.setId(idc);
        Gson gson = new Gson();
        HashMap _val_ = new HashMap<String, Object>();
        _val_.put("data", am.select(null));
        return gson.toJson(_val_);
    }
}
