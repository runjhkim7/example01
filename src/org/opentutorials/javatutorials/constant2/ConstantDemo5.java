package org.opentutorials.javatutorials.constant2;

enum Fruit5{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    public String color;
    Fruit5(String color){
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
    String getColor(){
        return this.color;
    }

}
 
enum Company5{
    GOOGLE, APPLE, ORACLE;
}

public class ConstantDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       /*
        if(Fruit.APPLE == Company.APPLE){
            System.out.println("과일 애플과 회사 애플이 같다.");
        }
        */
        Fruit5 type = Fruit5.APPLE;
        switch(type){
//            case APPLE:
//                System.out.println(57+" kcal, "+Fruit5.APPLE.color);
//                break;
//            case PEACH:
//                System.out.println(34+" kcal"+Fruit5.PEACH.color);
//                break;
//            case BANANA:
//                System.out.println(93+" kcal"+Fruit5.BANANA.color);
//                break;
        case APPLE:
            System.out.println(57+" kcal, "+Fruit5.APPLE.getColor());
            break;
        case PEACH:
            System.out.println(34+" kcal"+Fruit5.PEACH.getColor());
            break;
        case BANANA:
            System.out.println(93+" kcal"+Fruit5.BANANA.getColor());
            break;

        }

	}

}
