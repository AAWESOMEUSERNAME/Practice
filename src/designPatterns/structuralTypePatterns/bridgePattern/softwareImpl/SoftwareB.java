package designPatterns.structuralTypePatterns.bridgePattern.softwareImpl;

import designPatterns.structuralTypePatterns.bridgePattern.Software;

public class SoftwareB implements Software {
    @Override
    public void run() {
        System.out.println("运行软件B");
    }
}
