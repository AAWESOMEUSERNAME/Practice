package designPatterns.behaviorTypePatterns.statePattern.StateImpl;

import designPatterns.behaviorTypePatterns.statePattern.State;

public class State02 extends State {
    @Override
    public void back() {
        System.out.println("State02 back");
        System.out.println("State02 --> State01");
        State01 state01 = new State01();
        state01.setContext(super.getContext());
        super.getContext().setState(state01);
    }

    @Override
    public void fore() {
        System.out.println("State02 fore");
        System.out.println("State02 --> State03");
        State03 state03 = new State03();
        state03.setContext(super.getContext());
        super.getContext().setState(state03);
    }
}
