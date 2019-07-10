/**
 * 
 */
package informer.repository;

import java.util.List;

import javax.inject.Named;

import informer.entity.Phone;

/**
 * @author firsov
 *
 */
@Named
public interface RepositoryPhone extends RepositoryBase<Phone>{

	List<Phone> all();

}
