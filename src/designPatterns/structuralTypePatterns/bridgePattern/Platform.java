package designPatterns.structuralTypePatterns.bridgePattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Platform {
    protected List<Software> software = new ArrayList<>();
    public void addSoftware(Software soft){
        this.software.add(soft);
    }
    public void openSoftware(){
        this.software.forEach(Software::run);
    }
}
