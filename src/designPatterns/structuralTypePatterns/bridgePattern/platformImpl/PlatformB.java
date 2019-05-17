package designPatterns.structuralTypePatterns.bridgePattern.platformImpl;

import designPatterns.structuralTypePatterns.bridgePattern.Platform;

public class PlatformB extends Platform {
    @Override
    public void openSoftware() {
        System.out.println("在平台B上：");
        super.openSoftware();
    }
}
