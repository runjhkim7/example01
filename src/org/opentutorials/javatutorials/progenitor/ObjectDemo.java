package org.opentutorials.javatutorials.progenitor;

class Student{
    String name;
    Student(String name){
        this.name = name;
    }
    public boolean equals(Object obj) {
        Student _obj = (Student)obj;
        return this.name == _obj.name;
    }
}

public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s1 = new Student("egoing");
        Student s2 = new Student("egoing");
        System.out.println(s1.toString() == s2.toString());
        System.out.println(s1.equals(s2));

	}

}
