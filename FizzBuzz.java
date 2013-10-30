public class FizzBuzz {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
//<<<<<<< HEAD
            if( i % 3 == 0)
                System.out.println(i + ": " + "Fizz");
//=======
            if( i % 5 == 0)
                System.out.println("Buzz");
//>>>>>>> d713820170197c54eef9e8816ea56efcc1641b23
        }
    }
}