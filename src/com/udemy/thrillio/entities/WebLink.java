package com.udemy.thrillio.entities;

import com.udemy.thrillio.partner.Shareable;

public class WebLink extends Bookmark implements Shareable {
	private String url;
	private String host;

	@Override
	public String toString() {
		return "WebLink [url=" + url + ", host=" + host + "]";
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Override
	public boolean isKidFriendlyEligible() {
		if(url.contains("porn") || getTitle().contains("porn") || host.contains("adult")) {
			return false;
		}
		return true;
	}

	@Override
	public String getItemData() {
		// TODO Auto-generated method stub
		return null;
	}

}
