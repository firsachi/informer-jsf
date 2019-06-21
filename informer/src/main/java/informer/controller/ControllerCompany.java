package informer.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import informer.model.ModelCompany;
import informer.service.ServiceCompany;

/**
 * @author firsov
 *
 */
@Named
@SessionScoped
public class ControllerCompany implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ServiceCompany serviceCompany;
	
	private List<ModelCompany> companies;
	
	@PostConstruct
	public void init() {
		this.companies = serviceCompany.findEnable();
	}

	public List<ModelCompany> getCompanies() {
		return this.companies;
	}
	
}
