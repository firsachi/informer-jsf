/**
 * 
 */
package informer.model.validator;

import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.NoResultException;

import informer.repository.RepositoryRoom;

/**
 * @author firsachi
 *
 */
@Named
@FacesValidator("informer.model.validator.ValidatorNumberRoom")
public class ValidatorNumberRoom implements Validator<Integer> {

	@Inject
	private RepositoryRoom repository;

	@Override
	public void validate(FacesContext context, UIComponent component, Integer value) throws ValidatorException {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("i18n.error");
		
			if (null == value ) {
				messageError(resourceBundle.getString("errror.notnull"));
			}
			
			try {
				if (null != repository.findNumberRoom(value)) {
					messageError(resourceBundle.getString("errror.uniqueNumberRoom"));
				}
			}catch (NoResultException ex)
			{}			
				
	}

	private void messageError(String message) {
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, message, message);
		throw new ValidatorException(facesMessage);
	}
}
