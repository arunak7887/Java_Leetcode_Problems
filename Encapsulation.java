class Student{
	private String name;

	public void setName(String name){
		this.name=name;

	} 
	public String getName(){
		return name;
	}

}
public class Encapsulation{
	public static void main(String args[]){
		Student s1=new Student();
		s1.setName("Arun");
		System.out.println(s1.getName());

	}
}