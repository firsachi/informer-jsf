/**
 * 
 */
package informer.service.convertor;

import javax.ejb.Stateless;

import informer.entity.Room;
import informer.model.ModelRoom;

/**
 * @author firsov
 *
 */
@Stateless
public class ConvertorRoom implements ConvertorBase<Room, ModelRoom>{

	@Override
	public ModelRoom entityToModel(Room entity) {
		return new ModelRoom().builder().withRoomId(entity.getId()).withNumberRoom(entity.getNumberRoom()).build();
	}

	@Override
	public Room modelToEntity(ModelRoom model) {
		// TODO Auto-generated method stub
		return null;
	}

}
