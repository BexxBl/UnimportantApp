package com.webgalaxie.blischke.bachelortakeone.Models;

/**
 * Created by Bexx on 04.11.17.
 */

public class Expose {
    private int expose_id;
    private String exposeTitle, exposeStatus, exposeAdress;
    private String exposeDate;
    private int Image;

    public Expose(int expose_id, String exposeTitle, String exposeStatus, String exposeAdress, String exposeDate, int image) {
        this.expose_id = expose_id;
        this.exposeTitle = exposeTitle;
        this.exposeStatus = exposeStatus;
        this.exposeAdress = exposeAdress;
        this.exposeDate = exposeDate;
        Image = image;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public int getExpose_id() {
        return expose_id;
    }

    public void setExpose_id(int expose_id) {
        this.expose_id = expose_id;
    }

    public String getExposeDate() {
        return exposeDate;
    }

    public void setExposeDate(String exposeDate) {
        this.exposeDate = exposeDate;
    }

    public String getExposeTitle() {
        return exposeTitle;
    }

    public void setExposeTitle(String exposeTitle) {
        this.exposeTitle = exposeTitle;
    }

    public String getExposeStatus() {
        return exposeStatus;
    }

    public void setExposeStatus(String exposeStatus) {
        this.exposeStatus = exposeStatus;
    }

    public String getExposeAdress() {
        return exposeAdress;
    }

    public void setExposeAdress(String exposeAdress) {
        this.exposeAdress = exposeAdress;
    }
}
