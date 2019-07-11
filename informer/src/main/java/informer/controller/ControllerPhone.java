package informer.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import informer.entity.Phone;
import informer.service.ServicePhone;

@Named
@SessionScoped
public class ControllerPhone implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3922489654344863229L;
	
	@EJB
	private ServicePhone servicePhone;
	
	private Phone selectedPhone;	
	
	private List<Phone> phones;
	
	private int indexPhones;
	
	@PostConstruct
	public void init() {
		this.phones = servicePhone.all();
		this.selectedPhone = new Phone();
	}
	
	public void actionIsSelected(ActionEvent event) {
		Integer primaryKey = (Integer) event.getComponent().getAttributes().get("phoneId");
		this .selectedPhone = servicePhone.findPrimaryKey(primaryKey);
		this.indexPhones = phones.indexOf(selectedPhone);
	}
	
	public String deletePhone() {
		servicePhone.delete(selectedPhone);
		this.phones.remove(selectedPhone);
		return cansel();
	}
	
	public String updatePhone() {
		servicePhone.update(selectedPhone);
		this.phones.set(indexPhones, selectedPhone);
		return cansel();
	}
	
	public String addPhone() {
		this.selectedPhone.setId(null);
		phones.add(servicePhone.add(selectedPhone));
		return cansel();
	}
	
	public String cansel() {
		this.selectedPhone = new Phone();
		return "internal-phone?faces-redirect=true";
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public Phone getSelectedPhone() {
		return selectedPhone;
	}

}
