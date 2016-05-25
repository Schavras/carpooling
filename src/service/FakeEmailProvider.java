package service;

import domain.User;
import service.interfaces.EmailProvider;

public class FakeEmailProvider implements EmailProvider{

	@Override
	public void sentActivationEmail(User toUser) {
		System.out.println("Email sent to "+ toUser.getEmail());
		
	}
	
}
