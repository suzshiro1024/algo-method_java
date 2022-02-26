import java.util.*;
import java.util.regex.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    Pattern p = Pattern.compile(".*(dog|cat).*");

    Matcher m = p.matcher(sc.nextLine());

    if(m.matches()){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}