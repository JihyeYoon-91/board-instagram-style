package SnsuserDto;

public class SnsuserDto {
	private String id;
	private String pwd;
	private String pwd2;
	private String email;
	private String regdate;
	private String profile;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPwd2() {
		return pwd2;
	}
	public void setPwd2(String pwd2) {
		this.pwd2 = pwd2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public SnsuserDto(){};
	public SnsuserDto(String id, String pwd, String pwd2, String email, String regdate, String profile) {
		this.id = id;
		this.pwd = pwd;
		this.pwd2 = pwd2;
		this.email = email;
		this.regdate = regdate;
		this.profile = profile;
	}
	
	
}
