package pogoClass;

public class PogoClassParent {

	private String createdBy;
	private String projectName;
	private String teamSize;
	private Object objRef;

	PogoClassParent()
	{
		super();
	}
	public PogoClassParent(String createdBy,String projectName,String teamSize,Object objRef )
	{
		this.createdBy=createdBy;
		this.projectName=projectName;
		this.teamSize=teamSize;
		this.objRef=objRef;
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


	public Object getStatusCode() {
		return objRef;
	}


	public void setStatusCode(Object objRef) {
		this.objRef = objRef;
	}

}
