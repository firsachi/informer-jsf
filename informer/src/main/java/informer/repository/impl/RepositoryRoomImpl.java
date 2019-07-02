/**
 * 
 */
package informer.repository.impl;

import java.util.List;

import javax.inject.Named;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import informer.entity.Room;
import informer.repository.RepositoryRoom;

/**
 * @author firsov
 *
 */
@Named
public class RepositoryRoomImpl extends RepositoryBaseImpl<Room> implements RepositoryRoom{
	
	
	public RepositoryRoomImpl() {
		super(Room.class);
	}

	@Override
	public List<Room> all() {
		TypedQuery<Room> query = entityManager.createNamedQuery("Room.all", Room.class);
		return query.getResultList();
	}

	@Override
	public Room findNumberRoom(Integer numberRoom) throws NoResultException{
		TypedQuery<Room> query = entityManager.createNamedQuery("Room.findNumberRoom", Room.class);
		query.setParameter("numberRoom", numberRoom);
		return query.getSingleResult();
	}


}
