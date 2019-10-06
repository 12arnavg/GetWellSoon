package com.externalservice;

public class UrlInfo {

	private int urlId;
	private String urlName;

	public UrlInfo(int urlId, String urlName) {
		super();
		this.urlId = urlId;
		this.urlName = urlName;
	}

	public int getUrlId() {
		return urlId;
	}

	public void setUrlId(int urlId) {
		this.urlId = urlId;
	}

	public String getUrlName() {
		return urlName;
	}

	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}

}
