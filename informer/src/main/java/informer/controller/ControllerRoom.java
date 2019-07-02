/**
 * 
 */
package informer.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import informer.model.ModelRoom;
import informer.service.ServiceRoom;

/**
 * @author firsov
 *
 */
@Named
@SessionScoped
public class ControllerRoom implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ServiceRoom serviceRoom;
	
	private List<ModelRoom> rooms;
	
	private ModelRoom selectedRoom;
	
	private int roomsIndex;
	
	@PostConstruct
	public void init() {
		this.rooms = serviceRoom.all();
		this.selectedRoom = new ModelRoom();
	}
	
	public void actionIsSelected(ActionEvent event) {
		Integer roomId = (Integer) event.getComponent().getAttributes().get("roomId");
		this.selectedRoom = serviceRoom.findId(roomId);
		this.roomsIndex = rooms.indexOf(selectedRoom);
	}
	
	public String addRoom() {
		this.selectedRoom.setRoomId(0);
		this.selectedRoom.setRoomId(serviceRoom.add(selectedRoom));
		rooms.add(selectedRoom);
		return cansel();
	}
	
	public String updateRoom() {
		serviceRoom.update(selectedRoom);
		this.rooms.set(roomsIndex, selectedRoom);
		return cansel();
	}
	
	public String cansel() {
		this.selectedRoom = new ModelRoom();
		return "room?faces-redirect=true";
	}

	public List<ModelRoom> getRooms() {
		return rooms;
	}

	public ModelRoom getSelectedRoom() {
		return selectedRoom;
	}
}
