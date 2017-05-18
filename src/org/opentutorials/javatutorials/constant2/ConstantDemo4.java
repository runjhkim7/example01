package org.opentutorials.javatutorials.constant2;

enum Fruit4{
    APPLE, PEACH, BANANA;
    Fruit4(){
        System.out.println("Call Constructor "+this);
    }
}
 
enum Company4{
    GOOGLE, APPLE, ORACLE;
}


public class ConstantDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      /*
        if(Fruit.APPLE == Company.APPLE){
            System.out.println("과일 애플과 회사 애플이 같다.");
        }
        */
        Fruit4 type = Fruit4.APPLE;
        
        switch(type){
            case APPLE:
                System.out.println(57+" kcal");
                break;
            case PEACH:
                System.out.println(34+" kcal");
                break;
            case BANANA:
                System.out.println(93+" kcal");
                break;
        }

	}

}
