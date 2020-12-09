public class Mydate {
	int year;
	int date;
	int month;
	public Mydate()
	{
		year=2020;
		month=12;
		date=17;
		
	}
	public Mydate(int date,int month,int year)
	{
		this.year=year;
		this.month=month;
		this.date=date;
		
	}
	
	public void display()
	{
		System.out.println(date+"/"+month+"/"+year);
	}
	
	
	@Override
	public String toString() {
		return "" + year + "/" + date + "/" + month + "";
	}
	public void set(int date)
	{
		this.date=date;
		
		
	}
	public int get()
	{
		return date;
		
	}
	public static void main(String[] args) {
		Mydate obj=new Mydate();
		Mydate obj2=new Mydate(9,12,2020);
		obj2.display();
	    

	}

}
