package GenericLib;

public class PojoArrayEx {
	private String createdBy;
	private String projectName;
	private int[] teamSize;
	private int statusCode;
	
	public PojoArrayEx()
	{
		super();
	}
	
	
	public PojoArrayEx(String createdBy, String projectName,int[] teamSize,int statusCode)
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

	public int[] getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int[] teamSize) {
		this.teamSize = teamSize;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
}
