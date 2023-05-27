package StudentDto;

import javax.persistence.*;

@Entity(name="Student")
public class Studentdto {
	
	private int std_id;
	private String std_name;
	
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	
	
}
