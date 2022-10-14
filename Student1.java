import java.io.Serializable;

class Student1 implements Serializable
{
	int id;
	String name;

	public Student1(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
}