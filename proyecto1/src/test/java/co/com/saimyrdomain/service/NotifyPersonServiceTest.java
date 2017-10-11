package co.com.saimyrdomain.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import co.com.saimyrdomain.Person;
import co.com.saimyrdomain.testDataBuilder.PersonTestDataBuilder;

public class NotifyPersonServiceTest {

	private NotifyPersonService notifyPersonSerice;
	private EmailService emailService;
	
	@Before
	public void setup(){
//		emailService = new EmailService();
		emailService = Mockito.mock(EmailService.class);
		notifyPersonSerice = new NotifyPersonService(emailService);
	}
	
	@Test
	public void notifyTest (){
		//Arrange preparar datos
		Person person = new PersonTestDataBuilder().build();
		Mockito.when(emailService.sendEmail(Mockito.anyString())).thenReturn("Ya corregido");
		
		//Act ejecutar
		String message = notifyPersonSerice.notify(person);
		
		// Assert verificar
		Assert.assertNotNull(message);
	}
}
