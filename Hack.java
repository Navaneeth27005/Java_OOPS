class student{
    String name;
    String rollno;
    void study(String name,String roll){
        System.out.println("Student "+name+" with Roll No "+roll+" is studying in Vasavi ");
    }
}
class Hack
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    student s=new student();
	    s.name="Navaneeth";
	    s.rollno="1602-23-737-111";
	    s.study(s.name,s.rollno);

	}
}
