package informer.service.convertor;

import javax.ejb.Stateless;

import informer.entity.Department;
import informer.model.ModelDepartment;

@Stateless
public class ConvertorDepartment implements ConvertorBase<Department, ModelDepartment> {

	@Override
	public ModelDepartment entityToModel(Department entity) {
		return new ModelDepartment().with().withDepartmentId(entity.getId()).withDepartmentName(entity.getName())
				.withPhone(entity.getPhone()).withFax(entity.getFax()).build();
	}

	@Override
	public Department modelToEntity(ModelDepartment model) {
		// TODO Auto-generated method stub
		return null;
	}

}
