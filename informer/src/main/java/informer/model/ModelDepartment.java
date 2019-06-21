/**
 * 
 */
package informer.model;

/**
 * @author firsov
 *
 */
public class ModelDepartment {
	
	private Integer departmentId;
	
	private String departmentName;
	
	private String phone;
	
	private String fax;

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}
	
	public Builder with() {
		return new ModelDepartment(). new Builder();
		
	}
	
	public class Builder {
		
		private Builder() {
			
		}
		
		public Builder withDepartmentId(Integer departmentId) {
			ModelDepartment.this.departmentId = departmentId;
			return this;
		}
		
		public Builder withDepartmentName(String departmentName) {
			ModelDepartment.this.departmentName = departmentName;
			return this;
		}
		
		public Builder withPhone(String phone) {
			ModelDepartment.this.phone = phone;
			return this;
		}
		
		public Builder withFax(String fax) {
			ModelDepartment.this.fax = fax;
			return this;
		}
		
		public ModelDepartment build() {
			return ModelDepartment.this;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departmentId == null) ? 0 : departmentId.hashCode());
		result = prime * result + ((departmentName == null) ? 0 : departmentName.hashCode());
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
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
		ModelDepartment other = (ModelDepartment) obj;
		if (departmentId == null) {
			if (other.departmentId != null)
				return false;
		} else if (!departmentId.equals(other.departmentId))
			return false;
		if (departmentName == null) {
			if (other.departmentName != null)
				return false;
		} else if (!departmentName.equals(other.departmentName))
			return false;
		if (fax == null) {
			if (other.fax != null)
				return false;
		} else if (!fax.equals(other.fax))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ModelDepartment [departmentId=" + departmentId + ", departmentName=" + departmentName + ", phone="
				+ phone + ", fax=" + fax + "]";
	}
	
}
