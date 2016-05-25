package service.interfaces;

import domain.User;

public interface EmailProvider {
	
	public void sentActivationEmail(User toUser);
}
