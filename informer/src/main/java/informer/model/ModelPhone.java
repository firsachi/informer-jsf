/**
 * 
 */
package informer.model;

/**
 * @author firsov
 *
 */
public class ModelPhone {
	
	private Integer phoneId;
	
	private String numberPhone;

	public Integer getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(Integer phoneId) {
		this.phoneId = phoneId;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}
	
	public Builder builder() {
		return new Builder();
	}
	
	public class Builder {
		
		private Builder() {
			
		}
		
		public Builder withPhoneId(Integer phoneId) {
			ModelPhone.this.phoneId = phoneId;
			return this;
		}
		
		public Builder withNumberPhone(String numberPhone) {
			ModelPhone.this.numberPhone = numberPhone;
			return this;
		}
		
		public ModelPhone buid() {
			return ModelPhone.this;
		}
	}

	@Override
	public String toString() {
		return "ModelPhone [phoneId=" + phoneId + ", numberPhone=" + numberPhone + "]";
	}
	
}
