/**
 * 
 */
package informer.repository.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import informer.entity.Employee;
import informer.repository.RepositoryEmployee;

/**
 * @author firsov
 *
 */
@Stateless
public class RepositoryEmployeeImpl extends RepositoryBaseImpl<Employee> implements RepositoryEmployee {
	
	public RepositoryEmployeeImpl() {
		super(Employee.class);
	}

	@Override
	public List<Employee> findDepartmentCompanyDisable(int departmentId, int companyId, boolean disable) {
		TypedQuery<Employee> query = entityManager.createNamedQuery("Employee.findDepartmentCompanyDisable",
				Employee.class);
		query.setParameter("department", departmentId);
		query.setParameter("enterprise", companyId);
		query.setParameter("disable", disable);
		return query.getResultList();
	}

}
