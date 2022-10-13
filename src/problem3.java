import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class problem3 {
    public static void main(String[] args) {
        ArrayList<Patient> PatientList = new ArrayList<>();
        Patient Patient= new Patient("Dias" ,"Orisbek","Bolat",2004,"87771233456","Desing",3,"3e");
        Patient Patient1 = new Patient("Alnur" ,"Rysbek","Bolat",2005,"87452342344","Java",3,"3e");
        Patient Patient2 = new Patient("Ers" ,"Abdubalov","Bolat",2006,"97842342343","Back End",3,"3e");
        Patient Patient3 = new Patient("Roma" ,"Koshekbay","Bolat",2007,"87234235343","Desing",3,"3e");


        PatientList.add(Patient);
        PatientList.add(Patient1);
        PatientList.add(Patient2);
        PatientList.add(Patient3);

        for (Patient f : PatientList) {
//            System.out.println(f.getFaculty()+" "+f.getGroup());
            System.out.println(f.getFaculty());
        }
//        Collections.sort(PatientList, new sortNamePatient());
//        System.out.println(PatientList);

    }
}

class Patient{
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


    public Patient(String name,String surname,
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
        return "Patient(" +
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

class sortNamePatient implements Comparator<Patient> {
    @Override
    public int compare(Patient s1, Patient s2){
        return s1.getName().compareTo(s2.getName());
    }
}

