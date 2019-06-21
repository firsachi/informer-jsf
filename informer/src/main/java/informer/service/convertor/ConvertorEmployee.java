/**
 * 
 */
package informer.service.convertor;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import informer.entity.Department;
import informer.entity.Employee;
import informer.entity.Phone;
import informer.entity.Post;
import informer.entity.Room;
import informer.model.ModelDepartment;
import informer.model.ModelEmployee;
import informer.model.ModelPhone;
import informer.model.ModelPost;
import informer.model.ModelRoom;

/**
 * @author firsov
 *
 */
@Stateless
public class ConvertorEmployee implements ConvertorBase<Employee, ModelEmployee> {

	@EJB(beanName = "ConvertorDepartment")
	private ConvertorBase<Department, ModelDepartment> convertorDepartment;

	@EJB(beanName = "ConvertorPost")
	private ConvertorBase<Post, ModelPost> convertorPost;

	@EJB(beanName = "ConvertorPhone")
	private ConvertorBase<Phone, ModelPhone> convertorPhone;
	
	@EJB(beanName = "ConvertorRoom")
	private ConvertorBase<Room, ModelRoom> convertorRoom;

	@Override
	public ModelEmployee entityToModel(Employee entity) {
		return new ModelEmployee().build().withEmployeeId(entity.getId()).withName(entity.getName())
				.withPatronymic(entity.getPatronymic()).withSurname(entity.getSurname()).withEmail(entity.getEmail())
				.withDepartment(convertorDepartment.entityToModel(entity.getDepartment()))
				.withPost(convertorPost.entityToModel(entity.getPost()))
				.withPhone(convertorPhone.entityToModel(entity.getPhone()))
				.withRoom(convertorRoom.entityToModel(entity.getRoom())).build();
	}

	@Override
	public Employee modelToEntity(ModelEmployee model) {
		// TODO Auto-generated method stub
		return null;
	}

}
