public class Main1{
    static void ageCheck(int age){
        if(age<18){
            System.out.println("Access not granted-you are not old enough");

        }
        else{
            System.out.println("Access granted-you are old enough");
        }
    }
    public static void main(String[]args){
        ageCheck(20);
        ageCheck(15);
    }
}