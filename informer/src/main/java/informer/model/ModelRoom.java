/**
 * 
 */
package informer.model;

/**
 * @author firsov
 *
 */
public class ModelRoom {
	
	private Integer roomId;
	
	private Integer numberRoom;

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public Integer getNumberRoom() {
		return numberRoom;
	}

	public void setNumberRoom(Integer numberRoom) {
		this.numberRoom = numberRoom;
	}
	
	public Builder builder() {
		return new Builder();
	}
	
	public class Builder {
		
		private Builder() {
			
		}
		
		public Builder withRoomId(Integer roomId) {
			ModelRoom.this.roomId = roomId;
			return this;
		}
		
		public Builder withNumberRoom(Integer numberRoom) {
			ModelRoom.this.numberRoom = numberRoom;
			return this;
		}
		
		public ModelRoom build() {
			return ModelRoom.this;
		}
	}

}
