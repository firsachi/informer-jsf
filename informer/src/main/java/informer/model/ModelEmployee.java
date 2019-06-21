/**
 * 
 */
package informer.model;

/**
 * @author firsov
 *
 */
public class ModelEmployee {
	
	private Integer employeeId;
	
	private String surname;
	
	private String name;
	
	private String email;
	
	private String patronymic;
	
	private ModelCompany company;
	
	private ModelDepartment departmet;
	
	private ModelPost post;
	
	private ModelPhone phone;
	
	private ModelRoom room;
	
	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	
	public String getEmailMailto() {
		return "<" + email + ">";
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public ModelCompany getCompany() {
		return company;
	}

	public void setCompany(ModelCompany company) {
		this.company = company;
	}

	public ModelDepartment getDepartmet() {
		return departmet;
	}

	public void setDepartmet(ModelDepartment departmet) {
		this.departmet = departmet;
	}
	
	public ModelPost getPost() {
		return post;
	}

	public void setPost(ModelPost post) {
		this.post = post;
	}
	
	public ModelPhone getPhone() {
		return phone;
	}

	public void setPhone(ModelPhone phone) {
		this.phone = phone;
	}

	public ModelRoom getRoom() {
		return room;
	}

	public void setRoom(ModelRoom room) {
		this.room = room;
	}

	public Builder build() {
		return new Builder();
	}
	
	public class Builder {
		
		private Builder() {
			
		}
		
		public Builder withEmployeeId(Integer employeeId) {
			ModelEmployee.this.setEmployeeId(employeeId);
			return this;
		}
		
		public Builder withSurname(String surname) {
			ModelEmployee.this.setSurname(surname);
			return this;
		}
		
		public Builder withName(String name) {
			ModelEmployee.this.setName(name);
			return this;
		}
		
		public Builder withPatronymic(String patronymic) {
			ModelEmployee.this.patronymic = patronymic;
			return this;
		}
		
		public Builder withEmail(String email) {
			ModelEmployee.this.email = email;
			return this;
		}
		
		public Builder withCompany(ModelCompany company) {
			ModelEmployee.this.company = company;
			return this;
		}
		
		public Builder withDepartment(ModelDepartment department) {
			ModelEmployee.this.departmet = department;
			return this;
		}
		
		public Builder withPost(ModelPost post) {
			ModelEmployee.this.post = post;
			return this;
		}
		
		public Builder withPhone(ModelPhone phome) {
			ModelEmployee.this.phone = phome;
			return this;
		}
		
		public Builder withRoom(ModelRoom modelRoom) {
			ModelEmployee.this.room = modelRoom;
			return this;
		}
		
		public ModelEmployee build() {
			return ModelEmployee.this;
		}
	}


	
}
