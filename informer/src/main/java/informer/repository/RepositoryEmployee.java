/**
 * 
 */
package informer.repository;

import java.util.List;

import informer.entity.Employee;

/**
 * @author firsov
 *
 */
public interface RepositoryEmployee extends RepositoryBase<Employee> {
	
	List<Employee> findDepartmentCompanyDisable(int departmentId, int companyId, boolean disable);

}
