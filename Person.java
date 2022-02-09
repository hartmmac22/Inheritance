public class Person {
	private String name;
	private int birth;
	
	public Person (String name, int birth) {  //create constructor
		this.name = name;
		this.birth = birth;
		
	}
	
	public String toString() {
		return ("Scholar: " + name + ", " + birth);
		
	}
}
