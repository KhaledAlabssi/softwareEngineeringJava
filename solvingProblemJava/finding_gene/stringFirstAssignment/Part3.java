import javax.naming.StringRefAddr;

public class Part3{

    public Boolean twoOccurrences(String stringa, String stringb) {

        

        String str = "Hello from the traing, and from the table";
        if (stringb.contains(stringa)){
            System.out.println("found one");
            int n = stringb.indexOf(stringa);
            String newStr = stringb.substring(n + stringa.length());
            System.out.println(newStr);
            if (newStr.contains(stringa)){
                System.out.println("found two");
                return true;
            }
        }
        System.out.println("out");



        return false;
    }

    public static void main(String[] args) {
        Part3 p = new Part3();
        Boolean result = p.twoOccurrences("from", "Hello from the traing, and from the table");
        System.out.println(result);
    }
}