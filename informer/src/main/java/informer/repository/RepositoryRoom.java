/**
 * 
 */
package informer.repository;

import java.util.List;

import javax.persistence.NoResultException;

import informer.entity.Room;


/**
 * @author firsov
 *
 */
public interface RepositoryRoom extends RepositoryBase<Room>{

	List<Room> all();

	Room findNumberRoom(Integer numberRoom) throws NoResultException;

}
