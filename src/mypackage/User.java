package mypackage;

public class User {
	private String Id;
	private String username;
	private String password;
	private String age;
	protected String getId() {
		return Id;
	}
	protected void setId(String id) {
		Id = id;
	}
	protected String getUsername() {
		return username;
	}
	protected void setUsername(String username) {
		this.username = username;
	}
	protected String getPassword() {
		return password;
	}
	protected void setPassword(String password) {
		this.password = password;
	}
	protected String getAge() {
		return age;
	}
	protected void setAge(String age) {
		this.age = age;
	}
	
	
}
