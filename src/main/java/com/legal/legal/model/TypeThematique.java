package com.legal.legal.model;

public class TypeThematique {
    private int id;
    private String nomType;
    private String number;
    private String subject;
    private int state;
    private String notes;
    private String sources;
    private String contentMG;
    private String contentFR;
    private int idThematique;
    private String icon;
    private boolean common;
    private int etat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomType() {
        return nomType;
    }

    public void setNomType(String nomType) {
        this.nomType = nomType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public String getContentMG() {
        return contentMG;
    }

    public void setContentMG(String contentMG) {
        this.contentMG = contentMG;
    }

    public String getContentFR() {
        return contentFR;
    }

    public void setContentFR(String contentFR) {
        this.contentFR = contentFR;
    }

    public int getIdThematique() {
        return idThematique;
    }

    public void setIdThematique(int idThematique) {
        this.idThematique = idThematique;
    }

    private String nomThematique;

    public String getIcon() {
        return icon;
    }

    public String getNomThematique() {
        return nomThematique;
    }

    public void setNomThematique(String nomThematique) {
        this.nomThematique = nomThematique;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public boolean isCommon() {
        return common;
    }

    public void setCommon(boolean common) {
        this.common = common;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
}
