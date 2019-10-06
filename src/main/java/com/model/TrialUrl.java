package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "urls")
public class TrialUrl {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long urlId;

	private String urlName;

	@OneToOne(mappedBy = "trialUrl")
	private Trial trial;

	public TrialUrl(long urlId, String url) {
		super();
		this.urlId = urlId;
		this.urlName = url;
	}

	public Trial getTrial() {
		return trial;
	}

	public void setTrial(Trial trial) {
		this.trial = trial;
	}

	public TrialUrl(String url) {
		this.urlName = url;
	}

	public TrialUrl() {
		super();
	}

	public long getUrlId() {
		return urlId;
	}

	public void setUrlId(long urlId) {
		this.urlId = urlId;
	}

	public String getUrlName() {
		return urlName;
	}

	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}

}
