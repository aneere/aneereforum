package aneere.runko.domain;

import java.util.*;

public class Keskustelu {

    private Integer keskusteluid;
    private String otsikko;
    private String aihealue;
    private List<Viesti> viestit;

    public Keskustelu(Integer id, String otsikko, String aihealue) {
        this.keskusteluid = id;
        this.otsikko = otsikko;
        this.aihealue = aihealue;
    }
    public Keskustelu(Integer id, String aihealue) {
        this.keskusteluid = id;
        this.aihealue = aihealue;
    }
    public Keskustelu(String aihealue) {
        this.aihealue = aihealue;
    }
    public Integer getID() {
        return keskusteluid;
    }

    public void setID(Integer id) {
        this.keskusteluid = id;
    }

    public String getOtsikko() {
        return otsikko;
    }

    public void setOtsikko(String otsikko) {
        this.otsikko = otsikko;
    }

    public String getAihealue() {
        return aihealue;
    }

    public void setAihealue(String aihealue) {
        this.aihealue = aihealue;
    }
    
    public String toString(){
        return this.keskusteluid + " " + this.otsikko + " " + this.aihealue;
    }

}