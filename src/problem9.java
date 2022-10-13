import java.util.ArrayList;
import java.util.Comparator;

public class problem9 {
    public static void main(String[] args) {
        ArrayList<Product> ProductList = new ArrayList<>();
        Product Product= new Product("Dias" ,"Orisbek","Bolat",2004,"87771233456","Desing",3,"3e");
        Product Product1 = new Product("Alnur" ,"Rysbek","Bolat",2005,"87452342344","Java",3,"3e");
        Product Product2 = new Product("Ers" ,"Abdubalov","Bolat",2006,"97842342343","Back End",3,"3e");
        Product Product3 = new Product("Roma" ,"Koshekbay","Bolat",2007,"87234235343","Desing",3,"3e");


        ProductList.add(Product);
        ProductList.add(Product1);
        ProductList.add(Product2);
        ProductList.add(Product3);

        for (Product f : ProductList) {
            if (f.getBirth()<=2005){
                System.out.println(f);
            }
            if (f.getBirth()>2005){
                break;
            }
        }
//        Collections.sort(ProductList, new sortNameProduct());
//        System.out.println(ProductList);

    }
}

class Product{
    String name;
    String surname;
    String patro;
    int birth;
    String Product;
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
    public String getProduct() {
        return Product;
    }
    public void setProduct(String Product) {
        this.Product = Product;
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


    public Product(String name,String surname,
                   String patro,int birth,
                   String Product,String faculty,
                   int course,String group) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.Product = Product;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }
    @Override
    public String toString() {
        return "Product(" +
                "name:" + name +
                ", age:" + surname +
                ", link:" + birth +
                ", rating:" + Product +
                ", age:" + faculty +
                ", link:" + course +
                ", rating:" + group +
                ")";

    }
}

class sortNameProduct implements Comparator<Product> {
    @Override
    public int compare(Product s1, Product s2){
        return s1.getName().compareTo(s2.getName());
    }
}

