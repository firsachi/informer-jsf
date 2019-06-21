/**
 * 
 */
package informer.model;

/**
 * @author firsov
 *
 */
public class ModelPost {
	
	private Integer postId;
	
	private String postName;
	
	private String heft;

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getHeft() {
		return heft;
	}

	public void setHeft(String heft) {
		this.heft = heft;
	}
	
	public Builder builder() {
		return new Builder();
	}
	
	public class Builder {
		
		private Builder() {
		}
		
		public Builder withPostId(Integer postId) {
			ModelPost.this.postId = postId;
			return this;
		}
		
		public Builder withPostName(String postName) {
			ModelPost.this.postName = postName;
			return this;
		}
		
		public Builder withHeft(String heft) {
			ModelPost.this.heft = heft;
			return this;
		}
		
		public ModelPost build() {
			return ModelPost.this;
		}
	}

	@Override
	public String toString() {
		return "ModelPost [postId=" + postId + ", postName=" + postName + ", heft=" + heft + "]";
	}
	
}
