package informer.service.convertor;

import javax.ejb.Local;

@Local
public interface ConvertorBase<E, M> {
	
	
	M entityToModel(E entity);
	
	E modelToEntity(M model);

}
