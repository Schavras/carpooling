package domain;

import types.CreditCard;
import types.Email;
import types.Password;
/**
 * @author      Stavros Zarpas
 * @version     0.1             
 * @since       30/04/2016
 */
public class User {
	
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
	 * Full Constractor
	 * @param id
	 * @param name
	 * @param surname
	 * @param email
	 * @param password
	 * @param age
	 * @param credit
	 * @param isValid
	 */
	public User(long id, String name, String surname, Email email,
			Password password, int age, CreditCard credit, boolean isValid) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.age = age;
		this.credit = credit;
		this.isValid = isValid;

	}

	/**
	 * Default
	 */
	public User() {
		this.id = 0;
		this.name = "";
		this.surname =  "";
		this.email = new Email();
		this.password = new Password();
		this.age = 0;
		this.credit = new CreditCard();
		this.isValid = false;
	}

	/**
	 * Minimum constructor
	 * @param id
	 * @param name
	 * @param surname
	 * @param email
	 * @param password
	 * @param isValid
	 */
	public User(long id, String name, String surname, Email email,
			Password password, boolean isValid) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.isValid = isValid;
		
		this.credit = new CreditCard();
		this.age = 0;
	}



	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
 
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the email
	 */
	public Email getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(Email email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public Password getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(Password password) {
		this.password = password;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the credit
	 */
	public CreditCard getCredit() {
		return credit;
	}

	/**
	 * @param credit the credit to set
	 */
	public void setCredit(CreditCard credit) {
		this.credit = credit;
	}

	/**
	 * @return the isValid
	 */
	public boolean isValid() {
		return isValid;
	}

	/**
	 * @param isValid the isValid to set
	 */
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((credit == null) ? 0 : credit.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
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
		User other = (User) obj;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + "] \n";
	}
	
	
	
	
	
}
