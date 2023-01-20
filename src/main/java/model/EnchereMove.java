package model;

import BddObject.Connexion;
import BddObject.Ignore;
import BddObject.InfoDAO;
import BddObject.ObjectBDD;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author dina
 */
@InfoDAO(table = "EnchereMove")
public class EnchereMove extends ObjectBDD {

    private String dateMise;
    private double prixMise = -1;
    private int state = -1;
    private int usersId = -1;
    private int enchereId = -1;
    private int commissionId = -1;
    private int id = -1;
    @Ignore
    Users user;

    @Ignore
    Enchere enchere;
    @Ignore
    Commission commision;
    @Ignore
    Users users;

    public Commission getCommision() {
        return commision;
    }

    public void setCommision(Commission commision) {
        this.commision = commision;
    }
    
    public int getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(int commissionId) {
        this.commissionId = commissionId;
    }

    public Enchere getEnchere() {
        return enchere;
    }

    public void setEnchere(Enchere enchere) {
        this.enchere = enchere;
    }

    public Users getUser() {
        return user;
    }

    public void insert(Connection con) throws Exception {
        this.setCommissionId(new Commission().getCurrentId().getId());
        super.insert(con);
    }
//     @Override
//    public void insert(Connection con) throws Exception{
////        super.insert(con);
//        
//}

    public void setUser(Users user) {
        this.user = user;
    }

    public String getDateMise() {
        return this.dateMise;
    }

    /**
     *
     * @param dateMise
     */
    public void setDateMise(String dateMise) {
        this.dateMise = dateMise;
    }

    public double getPrixMise() {
        return this.prixMise;
    }

    /**
     *
     * @param prixMise
     */
    public Users getUsers() throws Exception {
        Users us = new Users();
        us.setId(this.usersId);
        return ((Users) us.select(null).get(0));
    }
  public EnchereMove getEnchereMove() throws Exception {
        EnchereMove us = new EnchereMove();
        us.setId(this.id);
        return ((EnchereMove) us.select(null).get(0));
    }
  
    public static void debite(EnchereMove en) throws Exception {
        if (en.getState() == 0) {
            Compte iray = new Compte();
            iray.setMontant(en.getPrixMise() * -1);
            iray.setUsersId(en.getUsersId());
            iray.insert(null);
            EnchereMove vaov = new EnchereMove();
            vaov.setId(en.getId());
            vaov.setState(1);
            vaov.update("id", null);
        }
    }

    public static void credite(EnchereMove en) throws Exception {
        Compte iray = new Compte();
        iray.setMontant(en.getPrixMise());
        iray.setUsersId(en.getUsersId());
        iray.insert(null);
        EnchereMove vaov = new EnchereMove();
        vaov.setId(en.getId());
        vaov.setState(0);
        vaov.update("id", null);
    }

    public  EnchereMove lastMove(Connection con) throws Exception {
        EnchereMove us = new EnchereMove();
      ArrayList<EnchereMove> li=us.selectBySQL("select *from encheremove where enchereId="+this.enchereId+" order by id desc limit 1", con);
        
        if (li.isEmpty() == true) {
            return null;
        }
        return (li.get(0));
    }
    public static void setTransaction(EnchereMove move,int idEnchere) throws Exception
    {
     Enchere encours = new Enchere();
        encours.setId(idEnchere);
        Connection con = Connexion.getConn();
        double d = move.getPrixMise();
        EnchereMove taken = new EnchereMove();
        taken.setPrixMise(d);
        EnchereMove avantWinner = encours.getEnchereMovesGagnantId(con);
        EnchereMove mo = move.lastMove(con);
        System.err.println("```````````````````````"+mo);
        if (mo != null) {
            if (mo.getPrixMise() >= d) {
                throw new Exception("Mise impossible");
            }
        }
        taken.setEnchereId(idEnchere);
        taken.setUsersId(move.getUsersId());
        if (avantWinner != null) {
            credite(avantWinner);
        }
        taken.insert(con);
        EnchereMove lastwinner = encours.getEnchereMovesGagnantId(con);
        debite(move.lastMove(con));
 con.close();
}
    public void setPrixMise(double prixMise) throws Exception {
        System.out.println(this.getUsers().getCurrentMoney());
//        if (prixMise > this.getUsers().getCurrentMoney()) {
//            throw new Exception("Solde inferieur");
//        } else {
            this.prixMise = prixMise;
//        }
    }

    public int getState() {
        return this.state;
    }

    /**
     *
     * @param state
     */
    public void setState(int state) {
        this.state = state;
    }

    public int getUsersId() {
        return this.usersId;
    }

    /**
     *
     * @param usersId
     */
    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }

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

    public int getId() {
        return this.id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

}
