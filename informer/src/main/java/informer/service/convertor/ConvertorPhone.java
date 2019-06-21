/**
 * 
 */
package informer.service.convertor;

import javax.ejb.Stateless;

import informer.entity.Phone;
import informer.model.ModelPhone;

/**
 * @author firsov
 *
 */
@Stateless
public class ConvertorPhone implements ConvertorBase<Phone, ModelPhone> {

	@Override
	public ModelPhone entityToModel(Phone entity) {
		return new ModelPhone().builder().withPhoneId(entity.getId()).withNumberPhone(entity.getNumber()).buid();
	}

	@Override
	public Phone modelToEntity(ModelPhone model) {
		// TODO Auto-generated method stub
		return null;
	}

}
