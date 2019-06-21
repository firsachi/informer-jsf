/**
 * 
 */
package informer.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import informer.model.ModelDepartment;
import informer.service.ServiceDepartment;

/**
 * @author firsov
 *
 */
@Named
@SessionScoped
public class ControllerDepartment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ServiceDepartment serviceDepartment;
	
	private List<ModelDepartment> departments;
	
	@PostConstruct
	public void init() {
		this.departments = serviceDepartment.fillDepartmentCompany();
	}

	public List<ModelDepartment> getDepartments() {
		return departments;
	}
	
}
