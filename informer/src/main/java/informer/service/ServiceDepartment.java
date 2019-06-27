/**
 * 
 */
package informer.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import informer.entity.Department;
import informer.model.ModelDepartment;
import informer.repository.RepositoryDepartment;
import informer.service.convertor.ConvertorBase;

/**
 * @author firsov
 *
 */
@Stateless
public class ServiceDepartment {

	@EJB
	private RepositoryDepartment repositoryDepartment;

	@EJB(beanName = "ConvertorDepartment")
	private ConvertorBase<Department, ModelDepartment> convertorDepartment;

	public List<ModelDepartment> fillDepartmentCompany() {
		return repositoryDepartment.findNameCompany("").stream().map(e -> convertorDepartment.entityToModel(e))
				.collect(Collectors.toList());
	}
	
	
	public ModelDepartment fingId(Integer primaryKey) {
		return convertorDepartment.entityToModel(repositoryDepartment.find(primaryKey));
	}

}
