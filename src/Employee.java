// placeholder for your Employee class
public class Employee
{
  String name;
  double wage;
  int hours;
  public Employee(String newname, double newwage, int newhours)
  {
    name=newname;
    hours=newhours;
    wage=newhours;
  }
  public String getName()
  {
    return name;
  }
  public double getWage()
  {
    return wage;
  }
  public int getHours()
  {
    return hours;
  }
  public double getWeeklySalary()
  {
    return wage*hours;
  }
  public double getAnnualSalary()
  {
    return 52*hours*wage;
  }
  public String toString()
  {
    return "name: "+name+" , hours: "+hours+" , wage: "+wage;
  }
  public void setName( String newname)
  {
    name=newname;
    
  }
  public void setWage(double newwage)
  {
    wage=newwage;
  }
  public void setHours(int newhours)
  {
    hours=newhours;
  }
  public void giveRaise()
  {
    wage+=1.0;
  }
}

