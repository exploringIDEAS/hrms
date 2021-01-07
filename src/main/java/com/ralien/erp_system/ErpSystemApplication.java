package com.ralien.erp_system;

import com.ralien.erp_system.workflow.Trigger;
import com.ralien.erp_system.workflow.WorkflowManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ErpSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpSystemApplication.class, args);
//		WorkflowManager workflowManager = new WorkflowManager();
//		workflowManager.createWorkflow();
//		workflowManager.fireEvent(Trigger.START_ONBOARDING);
	}
}
