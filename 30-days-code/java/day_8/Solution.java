import java.util.*;
import java.io.*;

class Solution  {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> numbers = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            numbers.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(numbers.get(s)!= null){
                System.out.println(s + "="+numbers.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}