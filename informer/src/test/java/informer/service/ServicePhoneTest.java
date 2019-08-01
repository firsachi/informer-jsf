package informer.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import informer.entity.Phone;
import informer.repository.RepositoryPhone;

public class ServicePhoneTest {
	
	@Mock
	private RepositoryPhone repositoryPhone;
	
	@InjectMocks
	private ServicePhone servicePhone;
	
	private Phone testPhone;
	
	@Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
        testPhone = new Phone();
		testPhone.setId(3);
		testPhone.setNumber("103");
    }

	@Test
	public void testFindAll() {
		List<Phone> phones = new ArrayList<Phone>();
	    Phone phone = new Phone();
	    phone.setId(1);
	    phone.setNumber("101");
	    phones.add(phone);
		phone = new Phone();
		phone.setId(2);
		phone.setNumber("102");
		phones.add(phone);
		
		when(repositoryPhone.all()).thenReturn(phones);
		
		List<Phone> actual = servicePhone.findAllPhone();
		verify(repositoryPhone, times(1)).all();
		assertEquals(phones.size(), actual.size());
	}
	
	@Test
	public void testAdd() {
		when(repositoryPhone.create(testPhone)).thenReturn(testPhone);
		Phone actual = servicePhone.add(testPhone);
		verify(repositoryPhone, times(1)).create(testPhone);
		assertEquals(testPhone, actual);
	}
	
	@Test
	public void testFindPrimaryKey() {
		when(repositoryPhone.find(3)).thenReturn(testPhone);
		Phone actual = servicePhone.findPrimaryKey(3);
		verify(repositoryPhone, times(1)).find(3);
		assertEquals(testPhone, actual);
	}
	
	@Test
	public void testFindPrimaryKey_NULL() {
		when(repositoryPhone.find(3)).thenReturn(testPhone);
		Phone actual = servicePhone.findPrimaryKey(2);
		verify(repositoryPhone, times(1)).find(2);
		assertNull(actual);
	}

}
