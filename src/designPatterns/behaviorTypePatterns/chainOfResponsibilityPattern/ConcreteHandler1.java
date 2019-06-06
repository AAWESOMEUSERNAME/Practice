package designPatterns.behaviorTypePatterns.chainOfResponsibilityPattern;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handlerRequest(int request) {
        if(request<10){
            System.out.println("ConcreteHandler1   处理了请求");
        }else{
            this.getSuccessor().handlerRequest(request);
        }
    }
}
