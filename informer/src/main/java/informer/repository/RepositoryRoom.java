/**
 * 
 */
package informer.repository;

import java.util.List;

import informer.entity.Room;


/**
 * @author firsov
 *
 */
public interface RepositoryRoom extends RepositoryBase<Room>{

	List<Room> all();

}
