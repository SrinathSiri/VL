package SeleniumPractice.Day7;

public class EncapEmpDetails {
    public static void main(String[] args){
        EncapEmpData data = new EncapEmpData();
        data.setEmpid(111);
        data.setEmpname("Pavan");
        data.setEmpsalary(25345.75);

        System.out.println(data.getEmpid());
        System.out.println(data.getEmpname());
        System.out.println(data.getEmpsalary());

    }
}
