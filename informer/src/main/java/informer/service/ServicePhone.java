/**
 * 
 */
package informer.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.transaction.Transactional;

import informer.entity.Phone;
import informer.repository.RepositoryPhone;

/**
 * @author firsov
 *
 */
@Stateless
public class ServicePhone {

	@Inject
	private RepositoryPhone repository;
	
	@Transactional
	public List<Phone> all(){
		return repository.all();
	}
	
	@Transactional
	public Phone add(Phone entity) {
		return repository.create(entity);
	}
	
	@Transactional
	public void update(Phone entity) {
		repository.update(entity);
	}
	
	@Transactional
	public Phone findPrimaryKey(Integer primaryKey) {
		return repository.find(primaryKey);
	}
}
