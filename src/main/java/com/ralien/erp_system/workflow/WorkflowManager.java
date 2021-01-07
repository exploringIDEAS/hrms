package com.ralien.erp_system.workflow;

import com.github.oxo42.stateless4j.StateMachine;
import com.github.oxo42.stateless4j.StateMachineConfig;
import com.ralien.erp_system.workflow.actions.*;

import java.util.ArrayList;
import java.util.List;

public class WorkflowManager {
    private StateMachineConfig<State, Trigger> empWfConfig;
    private StateMachine<State, Trigger> empWfMachine;
    private List<Transition> transitionList;
    public WorkflowManager() {
        empWfConfig = new StateMachineConfig<>();
        transitionList = new ArrayList<>();
    }

    public void createWorkflow() {
        transitionList.add(new Transition(State.EMP_WF_CREATED, Trigger.START_ONBOARDING, State.EMP_ONBOARDING_STARTED, new StartEmpOnboardingAction()));
        transitionList.add(new Transition(State.EMP_ONBOARDING_STARTED, Trigger.REGISTER_USER, State.USER_CREATED, new OpenEmpUserAccountAction()));
        transitionList.add(new Transition(State.USER_CREATED, Trigger.SAVE_PERSONAL_INFO, State.PERSONAL_INFO_SAVED, new StoreEmpPersonalInfoAction()));
        transitionList.add(new Transition(State.PERSONAL_INFO_SAVED, Trigger.ASSIGN_DEPARTMENT, State.DEPARTMENT_ASSIGNED, new AssignEmpDepartmentAction()));
        transitionList.add(new Transition(State.DEPARTMENT_ASSIGNED, Trigger.ASSIGN_DESIGNATION, State.DESIGNATION_ASSIGNED, new AssignEmpDesignationAction()));
        transitionList.add(new Transition(State.DESIGNATION_ASSIGNED, Trigger.ASSIGN_COMPENSATION, State.COMPENSATION_ASSIGNED, new AssignEmpCompensationAction()));
        transitionList.add(new Transition(State.COMPENSATION_ASSIGNED, Trigger.FINISH_ONBOARDING, State.FINISHED_ONBOARDING, new FinishEmpOnboardingAction()));

        for (Transition transition: transitionList) {
            empWfConfig.configure(transition.getFromState())
                    .permit(transition.getEvent(), transition.getToState(), transition.getAction());
        }

        empWfMachine = new StateMachine<>(State.EMP_WF_CREATED, empWfConfig);
    }

    public void fireEvent(Trigger trigger) {
        empWfMachine.fire(trigger);
        System.out.println(empWfMachine.getState());
    }

}
