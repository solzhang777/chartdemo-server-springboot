package com.online.demo.model;

/**
 * @author by sol on 2019/1/16.
 */
public class CoachInfo {

    private  String year;
    private  Long pass;
    private Long noPass;

    public CoachInfo() {
    }

    public CoachInfo(final String year, final Long pass, final Long noPass) {
        this.year = year;
        this.pass = pass;
        this.noPass = noPass;
    }

    public String getYear() {
        return year;
    }

    public void setYear(final String year) {
        this.year = year;
    }

    public Long getPass() {
        return pass;
    }

    public void setPass(final Long pass) {
        this.pass = pass;
    }

    public Long getNoPass() {
        return noPass;
    }

    public void setNoPass(final Long noPass) {
        this.noPass = noPass;
    }


}
