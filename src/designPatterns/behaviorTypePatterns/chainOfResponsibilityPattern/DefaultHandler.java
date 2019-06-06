package designPatterns.behaviorTypePatterns.chainOfResponsibilityPattern;

public class DefaultHandler extends Handler {
    @Override
    public void handlerRequest(int request) {
        System.out.println("执行默认处理");
    }
}
