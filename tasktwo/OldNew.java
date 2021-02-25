package tasktwo;

public class OldNew {
    public static void main(String[] args) {
        int num =32;
        if(num%2 !=0){
            System.out.println("New");
        }
        else
        {
            if(num >=2 &&num<=5 ){
                System.out.println("OLD");
            }
            if( num >=6 &&num<=30 ){
                System.out.println("NEW");
            }
            if( num >=30 ){
                System.out.println("OLD");
            }
        }
    }
}
