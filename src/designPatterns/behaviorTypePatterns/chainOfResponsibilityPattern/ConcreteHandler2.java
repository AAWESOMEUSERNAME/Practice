package designPatterns.behaviorTypePatterns.chainOfResponsibilityPattern;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handlerRequest(int request) {
        if(10<= request && request <20){
            System.out.println("ConcreteHandler2   处理了请求");
        }else{
            this.getSuccessor().handlerRequest(request);
        }
    }
}
