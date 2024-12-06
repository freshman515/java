package com.exercise;

public class Computer {
    String company;
    String graphical;
    String memory;
    public Computer(String company,String graphical,String memory){
        this.company = company;
        this.graphical = graphical;
        this.memory = memory;
    }
    public String getInfo(){
        return "company:"+company+" graphical:"+graphical+" memory:"+memory;
    }
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGraphical() {
        return graphical;
    }

    public void setGraphical(String graphical) {
        this.graphical = graphical;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
}
