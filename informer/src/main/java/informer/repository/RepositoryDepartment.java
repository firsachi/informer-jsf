/**
 * 
 */
package informer.repository;

import java.util.List;

import informer.entity.Department;

/**
 * @author firsov
 *
 */
public interface RepositoryDepartment extends RepositoryBase<Department> {
	
	List<Department> findNameCompany(String nameCompany);
	
}
