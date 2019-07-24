package com.naidu.springCore.stereotypeannotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
	@Value("A book for corejava")
	private String title;
	@Value("corejava programming")
	private String name;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Profile [title=" + title + ", name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

}
