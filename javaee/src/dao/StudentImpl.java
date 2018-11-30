package dao;


public class StudentImpl {
    public static void main(String[] args) {
        Stuedent stu1 = new Stuedent();
        Stuedent stu2 = new Stuedent("123", 11);
        stu1.setName("111");
        stu1.setAge(11);
        System.out.println(stu1.getName()+":"+stu1.getAge());
        System.out.println(stu2.getName()+":"+stu2.getAge());
    }
}
