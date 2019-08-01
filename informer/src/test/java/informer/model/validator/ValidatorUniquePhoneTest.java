package informer.model.validator;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import informer.entity.Phone;
import informer.repository.RepositoryPhone;

public class ValidatorUniquePhoneTest {
	
	@Mock
	private RepositoryPhone repositoryPhone;
	
	@InjectMocks
	private ValidatorUniquePhone validatorUniquePhone;
	
	private Phone testPhone;

	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
		testPhone = new Phone();
		testPhone.setId(1);
		testPhone.setNumber("101");
	}
	
	@Test
	public void testValidate() {
		String findNumber = "101";
		when(repositoryPhone.findNumberPhone(findNumber)).thenReturn(testPhone);
		Phone actual = repositoryPhone.findNumberPhone(findNumber);
		verify(repositoryPhone, times(1)).findNumberPhone(findNumber);
		assertEquals(testPhone, actual);
	}
	
	@Test
	public void testValidate_NO_RESULT() {
		String findNumber = "101";
		when(repositoryPhone.findNumberPhone(findNumber)).thenReturn(testPhone);
		Phone actual =repositoryPhone.findNumberPhone(findNumber);
		verify(repositoryPhone, times(1)).findNumberPhone("102");
		assertNull(actual);
	}

}
