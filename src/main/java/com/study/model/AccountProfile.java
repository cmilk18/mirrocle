package com.study.model;

public class AccountProfile {
	public AccountProfile(int idx, String id, String pw, String email, String name,int mirrorIdx) {
		super();
		this.id = id;
		this.pw = pw;
		this.idx = idx;
		this.email = email;
		this.name = name;
		this.mirrorIdx = mirrorIdx;
	}
	public AccountProfile() {
		
	}

	private String id;
	private String name;
	private String email;
	private String pw;
	private int idx;
	private int mirrorIdx;
	
	
	public int getMirrorIdx() {
		return mirrorIdx;
	}
	public void setMirrorIdx(int mirrorIdx) {
		this.mirrorIdx = mirrorIdx;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
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
}
