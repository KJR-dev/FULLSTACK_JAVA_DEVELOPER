import Circle.Circle;
import ComplexNumber.*;
import Course.Course;
import Cuboid.*;
import Distance.Distance;
import Employee.*;
import Question.Question;
import Time.*;
public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        ComplexNumber obj1=new ComplexNumber();
        obj1.setComplexNumber(10,20);
        obj1.showComplexNumber();

        Time obj2=new Time();
        obj2.setTime(3,45,55);
        obj2.showTime();

        Cuboid obj3=new Cuboid();
        obj3.setLength(10);
        obj3.setBreadth(20);
        obj3.setHeight(5);
        obj3.showVolume();
        obj3.showSurface();

        Employee obj4=new Employee();
        obj4.setName("Jitu");
        obj4.setEmpId(101);
        obj4.setSalary(5000);
        System.out.println(obj4.getName());
        System.out.println(obj4.getEmpId());
        System.out.println(obj4.getSalary());

        Contact.Contact obj5=new Contact.Contact();
        obj5.setId(101);
        obj5.setFirstName("Jitendra");
        obj5.setLastName("Sahoo");
        obj5.setEmail("abc@gmail.com");
        obj5.setMob(987657657);
        System.out.println(obj5.getId());
        System.out.println(obj5.getFirstName());
        System.out.println(obj5.getLastName());
        System.out.println(obj5.getMob());
        System.out.println(obj5.getEmail());

        Question obj6=new Question();
        obj6.setProperty(1,"what is java?","java1","java2","java3","java4",'a');
        obj6.showProperty();

        Course obj7=new Course();
        obj7.setCourseId(101);
        obj7.setCourseName("java");
        obj7.setDuration(6);
        obj7.setFee(6000);
        System.out.println("Course id= "+obj7.getCourseId());
        System.out.println("Course id= "+obj7.getCourseName());
        System.out.println("Course id= "+obj7.getDuration());
        System.out.println("Course id= "+obj7.getFee());

        Distance obj8=new Distance();
        obj8.setDistance(10,500,180);
        obj8.showDistance();
        Distance d1=new Distance();
        Distance d2=new Distance();
        Distance d3;
        d1.setDistance(3,500,180);
        d2.setDistance(4,500,180);
        d3=d1.addDistance(d2);
        d3.showDistance();

        Circle obj9=new Circle();
        obj9.setRadious(4.5f);
        System.out.println(obj9.getArea(4.5f));
        System.out.println(obj9.getCircumference(4.5f));
    }

}

