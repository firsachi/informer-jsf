/**
 * 
 */
package informer.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import informer.entity.Employee;
import informer.model.ModelEmployee;
import informer.repository.RepositoryEmployee;
import informer.service.convertor.ConvertorBase;

/**
 * @author firsov
 *
 */
@Stateless
public class ServiceEmployee {

	@EJB
	private RepositoryEmployee repositoryEmployee;

	@EJB(beanName = "ConvertorEmployee")
	private ConvertorBase<Employee, ModelEmployee> convertor;

	public List<ModelEmployee> findDepartmentCompanyDisable(Integer departmentId, Integer companyId, boolean disable) {
		return repositoryEmployee.findDepartmentCompanyDisable(departmentId, companyId, disable).stream()
				.map(e -> convertor.entityToModel(e)).collect(Collectors.toList());
	}

}
