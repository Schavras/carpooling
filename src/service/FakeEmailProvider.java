package service;

import memorydao.UserMemoryDAO;
import domain.User;
import service.interfaces.EmailProvider;

public class FakeEmailProvider implements EmailProvider{

	@Override
	public void sentActivationEmail(User toUser) {
		System.out.println("Email sent to "+ toUser.getEmail().getFullEmailAdress());
		activateProfile(toUser);
	}
	
	private void activateProfile(User user){
		UserMemoryDAO dao = new UserMemoryDAO();
		dao.getByEmail(user.getEmail().getFullEmailAdress()).setValid(true);
	}
}
