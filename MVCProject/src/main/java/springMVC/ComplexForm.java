package springMVC;

import java.util.List;








public class ComplexForm {

	private String firstName;
	private String lastName;
	private String userName;
	private String city;
	private String state;
	private Integer zipcode;
	private String course;
	private List<String> multi;
	private String exampleRadios;
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public List<String> getMulti() {
		return multi;
	}
	public void setMulti(List<String> multi) {
		this.multi = multi;
	}
	private Boolean checkbox;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	public Boolean getCheckbox() {
		return checkbox;
	}
	public void setCheckbox(Boolean checkbox) {
		this.checkbox = checkbox;
	}
	public String getExampleRadios() {
		return exampleRadios;
	}
	public void setExampleRadios(String exampleRadios) {
		this.exampleRadios = exampleRadios;
	}
	@Override
	public String toString() {
		return "ComplexForm [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", city="
				+ city + ", state=" + state + ", zipcode=" + zipcode + ", course=" + course + ", multi=" + multi
				+ ", exampleRadios=" + exampleRadios + ", checkbox=" + checkbox + "]";
	}
	
	
	
	

}
