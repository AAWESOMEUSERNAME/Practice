package designPatterns.createTypePatterns.builderPattern;

import designPatterns.createTypePatterns.builderPattern.builderImpl.NikeProductBuilder;

public class Main {
    public static void main(String[] args) {
//        HMProductBuilder builder = new HMProductBuilder();
        NikeProductBuilder builder = new NikeProductBuilder();
        Director director = new Director();
        director.construct(builder);
        builder.getProduct().show();
    }
}
