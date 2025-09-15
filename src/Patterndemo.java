import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterndemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Pattern pattern = Pattern.compile("pandey@gmail.com" , Pattern.CASE_INSENSITIVE);
//        Matcher match = pattern.matcher("regex pandey@gmail.com");
//        boolean result = match.find();
//        if(result){
//            System.out.println("Matched");
//        }
//        else{
//            System.out.println("not Matched");
//        }
//        System.out.println("enter your mail id");
//        String text = sc.next();
//        String regex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher =pattern.matcher(text);
//        if (matcher.find()){
//            System.out.println("matched"+ matcher.group());
//        }
//        else{hjhkh
//            System.out.println("not matched" );
//        }

//        System.out.println("enter your mail Password");
//        String text = sc.next();
//        String regex = "\\b[A-Za-z0-9._%+-]{0,8}\\b";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher =pattern.matcher(text);
//        if (matcher.matches()){
//            System.out.println("matched"+ matcher.group());
//        }
//        else{
//            System.out.println("not matched" );
//        }
        System.out.println("enter your string with your special sysmbol");
        String string = sc.nextLine();
        String result = removespecialchar(string);

        System.out.println("original  " + string);
        System.out.println("after removing special characters \n" + result);
    }
    public static String removespecialchar(String str){
        String regex = "[^a-zA-Z0-9\\s]";
        return str.replaceAll(regex ,"");

    }

}
