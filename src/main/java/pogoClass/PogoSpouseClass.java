package pogoClass;

public class PogoSpouseClass {
	private String createdBy;
	private String[] projectName;
	
	
	public PogoSpouseClass(String createdBy,String[] projectName)
	{
		this.createdBy=createdBy;
		this.projectName=projectName;
		
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public String[] getProjectName() {
		return projectName;
	}


	public void setProjectName(String[] projectName) {
		this.projectName = projectName;
	}


}
