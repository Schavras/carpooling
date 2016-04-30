package user;

import types.CreditCard;
import types.Email;
import types.Password;
/**
 * @author      Stavros Zarpas
 * @version     0.1             
 * @since       30/04/2016
 */
public class user {
	
	/**
	 * Identifier unique for each user
	 */
	long id;
	
	
	/**
	 * Name of the user
	 */
	String name;
	
	/**
	 * Lastname of the user
	 */
	String surname;
	
	/**
	 * the email adress of user
	 */
	Email email;
	
	/**
	 * Encrypted password
	 */
	Password password;
	
	/**
	 * The age of the user
	 */
	int age;
	
	/**
	 * 
	 */
	CreditCard credit;
	
	/**
	 * True if the account is valid
	 */
	boolean isValid;
	
	/**
	 *true if the user is driver 
	 */
	boolean isDriver;

	/**
	 * Full Constractor
	 * @param id
	 * @param name
	 * @param surname
	 * @param email
	 * @param password
	 * @param age
	 * @param credit
	 * @param isValid
	 * @param isDriver
	 */
	public user(long id, String name, String surname, Email email,
			Password password, int age, CreditCard credit, boolean isValid,
			boolean isDriver) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.age = age;
		this.credit = credit;
		this.isValid = isValid;
		this.isDriver = isDriver;
	}

	/**
	 * Default
	 */
	public user() {
		this.id = 0;
		this.name = "";
		this.surname =  "";
		this.email = new Email();
		this.password = new Password();
		this.age = 0;
		this.credit = new CreditCard();
		this.isValid = false;
		this.isDriver = false;
	}

	/**
	 * @param id
	 * @param name
	 * @param surname
	 * @param email
	 * @param password
	 * @param isValid
	 */
	public user(long id, String name, String surname, Email email,
			Password password, boolean isValid) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.isValid = isValid;
		
		this.credit = new CreditCard();
		this.age = 0;
		this.isDriver = false;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Email getEmail() {
		return email;
	}

	public Password getPassword() {
		return password;
	}

	public int getAge() {
		return age;
	}

	public CreditCard getCredit() {
		return credit;
	}

	public boolean isValid() {
		return isValid;
	}

	public boolean isDriver() {
		return isDriver;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public void setPassword(Password password) {
		this.password = password;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCredit(CreditCard credit) {
		this.credit = credit;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public void setDriver(boolean isDriver) {
		this.isDriver = isDriver;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((credit == null) ? 0 : credit.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (isDriver ? 1231 : 1237);
		result = prime * result + (isValid ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		user other = (user) obj;
		if (age != other.age)
			return false;
		if (credit == null) {
			if (other.credit != null)
				return false;
		} else if (!credit.equals(other.credit))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (isDriver != other.isDriver)
			return false;
		if (isValid != other.isValid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	
	
	
	
	
}
