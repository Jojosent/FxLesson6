import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class problem2 {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();
        Customer customer= new Customer("Dias" ,"Orisbek","Bolat",2004,"87771233456","Desing",3,"3e");
        Customer customer1 = new Customer("Alnur" ,"Rysbek","Bolat",2005,"87452342344","Java",3,"3e");
        Customer customer2 = new Customer("Ers" ,"Abdubalov","Bolat",2006,"97842342343","Back End",3,"3e");
        Customer customer3 = new Customer("Roma" ,"Koshekbay","Bolat",2007,"87234235343","Desing",3,"3e");


        customerList.add(customer);
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);

        for (Customer f : customerList) {
//            System.out.println(f.getFaculty()+" "+f.getGroup());

        }
        Collections.sort(customerList, new sortNameCustomer());
        System.out.println(customerList);

    }
}

class Customer{
    String name;
    String surname;
    String patro;
    int birth;
    String phone;
    String faculty;
    int course;
    String group;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getPatro() {
        return patro;
    }
    public void setPatro(String patro) {
        this.patro = patro;
    }
    public int getBirth() {
        return birth;
    }
    public void setBirth(int birth) {
        this.birth = birth;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }


    public Customer(String name,String surname,
                   String patro,int birth,
                   String phone,String faculty,
                   int course,String group) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }
    @Override
    public String toString() {
        return "Customer(" +
                "name:" + name +
                ", age:" + surname +
                ", link:" + birth +
                ", rating:" + phone +
                ", age:" + faculty +
                ", link:" + course +
                ", rating:" + group +
                ")"+"\n";

    }
}

class sortNameCustomer implements Comparator<Customer> {
    @Override
    public int compare(Customer s1, Customer s2){
        return s1.getName().compareTo(s2.getName());
    }
}

