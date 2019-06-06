package designPatterns.behaviorTypePatterns.mediatorPattern.member;

import designPatterns.behaviorTypePatterns.mediatorPattern.Member;

public class Member03 extends Member{
    public void notifyOthers(String info){
        super.mediator.notifyOthers(info,this);
    }
}
