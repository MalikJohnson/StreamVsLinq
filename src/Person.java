import java.time.LocalDate;

public class Person {
	
	//String not string
	private int Id;
    private String Name;
    private LocalDate Date;
    private int Age;
    private String Job;

    public int getId()
    {
        return Id;
    }
    public void setId(int Id)
    {
        this.Id = Id;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public LocalDate getDate()
    {
        return Date;
    }
    public void setDate(LocalDate Date)
    {
        this.Date = Date;
    }
    public int getAge()
    {
        return Age;
    }
    public void setAge(int Age)
    {
        this.Age = Age;
    }

    public String getJob()
    {
        return Job;
    }
    public void setJob(String Job)
    {
        this.Job = Job;
    }

    public Person(int Id, String Name, LocalDate Date, int Age, String Job)
    {
        this.Id = Id;
        this.Name = Name;
        this.Date = Date;
        this.Age = Age;
        this.Job = Job;
    }

    public Person()
    {

    }
}
