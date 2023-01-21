package model;

import BddObject.Connexion;
import BddObject.InfoDAO;
import BddObject.ObjectBDD;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author dina
 */
@InfoDAO(table = "EncherePhoto")
public class EncherePhoto extends ObjectBDD {

    private int enchereId = -1;
    private String path;
    private String photo;

    public int getEnchereId() {
        return this.enchereId;
    }

    /**
     *
     * @param enchereId
     */
    public void setEnchereId(int enchereId) {
        this.enchereId = enchereId;
    }

    public void setPIC(String image) throws Exception {
        try{
        File f = new File(image); //change path of image according to you
        FileInputStream fis = new FileInputStream(f);
        byte byteArray[] = new byte[(int) f.length()];
        fis.read(byteArray);
        String imageString = Base64.encodeBase64String(byteArray);
        EncherePhoto ph=new EncherePhoto();
        ph.setPhoto(imageString);
        System.err.println(imageString);
//        ph.setEnchereId())
//ph;
        ph.setEnchereId(this.enchereId);
        ph.insert(null);}catch(Exception ex){throw ex;}
    }
    public String getPath() {
        return this.path;
    }

    /**
     *
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    public String getPhoto() {
        return this.photo;
    }

    /**
     *
     * @param photo
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

}
