import java.util.*;

public class SignupPage {
	private String username;
	private String password;
	private static Map<String, String> accounts = new HashMap<>();

	public SignupPage(String username, String password){
		this.username = username;
		this.password = password;
	}

	public void addAccount() {
		accounts.put(this.username, this.password);
	}
}
