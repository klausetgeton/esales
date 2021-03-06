package com.esales.model;
// Generated Nov 9, 2015 8:59:29 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * SystemProgram generated by hbm2java
 */
public class SystemProgram  implements java.io.Serializable {


     private int id;
     private String name;
     private String controller;
     private Set systemUserPrograms = new HashSet(0);
     private Set systemGroupPrograms = new HashSet(0);

    public SystemProgram() {
    }

	
    public SystemProgram(int id) {
        this.id = id;
    }
    public SystemProgram(int id, String name, String controller, Set systemUserPrograms, Set systemGroupPrograms) {
       this.id = id;
       this.name = name;
       this.controller = controller;
       this.systemUserPrograms = systemUserPrograms;
       this.systemGroupPrograms = systemGroupPrograms;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getController() {
        return this.controller;
    }
    
    public void setController(String controller) {
        this.controller = controller;
    }
    public Set getSystemUserPrograms() {
        return this.systemUserPrograms;
    }
    
    public void setSystemUserPrograms(Set systemUserPrograms) {
        this.systemUserPrograms = systemUserPrograms;
    }
    public Set getSystemGroupPrograms() {
        return this.systemGroupPrograms;
    }
    
    public void setSystemGroupPrograms(Set systemGroupPrograms) {
        this.systemGroupPrograms = systemGroupPrograms;
    }




}


