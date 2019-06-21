/**
 * 
 */
package informer.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import informer.model.ModelCompany;
import informer.model.ModelDepartment;
import informer.model.ModelEmployee;
import informer.service.ServiceCompany;
import informer.service.ServiceDepartment;
import informer.service.ServiceEmployee;

/**
 * @author firsov
 *
 */
@Named
@SessionScoped
public class ControllerIndex implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ServiceCompany serviceCompany;
	
	private List<ModelCompany> companies;
	
	@EJB
	private ServiceDepartment serviceDepartment;
	
	private List<ModelDepartment> departments;
	
	@EJB
	private ServiceEmployee serviceEmployee;
	
	private List<ModelEmployee> employees;
	
	private ModelDepartment selectedDepartment;
	
	@PostConstruct
	public void init() {
		this.companies = serviceCompany.findEnable();
		this.departments = serviceDepartment.fillDepartmentCompany();
		if (0 != departments.size()) {
			this.selectedDepartment = departments.get(0);
			this.employees = serviceEmployee.findDepartmentCompanyDisable(departments.get(0).getDepartmentId(), companies.get(0).getCompanyId(), false);
		}
		
	}

	public void actionclickDepartment(ActionEvent event) {
		Integer departmentId = (Integer) event.getComponent().getAttributes().get("departmentId");
		this.employees = serviceEmployee.findDepartmentCompanyDisable(departmentId, companies.get(0).getCompanyId(), false);
		this.selectedDepartment = serviceDepartment.fingId(departmentId);
	}
	
	public List<ModelCompany> getCompanies() {
		return companies;
	}

	public List<ModelDepartment> getDepartments() {
		return departments;
	}

	public List<ModelEmployee> getEmployees() {
		return employees;
	}

	public ModelDepartment getSelectedDepartment() {
		return selectedDepartment;
	}
	
}
