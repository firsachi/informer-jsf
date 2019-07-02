/**
 * 
 */
package informer.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.transaction.Transactional;

import informer.entity.Room;
import informer.model.ModelRoom;
import informer.repository.RepositoryRoom;
import informer.service.convertor.ConvertorBase;

/**
 * @author firsov
 *
 */
@Stateless
public class ServiceRoom {
	
	@Inject
	private RepositoryRoom repository;
	
	@EJB(beanName = "ConvertorRoom")
	private ConvertorBase<Room, ModelRoom> convertor;
	
	public List<ModelRoom> all(){
		return repository.all().stream().map(e -> convertor.entityToModel(e)).collect(Collectors.toList());
	}

	@Transactional
	public Integer add(ModelRoom model) {
		return repository.create(convertor.modelToEntity(model)).getId();
	}

	@Transactional
	public ModelRoom findId(Integer primaryKey) {
		return convertor.entityToModel(repository.find(primaryKey));
	}

	@Transactional
	public void update(ModelRoom model) {
		repository.update(convertor.modelToEntity(model));
	}


}
