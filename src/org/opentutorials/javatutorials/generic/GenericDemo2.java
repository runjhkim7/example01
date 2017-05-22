package org.opentutorials.javatutorials.generic;

interface Info2{
    int getLevel();
}

class EmployeeInfo2 implements Info2{
    public int rank;
    EmployeeInfo2(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}
class Person2<T extends Info2>{
    public T info;
    Person2(T info2){ this.info = info2; }
}

public class GenericDemo2 {
	
	public static void main(String[] args) {
		Person2 p1 = new Person2(new EmployeeInfo2(1));
//		Person2<String> p2 = new Person2<String>("부장");
	}

}
