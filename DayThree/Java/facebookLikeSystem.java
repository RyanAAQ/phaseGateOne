import java.util.Scanner;

public class facebookLikeSystem{

    public static String likes(String [] names){
    
    for(String name : names){
        if(names.length < 1){
            return ("no one likes this");
        }
        else if(names.length == 1){
            return (name + " likes this");
        }
        else if(names.length == 2){
            return (names[0] + " and " + names[1] + " like this");
        }
        else if(names.length == 3){
            return (names[0] + ", " + names[1] + " and " + names[2] + " like this");
        }
        else if(names.length == 4){
            int remaining = names.length - 2;
            return (names[0] + ", " + names[1] + " and " + remaining + " others like this");
        }
        }
        return "no one likes this";
    }
}
