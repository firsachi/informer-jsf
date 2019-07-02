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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numberRoom == null) ? 0 : numberRoom.hashCode());
		result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModelRoom other = (ModelRoom) obj;
		if (numberRoom == null) {
			if (other.numberRoom != null)
				return false;
		} else if (!numberRoom.equals(other.numberRoom))
			return false;
		if (roomId == null) {
			if (other.roomId != null)
				return false;
		} else if (!roomId.equals(other.roomId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ModelRoom [roomId=" + roomId + ", numberRoom=" + numberRoom + "]";
	}
	
}
