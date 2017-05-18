package org.opentutorials.javatutorials.constant2;

enum Fruit6{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;
    Fruit6(String color){
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
}

enum Company6{
    GOOGLE, APPLE, ORACLE;
}

public class ConstantDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        for(Fruit6 f : Fruit6.values()){
            System.out.println(f+", "+f.getColor());
        }
	}

}
