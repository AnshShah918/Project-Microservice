package com.stackroute.kafka.projectmicroservice.model;

import java.util.Date;

public class Project {

	private String projects;
	private String projects_userId;
	
	public Project() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Project [projects=" + projects + ", projects_userId=" + projects_userId + "]";
	}
	public String getProjects() {
		return projects;
	}
	public void setProjects(String projects) {
		this.projects = projects;
	}
	public String getProjects_userId() {
		return projects_userId;
	}
	public void setProjects_userId(String projects_userId) {
		this.projects_userId = projects_userId;
	}
	
}
