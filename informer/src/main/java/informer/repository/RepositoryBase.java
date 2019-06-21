/**
 * 
 */
package informer.repository;

/**
 * @author firsov
 *
 */
public interface RepositoryBase<E> {
	
	public E create(E entity);
	
	public void update(E entity);
	
	public void delete(int primaryKey);

}
