package db;

public class DBTable {
	private String name;
	private String email;
	private String pwd;
	private String gender;
	private String regDate;
	private String no;
	
	public DBTable() {
		
	}
	
	public DBTable(String name, String email, String pwd, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.gender = gender;
	}
	
	
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "DBTable [name=" + name + ", email=" + email + ", pwd=" + pwd + ", gender=" + gender + ", regDate="
				+ regDate + ", no=" + no + "]";
	}


	
}
