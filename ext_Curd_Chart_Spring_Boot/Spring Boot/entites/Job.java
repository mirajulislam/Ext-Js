package SpringBoot.entites;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spring_ext_curd")
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int jobId;
	private String title;
	private String jobtype;
	private String location;
	private String categories;
	
	public Job() {
		
	}
	
	

	public Job(int jobId, String title, String jobtype, String location, String categories) {
		this.jobId = jobId;
		this.title = title;
		this.jobtype = jobtype;
		this.location = location;
		this.categories = categories;
	}



	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getJobtype() {
		return jobtype;
	}

	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}
	
	
	
}
