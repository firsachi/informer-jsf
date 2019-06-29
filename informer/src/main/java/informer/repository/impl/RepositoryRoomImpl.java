/**
 * 
 */
package informer.repository.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import informer.entity.Room;
import informer.repository.RepositoryRoom;

/**
 * @author firsov
 *
 */
@Stateless
public class RepositoryRoomImpl extends RepositoryBaseImpl<Room> implements RepositoryRoom{
	
	
	public RepositoryRoomImpl() {
		super(Room.class);
	}

	@Override
	public List<Room> all() {
		TypedQuery<Room> query = entityManager.createNamedQuery("Room.all", Room.class);
		return query.getResultList();
	}


}
