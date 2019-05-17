package designPatterns.structuralTypePatterns.bridgePattern.platformImpl;

import designPatterns.structuralTypePatterns.bridgePattern.Platform;

public class PlatformA extends Platform {
    @Override
    public void openSoftware() {
        System.out.println("在平台A上：");
        super.openSoftware();
    }
}
