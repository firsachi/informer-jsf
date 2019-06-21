/**
 * 
 */
package informer.service.convertor;

import javax.ejb.Stateless;

import informer.entity.Post;
import informer.model.ModelPost;

/**
 * @author firsov
 *
 */
@Stateless
public class ConvertorPost implements ConvertorBase<Post, ModelPost> {

	@Override
	public ModelPost entityToModel(Post entity) {
		return new ModelPost().builder().withPostId(entity.getId()).withPostName(entity.getName())
				.withHeft(entity.getHeft()).build();
	}

	@Override
	public Post modelToEntity(ModelPost model) {
		// TODO Auto-generated method stub
		return null;
	}

}
