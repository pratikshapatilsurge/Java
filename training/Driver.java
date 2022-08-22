package training;

 class Student {
	int no;
	String name;
	
	public void setNo(int no) {
		this.no=no;
	}
    public void setName(String name) {
    	this.name=name;	
    }
    public int getNo() {
    	return no;
    }
    public String getName() {
    	return name;
    }
}


public class Driver{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setNo(101);
		s1.setName("pp");
		updateObject(s1);
		System.out.println(s1.getNo() + " " + s1.getName());
	}
		
    static void updateObject (Student s2) {
	System.out.println(s2.getNo() + " " + s2.getName());
	s2.setNo(102);
	s2.setName("Akhila");
	//System.out.println(s2.getNo() + " " + s2.getName());
}
	
}