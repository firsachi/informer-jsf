/**
 * 
 */
package informer.repository.impl;

import java.util.List;

import javax.inject.Named;
import javax.persistence.TypedQuery;

import informer.entity.Phone;
import informer.repository.RepositoryPhone;

/**
 * @author firsov
 *
 */
@Named
public class RepositoryPhoneImpl extends RepositoryBaseImpl<Phone> implements RepositoryPhone{

	public RepositoryPhoneImpl() {
		super(Phone.class);
	}

	@Override
	public List<Phone> all() {
		TypedQuery<Phone> query = entityManager.createNamedQuery("Phone.all", Phone.class);
		return query.getResultList();
	}

	@Override
	public Phone findNumberPhone(String numberPhone) {
		TypedQuery<Phone> query = entityManager.createNamedQuery("Phone.findNumerPhone", getEntityClass());
		query.setParameter("numberPhone", numberPhone);
		return query.getSingleResult();
	}

}
