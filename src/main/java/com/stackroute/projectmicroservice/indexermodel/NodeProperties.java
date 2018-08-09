package com.stackroute.projectmicroservice.indexermodel;

public class NodeProperties {
	
	private String projectId;
	private String projectAt;
	private String role;
	private String department;
	private String projectLocation;
	private String projectTitle;
	private String teamSize;
	private String from;
	private String to;
	private String synopsis;
	private String url;
	private String demoURL;
	private String skills;
	
	public NodeProperties() {
		
	}
	
	public NodeProperties(String projectId, String projectAt, String role, String department, String projectLocation,
			String projectTitle, String teamSize, String from, String to, String synopsis, String url, String demoURL,
			String skills) {
		super();
		this.projectId = projectId;
		this.projectAt = projectAt;
		this.role = role;
		this.department = department;
		this.projectLocation = projectLocation;
		this.projectTitle = projectTitle;
		this.teamSize = teamSize;
		this.from = from;
		this.to = to;
		this.synopsis = synopsis;
		this.url = url;
		this.demoURL = demoURL;
		this.skills = skills;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectAt() {
		return projectAt;
	}
	public void setProjectAt(String projectAt) {
		this.projectAt = projectAt;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getProjectLocation() {
		return projectLocation;
	}
	public void setProjectLocation(String projectLocation) {
		this.projectLocation = projectLocation;
	}
	public String getProjectTitle() {
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}
	public String getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(String teamSize) {
		this.teamSize = teamSize;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDemoURL() {
		return demoURL;
	}
	public void setDemoURL(String demoURL) {
		this.demoURL = demoURL;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	

}
