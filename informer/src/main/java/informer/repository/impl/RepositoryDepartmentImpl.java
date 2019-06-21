/**
 * 
 */
package informer.repository.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import informer.entity.Department;
import informer.repository.RepositoryDepartment;

/**
 * @author firsov
 *
 */
@Stateless
public class RepositoryDepartmentImpl extends RepositoryBaseImpl<Department> implements RepositoryDepartment {

	//TODO
	@Override
	public List<Department> findNameCompany(String nameCompany) {
		TypedQuery<Department> typedQuery = entityManager.createNamedQuery("Department.all", Department.class);
		return typedQuery.getResultList();
	}

	@Override
	public Department byId(int primaryKey) {
		return entityManager.find(Department.class, primaryKey);
	}

}
