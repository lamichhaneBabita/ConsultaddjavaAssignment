package Task06;

public class Programming {

    private String[] programs = new String[]{};

    public Programming() {
        System.out.println("I love programming Languages");
    }

    public Programming(String[] args) {
        System.out.print("I love :");
        for (String s : args) {
            System.out.print( s + " ");
        }

    }

    public static void main(String[] args) {
        Programming programming = new Programming();
        System.out.println();
        Programming programming1 = new Programming(new String[]{"Java", "C#", "Python", "Ruby"});

    }
}
