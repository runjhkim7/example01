package org.opentutorials.javatutorials.generic;

//class StudentInfo{
//    public int grade;
//    StudentInfo(int grade){ this.grade = grade; }
//}
//class StudentPerson{
//    public StudentInfo info;
//    StudentPerson(StudentInfo info){ this.info = info; }
//}
//class EmployeeInfo{
//    public int rank;
//    EmployeeInfo(int rank){ this.rank = rank; }
//}
//class EmployeePerson{
//    public EmployeeInfo info;
//    EmployeePerson(EmployeeInfo info){ this.info = info; }
//}
//
//public class GenericDemo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		StudentInfo si = new StudentInfo(2);
//		StudentPerson sp = new StudentPerson(si);
//		System.out.println(sp.info.grade); // 2
//		EmployeeInfo ei = new EmployeeInfo(1);
//		EmployeePerson ep = new EmployeePerson(ei);
//		System.out.println(ep.info.rank); // 1
//
//	}

class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person<T, S>{
    public T info;
    public S id;
    Person(T info, S id){ 
        this.info = info; 
        this.id = id;
    }
    public <U> void printInfo(U info){
        System.out.println(info);
    }    
}

public class GenericDemo {
    public static void main(String[] args) {
//        Person<EmployeeInfo, int> p1 = new Person<EmployeeInfo, int>(new EmployeeInfo(1), 1);
        EmployeeInfo e = new EmployeeInfo(1);
        Integer i = new Integer(10);
        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
//        System.out.println(p1.id.intValue());
        p1.<EmployeeInfo>printInfo(e);
        p1.printInfo(e);
   	
    }

}
