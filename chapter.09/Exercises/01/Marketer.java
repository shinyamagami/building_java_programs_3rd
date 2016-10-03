public class Marketer extends Employee{
    public double getSalary(){
        return super.getSalary() + 10000;
    }
    public String advertise(){
        System.out.println("Act onw, while supplies last!");
    }
}
