package service;

import memorydao.UserMemoryDAO;
import dao.UserDAO;
import domain.User;
import service.interfaces.EmailProvider;

public class FakeEmailProvider implements EmailProvider{

	UserDAO dao;
	
	
	public FakeEmailProvider(UserDAO dao){
		this.dao= dao;
	}
	
	
	@Override
	public void sentActivationEmail(User toUser) {
		System.out.println("Email sent to "+ toUser.getEmail().getFullEmailAdress());
		activateProfile(toUser);
	}
	
	private void activateProfile(User user){
		dao.getByEmail(user.getEmail().getFullEmailAdress()).setValid(true);
		System.out.println("Profile activated");
	}
}
