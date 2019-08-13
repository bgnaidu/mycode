package com.naidu.springCore.prperties;

import java.util.Properties;

public class Country {

	private Properties countryandlangs;

	public Properties getCountryandlangs() {
		return countryandlangs;
	}

	public void setCountryandlangs(Properties countryandlangs) {
		this.countryandlangs = countryandlangs;
	}

	@Override
	public String toString() {
		return "Country [countryandlangs=" + countryandlangs + "]";
	}
}
