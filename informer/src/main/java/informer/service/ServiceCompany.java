/**
 * 
 */
package informer.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import informer.entity.Company;
import informer.model.ModelCompany;
import informer.repository.RepositoryCompany;
import informer.service.convertor.ConvertorBase;

/**
 * @author firsov
 *
 */
@Stateless
public class ServiceCompany {

	@EJB(beanName = "ConvertorCompany")
	private ConvertorBase<Company, ModelCompany> convertorCompany;

	@EJB
	private RepositoryCompany repositoryCompany;

	public List<ModelCompany> findEnable() {
		return repositoryCompany.fillDisabled(false).stream()
				.map(entity -> convertorCompany.entityToModel(entity))
				.collect(Collectors.toList());
	}

}
