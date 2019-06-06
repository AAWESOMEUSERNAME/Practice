package designPatterns.behaviorTypePatterns.statePattern.StateImpl;

import designPatterns.behaviorTypePatterns.statePattern.State;

public class State03 extends State {
    @Override
    public void back() {
        System.out.println("State03 back");
        System.out.println("State03 --> state01");
        State02 state02 = new State02();
        state02.setContext(super.getContext());
        super.getContext().setState(state02);
    }

    @Override
    public void fore() {
        System.out.println("State03 fore");
        System.out.println("State03 --> State01");
        State01 state01 = new State01();
        state01.setContext(super.getContext());
        super.getContext().setState(state01);
    }
}
