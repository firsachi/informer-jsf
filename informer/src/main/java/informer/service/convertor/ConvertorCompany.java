/**
 * 
 */
package informer.service.convertor;

import javax.ejb.Stateless;

import informer.entity.Company;
import informer.model.ModelCompany;

/**
 * @author firsov
 *
 */
@Stateless
public class ConvertorCompany implements ConvertorBase<Company, ModelCompany> {

	@Override
	public ModelCompany entityToModel(Company entity) {
		return new ModelCompany().builder().withCompanyId(entity.getId()).withCompanyName(entity.getName())
				.withCompanyDisable(entity.isRemove()).build();
	}

	@Override
	public Company modelToEntity(ModelCompany model) {
		// TODO Auto-generated method stub
		return null;
	}

}
