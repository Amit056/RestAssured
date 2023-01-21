package pogoClass;


public class PojoClassEx {
	
	private String createdBy;
	private String projectName;
	private String teamSize;
	private String statusCode;
	
	
	public PojoClassEx(String createdBy,String projectName,String teamSize,String statusCode)
	{
		this.createdBy=createdBy;
		this.projectName=projectName;
		this.teamSize=teamSize;
		this.statusCode=statusCode;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public String getTeamSize() {
		return teamSize;
	}


	public void setTeamSize(String teamSize) {
		this.teamSize = teamSize;
	}


	public String getStatusCode() {
		return statusCode;
	}


	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	
	

	
	

}
