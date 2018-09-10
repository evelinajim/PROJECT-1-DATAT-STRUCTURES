public class Student{
	private String studentID;
	private String name;
	private int quiz1;
	private int quiz2;
	private int midterm;
	private int finalexam;
	private double avg;
	private String grade;
	
	public Student ()
	{
		// TODO initialize all the private data members (id="na", n="na", quiz1=0, quiz2=0, 
		// midterm=0, finalexam=0, avg=0.0, grade="na") 

		// Here is an example
		//this("na","na", 0, 0, 0, 0, 0.0, "na");
		studentID = "na";
		name ="na";
		quiz1 = 0;
		quiz2 = 0;
        midterm = 0;
        avg = 0.0;
        finalexam = 0;
        grade = "na";
	}
	
	public Student (String id, String n, int q1, int q2, int m, int f)
	{
		// TODO initialize all the private data members with the given arguments, while the grade is "na" 
		
		// Here is an example
		this(id, n, q1, q2, m, f, 0.0, "na");
		studentID = id;
		name = n;
		quiz1 = q1;
		quiz2 = q2;
        midterm = m;
        avg = 0.0;
        finalexam = f;
        grade = "na";
	}
	public Student (String id, String n, int q1, int q2, int m, int f, double a, String letterGrade)
	{
		// TODO initialize all the private data members with the given arguments 
		
		// Here is an example
		studentID=id;
		name=n;
		quiz1=q1;
		quiz2=q2;
		midterm=m;
		finalexam=f;
		avg=a;
		grade=letterGrade;
		
	}
	
	public void set(String id, String n, int q1, int q2, int m, int f, double a, String g)
	{
		// TODO set all the private data members with the given arguments 
		studentID=id;
		name=n;
		quiz1=q1;
		quiz2=q2;
		midterm=m;
		finalexam=f;
		avg=a;
		grade=g;
	}
	
	public double calcAvg()
	{
		// TODO Calculate the average grade (avg) based on the student's scores (quiz1, quiz2, midterm and finalexam)  
		double quizavg = 0;
		double midtermavg = 0;
		double favg = 0;
		quizavg = (quiz1 + quiz2)*1.25;
		midtermavg = (midterm*0.25);
		favg = finalexam*0.5;
		//avg = quizavg + midtermavg + favg;
		avg = (finalexam)*0.5 + (midterm)*0.25 + ((quiz1+quiz2)) * 1.25;
		return avg;
	}
	
	public String calcGrade()
	{
		// TODO Calculate the letter grade (A, B, C, D and F) based on the student's average grade (avg)
		if (avg >= 90)
        {
            grade = "A";
        }
        else if (avg < 90 && avg >= 80)
        {
            grade = "B";
        }
        else if (avg < 80 && avg >= 70)
        {
            grade = "C";
        }
        else if (avg < 70 && avg >= 60)
        {
        	grade = "D";
        }
        else
        {
        	grade = "F";
        }
		return grade;
	}
	
	public String getID()
	{
		// TODO return studentID
        // Here is an example
		return studentID;
	}
	
	public String getName()
	{
		// TODO return name
		return name;
	}
	
	public int getQuiz1()
	{
		// TODO return quiz1
		return quiz1;
	}
	
	public int getQuiz2()
	{
		// TODO return quiz2
		return quiz2;
	}
	
	public int getMidterm()
	{
		// TODO return midterm
		return midterm;
	}
	
	public int getFinalexam()
	{
		// TODO return finalexam
		return finalexam;
	}
	
	
	public double getAvg()
	{
		// TODO calculate the average grade and return the calculated value (avg)
		avg = (finalexam)*0.5 + (midterm)*0.25 + ((quiz1+quiz2)) * 1.25;
		
		return avg;
	}
	
	public String getGrade()
	{
		// TODO calculate the letter grade and return the calculated value (grade)
		if (avg >= 90)
        {
            grade = "A";
        }
        else if (avg < 90 && avg >= 80)
        {
            grade = "B";
        }
        else if (avg < 80 && avg >= 70)
        {
            grade = "C";
        }
        else if (avg < 70 && avg >= 60)
        {
        	grade = "D";
        }
        else
        {
        	grade = "F";
        }
		return grade;
	}
	
}

