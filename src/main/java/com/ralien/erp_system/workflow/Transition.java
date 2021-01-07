package com.ralien.erp_system.workflow;

import com.github.oxo42.stateless4j.delegates.Action;

public class Transition {
    private State fromState;
    private Trigger event;
    private State toState;
    private Action action;

    public Transition(State fromState, Trigger event, State toState, Action action) {
        this.fromState = fromState;
        this.event = event;
        this.toState = toState;
        this.action = action;
    }

    public State getFromState() {
        return fromState;
    }

    public Trigger getEvent() {
        return event;
    }

    public State getToState() {
        return toState;
    }

    public Action getAction() {
        return action;
    }
}
