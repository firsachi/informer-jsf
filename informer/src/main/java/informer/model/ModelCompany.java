/**
 * 
 */
package informer.model;

/**
 * @author firsov
 *
 */
public class ModelCompany {
	
	private Integer companyId;
	
	private String comapnyName;
	
	private boolean disable;

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getName() {
		return comapnyName;
	}

	public void setName(String name) {
		this.comapnyName = name;
	}

	public boolean isDisable() {
		return disable;
	}

	public void setDisable(boolean disable) {
		this.disable = disable;
	}
	
	public Builder builder() {
		return new Builder();
	}
	
	public class Builder {
		
		private Builder() {
			
		}
		
		public Builder withCompanyId(Integer companyId) {
			ModelCompany.this.companyId = companyId;
			return this;
		}
		
		public Builder withCompanyName(String comapnyName) {
			ModelCompany.this.comapnyName = comapnyName;
			return this;
		}
		
		public Builder withCompanyDisable(boolean disable) {
			ModelCompany.this.disable = disable;
			return this;
		}
		
		public ModelCompany build() {
			return ModelCompany.this;
		}
	}

	@Override
	public String toString() {
		return "ModelCompany [companyId=" + companyId + ", comapnyName=" + comapnyName + ", disable=" + disable + "]";
	}
	
}
