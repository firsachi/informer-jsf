/**
 * 
 */
package informer.repository;

import java.util.List;

import javax.inject.Named;
import javax.persistence.NoResultException;

import informer.entity.Phone;

/**
 * @author firsov
 *
 */
@Named
public interface RepositoryPhone extends RepositoryBase<Phone>{

	List<Phone> all();

	Phone findNumberPhone(String value) throws NoResultException;

}
