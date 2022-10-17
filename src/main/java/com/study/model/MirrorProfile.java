package com.study.model;

public class MirrorProfile {
	
	
	
	public String getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(String acc_id) {
		this.acc_id = acc_id;
	}
	public String getAcc_pw() {
		return acc_pw;
	}
	public void setAcc_pw(String acc_pw) {
		this.acc_pw = acc_pw;
	}
	public String getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
	public int getMirrorIdx() {
		return mirrorIdx;
	}
	public void setMirrorIdx(int mirrorIdx) {
		this.mirrorIdx = mirrorIdx;
	}
	public int getAccountIndex() {
		return accountIndex;
	}
	public void setAccountIndex(int accountIndex) {
		this.accountIndex = accountIndex;
	}
	
	private String serialNum;
	private int mirrorIdx;
	private int accountIndex;
	private String acc_id;
	private String acc_pw;
	
	public MirrorProfile(String serialNum, int mirrorIdx, int accountIndex, String acc_id, String acc_pw) {
		this.serialNum = serialNum;
		this.mirrorIdx = mirrorIdx;
		this.accountIndex = accountIndex;
		this.acc_id = acc_id;
		this.acc_pw = acc_pw;
	}
}
