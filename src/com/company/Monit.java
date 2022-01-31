package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Monit {

    Map<String, Integer> paraules;

    public Monit() {
        this.paraules = new HashMap<>();
    }

    public void add(String paraula) {
        /*if (!paraules.containsKey(paraula))paraules.put(paraula,1);
        else paraules.put(,paraules.get(paraula)+1);*/
        if (paraules.containsKey(paraula)) paraules.put(paraula,paraules.get(paraula)+1);
        else paraules.put(paraula,1);
    }

    public void printMonitor(){
        System.out.println(paraules.toString());

    }
}
