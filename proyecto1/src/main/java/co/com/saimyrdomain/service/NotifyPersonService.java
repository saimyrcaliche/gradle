package co.com.saimyrdomain.service;

import co.com.saimyrdomain.Person;

public class NotifyPersonService {
	private EmailService emailService;

	public NotifyPersonService(EmailService emailService) {
		this.emailService = emailService;
	}
	
	public String notify (Person person){
		String message = "Welcom " + person.getName() + " " + person.getLastName();
		return emailService.sendEmail(message);
	}
}
