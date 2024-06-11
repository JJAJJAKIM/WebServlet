package db;

import java.sql.Time;

public class DBTable {
	private String name;
	private String email;
	private String pwd;
	private String gender;
	private Time regDate;
	private int no;
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
	public Time getRegDate() {
		return regDate;
	}
	public void setRegDate(Time regDate) {
		this.regDate = regDate;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "DBTable [name=" + name + ", email=" + email + ", pwd=" + pwd + ", gender=" + gender + ", regDate="
				+ regDate + ", no=" + no + "]";
	}
	
	
}
