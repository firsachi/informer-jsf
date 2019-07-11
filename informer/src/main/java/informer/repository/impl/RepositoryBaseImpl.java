/**
 * 
 */
package informer.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import informer.repository.RepositoryBase;

/**
 * @author firsov
 *
 */
public abstract class RepositoryBaseImpl<E> implements RepositoryBase<E> {

	@PersistenceContext(unitName = "informerDS")
	protected EntityManager entityManager;

	private final Class<E> entityClass;

	public RepositoryBaseImpl(Class<E> entityClass) {
		super();
		this.entityClass = entityClass;
	}

	public Class<E> getEntityClass() {
		return entityClass;
	}
	
	public E create(E entity) {
		entityManager.persist(entity);
		return entity;
	}

	public void update(E entity) {
		entityManager.merge(entity);
	}

	public void delete(int primaryKey) {
		entityManager.remove(entityManager.find(entityClass, primaryKey));
	}
	
	public E find(Integer primaryKey) {
		return entityManager.find(entityClass, primaryKey);
	}

}
