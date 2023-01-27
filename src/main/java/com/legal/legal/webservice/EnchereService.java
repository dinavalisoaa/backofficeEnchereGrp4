package com.legal.legal.webservice;

import java.util.List;
import java.util.ArrayList;
import model.*;
import com.google.gson.*;
import com.legal.legal.mongo.MongoRepository;
import java.time.LocalDate;
import java.util.HashMap;
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
public class EnchereService {
//creer son propres en Encheres

    //  get tous les encheresz
    @GetMapping("encheres")
    String getALl() throws Exception {
        Enchere am = new Enchere();
//        am.setUser/sId(id);
        Gson gson = new Gson();
        String texte = gson.toJson(am.select(null));
        HashMap _val_ = new HashMap<String, Object>();
        ArrayList<Enchere> all = new ArrayList<>();
        ArrayList<Enchere> alls = am.select(null);
        for (int i = 0; i < alls.size(); i++) {
            Enchere get = alls.get(i);
            Users vo = new Users();
            vo.setId(get.getUsersId());
            Categorie gorie = new Categorie();
            gorie.setId(get.getCategorieId());
            get.setCat(gorie.getCategorie());
            get.setUser(vo.getUsers()); 
            get.setPhoto(get.getPhoto());
            all.add(get);
        }
        _val_.put("data", all);
        return gson.toJson(_val_);
//        return texte;
    }

    @GetMapping("encheres/{id}")
    String getOnes(@PathVariable int id) throws Exception {
        Enchere am = new Enchere();
        am.setId(id);
        Gson gson = new Gson();
        HashMap _val_ = new HashMap<String, Object>();
        ArrayList<Enchere> all = new ArrayList<>();
        EncherePhoto pho = new EncherePhoto();
        pho.setEnchereId(id);
        ArrayList<Enchere> alls = am.select(null);
        for (int i = 0; i < alls.size(); i++) {
            Enchere get = alls.get(i);
            Users vo = new Users();
            vo.setId(get.getUsersId());
            Categorie gorie = new Categorie();
            gorie.setId(get.getCategorieId());
            get.setCat(gorie.getCategorie());
            get.setUser(vo.getUsers());
            all.add(get);
        }
        _val_.put("data", all);
//        _val_.put("photo", pho.select(null));
        
        return gson.toJson(_val_);
    }

    @GetMapping("encheres/{id}/gagnant")
    String getGagnatn(@PathVariable int id) throws Exception {
        Enchere am = new Enchere();
        am.setId(id);
        am = am.getEnchere();
//        am.getGagnant();
        Gson gson = new Gson();
        HashMap _val_ = new HashMap<String, Object>();
        am.setUserGagnant(am.getGagnant());
//         ArrayList<Enchere> all = new ArrayList<>();
//            ArrayList<Enchere> alls =am.select(null);
//            for (int i = 0; i < alls.size(); i++) {
//                Enchere get = alls.get(i);
//                Users vo = new Users();
//                vo.setId(get.getUsersId());
//                Categorie gorie=new Categorie();
//                gorie.setId(get.getCategorieId());
//                get.setCat(gorie.getCategorie());
//                get.setUserGagnant(vo.getUsers());
//                all.add(get);
//            }
        _val_.put("data", am);
        return gson.toJson(_val_);
        
    }

    @PostMapping("encheres/{id}/close")
    String close(@PathVariable int id) throws Exception {
        EnchereClose am = new EnchereClose();
        am.setEnchereId(id);
        am.setDateClose(LocalDate.now().toString());
        MongoRepository mon = new MongoRepository();
        mon.Create(am);
        Gson gson = new Gson();
        HashMap _val_ = new HashMap<String, Object>();
        _val_.put("val", mon.List());
//       _val_.put("data",new Fail(Boolean.toString(am.isExpirer()), "200"));
        return gson.toJson(_val_);
    }

    @GetMapping("encheres/{id}/etatexp")
    String getExp(@PathVariable int id) throws Exception {
        Enchere am = new Enchere();
        am.setId(id);
        am = am.getEnchere();
        Gson gson = new Gson();
        HashMap _val_ = new HashMap<String, Object>();
        _val_.put("data", new Fail(Boolean.toString(am.isExpirer()), "200"));
        return gson.toJson(_val_);
    }
    
}
