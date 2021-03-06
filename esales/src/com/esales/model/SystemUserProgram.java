package com.esales.model;
// Generated Nov 9, 2015 8:59:29 PM by Hibernate Tools 4.3.1



/**
 * SystemUserProgram generated by hbm2java
 */
public class SystemUserProgram  implements java.io.Serializable {


     private int id;
     private SystemProgram systemProgram;
     private SystemUser systemUser;
     private String action;

    public SystemUserProgram() {
    }

	
    public SystemUserProgram(int id, SystemProgram systemProgram, SystemUser systemUser) {
        this.id = id;
        this.systemProgram = systemProgram;
        this.systemUser = systemUser;
    }
    public SystemUserProgram(int id, SystemProgram systemProgram, SystemUser systemUser, String action) {
       this.id = id;
       this.systemProgram = systemProgram;
       this.systemUser = systemUser;
       this.action = action;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public SystemProgram getSystemProgram() {
        return this.systemProgram;
    }
    
    public void setSystemProgram(SystemProgram systemProgram) {
        this.systemProgram = systemProgram;
    }
    public SystemUser getSystemUser() {
        return this.systemUser;
    }
    
    public void setSystemUser(SystemUser systemUser) {
        this.systemUser = systemUser;
    }
    public String getAction() {
        return this.action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }




}


