package designPatterns.structuralTypePatterns.bridgePattern;

import designPatterns.structuralTypePatterns.bridgePattern.platformImpl.PlatformA;
import designPatterns.structuralTypePatterns.bridgePattern.platformImpl.PlatformB;
import designPatterns.structuralTypePatterns.bridgePattern.softwareImpl.SoftwareA;
import designPatterns.structuralTypePatterns.bridgePattern.softwareImpl.SoftwareB;

public class Main {
    public static void main(String[] args) {
        Platform platformA = new PlatformA();
        Platform platformB = new PlatformB();
        platformA.addSoftware(new SoftwareA());
        platformA.addSoftware(new SoftwareB());
        platformB.addSoftware(new SoftwareA());
        platformB.addSoftware(new SoftwareB());

        platformA.openSoftware();
        System.out.println("---------------------");
        platformB.openSoftware();
    }
}
