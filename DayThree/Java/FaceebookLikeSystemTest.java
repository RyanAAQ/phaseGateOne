import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FaceebookLikeSystemTest{

    @Test
    public void testForNoLikes(){
    String [] names = {};
    String actual = facebookLikeSystem.likes(names);
    String expected = ("no one likes this");
    assertEquals(actual, expected);
    
    }
    
    @Test
    public void testForOnlyOneLike(){
    String [] names = {"Peter"};
    String actual = facebookLikeSystem.likes(names);
    String expected = ("Peter likes this");
    assertEquals(actual, expected);
    
    }
    
    @Test
    public void testForOnlyTwoLikes(){
    String [] names = {"Jacob", "Alex"};
    String actual = facebookLikeSystem.likes(names);
    String expected = ("Jacob and Alex like this");
    assertEquals(actual, expected);
    
    }
    
    @Test
    public void testForOnlyThreeLikes(){
    String [] names = {"Max", "John", "Mark"};
    String actual = facebookLikeSystem.likes(names);
    String expected = ("Max, John and Mark like this");
    assertEquals(actual, expected);
    
    }
    
    @Test
    public void testForOnlyMoreThreeLikes(){
    String [] names = {"Alex", "Jacob", "Mark", "Max"};
    String actual = facebookLikeSystem.likes(names);
    String expected = ("Alex, Jacob and 2 others like this");
    assertEquals(actual, expected);
    
    }
}
