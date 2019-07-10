/**
 * 
 */
package informer.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * @author firsov
 *
 */
@Named
@SessionScoped
public class ControllerTopBarPage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String roomPage() {
		return "room?faces-redirect=true";
	}
	
	public String phonePage() {
		return "internal-phone?faces-redirect=true";
	}
}
