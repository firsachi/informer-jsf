package informer.repository.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import informer.entity.Company;
import informer.repository.RepositoryCompany;

@Stateless
public class RepositoryCompanyImpl extends RepositoryBaseImpl<Company> implements RepositoryCompany{
	
	public RepositoryCompanyImpl() {
		super(Company.class);
	}

	@Override
	public List<Company> fillDisabled(boolean disabale) {
		TypedQuery<Company> query = entityManager.createNamedQuery("Company.findDisaleEnable", Company.class);
		query.setParameter("disable", disabale);
		return query.getResultList();
	}

}
