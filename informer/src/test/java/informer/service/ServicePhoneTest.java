package informer.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import informer.entity.Phone;
import informer.repository.RepositoryPhone;

public class ServicePhoneTest {
	
	@Mock
	private RepositoryPhone repositoryPhone;
	
	@InjectMocks
	private ServicePhone servicePhone;
	
	@Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

	@Test
	public void testFindAll() {
		List<Phone> phones = new ArrayList<Phone>();
		phones.add(new Phone());
		Mockito.when(repositoryPhone.all()).thenReturn(phones);
		
		List<Phone> actual = servicePhone.findAll();
		Mockito.verify(repositoryPhone, Mockito.times(1)).all();
		assertEquals(phones.size(), actual.size());

	}

}
