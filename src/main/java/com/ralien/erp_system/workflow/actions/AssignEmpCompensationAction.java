package com.ralien.erp_system.workflow.actions;

import com.github.oxo42.stateless4j.delegates.Action;

public class AssignEmpCompensationAction implements Action {
    @Override
    public void doIt() {
        System.out.println(this.getClass().toString());
    }
}
