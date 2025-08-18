package SeleniumPractice.Day7;

public class EncapEmpData {

    private int empid;
    private String empname;
    private double empsalary;

    public void setEmpid(int empid){
        this.empid=empid;
    }

    public void setEmpname(String empname){
        this.empname=empname;
    }

    public void setEmpsalary(double empsalary){
        this.empsalary=empsalary;
    }

    public int getEmpid(){
        return empid;
    }

    public String getEmpname(){
        return empname;
    }

    public double getEmpsalary(){
        return empsalary;
    }
}
