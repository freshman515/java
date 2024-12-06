package com.exercise;

public class PC extends Computer{
    String hostname;
    public PC(String company,String graphical,String memory,String hostname){
        super(company,graphical,memory);
        this.hostname=hostname;
    }
    public String getInfo(){
        return super.getInfo()+" hostname:"+hostname;
    }
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
}
