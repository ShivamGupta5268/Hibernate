package com.rays;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course; 
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	private String course;
	
	private String duration;
}
