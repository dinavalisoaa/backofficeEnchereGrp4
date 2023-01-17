package com.legal.legal.model;

import java.util.ArrayList;

public class TextJuridique {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private TypeTmp type;

    

    public TypeTmp getType() {
        return type;
    }

    public void setType(TypeTmp type) {
        this.type = type;
    }

    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    private String notes;

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    private String sources;

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    private ContentMG contentmg;

    

    public ContentMG getContentmg() {
        return contentmg;
    }

    public void setContentmg(ContentMG contentmg) {
        this.contentmg = contentmg;
    }

    private ContentFR contentfr;

    

    public ContentFR getContentfr() {
        return contentfr;
    }

    public void setContentfr(ContentFR contentfr) {
        this.contentfr = contentfr;
    }

    private Categorie categorie;

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

   

}
