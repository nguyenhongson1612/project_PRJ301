/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class Paper {
    private int pid;
    private String title;
    private String published_date;
    private boolean open_access;

    public Paper() {
    }

    public Paper(int pid, String title, String published_date, boolean open_acess) {
        this.pid = pid;
        this.title = title;
        this.published_date = published_date;
        this.open_access = open_acess;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public boolean isOpen_access() {
        return open_access;
    }

    public void setOpen_access(boolean open_acess) {
        this.open_access = open_acess;
    }
    
    
    
}
