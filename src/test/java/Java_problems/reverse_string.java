package Java_problems;

public class reverse_string {
    public static void main(String[] args){
        String org_str = "Ashok";
        //reversestring(org_str);
        reverseusingbuilder(org_str);

    }
    public static void reversestring(String s)
    {
        char[] ch = s.toCharArray();
        int len = ch.length;
        System.out.println(len);

        for(int i =len-1;i>=0;i--){
            System.out.print(s.charAt(i));

        }
    }
    public static void reverseusingbuilder(String s){
        StringBuilder sb = new StringBuilder(s);
        String reversed_string=sb.reverse().toString();
        System.out.println(reversed_string);
    }
}
