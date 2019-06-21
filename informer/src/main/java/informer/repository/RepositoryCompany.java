/**
 * 
 */
package informer.repository;

import java.util.List;

import informer.entity.Company;

/**
 * @author firsov
 *
 */
public interface RepositoryCompany extends RepositoryBase<Company> {
	
	List<Company> fillDisabled(boolean disabale);

}
