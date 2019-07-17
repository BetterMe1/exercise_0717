package exercise.exercise_0717;

/*
删除公共字符
 */
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        for(int i=0; i<str2.length(); i++){
            String s = String.valueOf(str2.charAt(i));
            int j = str1.indexOf(s);
            while(j!=-1){
                str1 =str1.substring(0,j)+str1.substring(j+1);
                j = str1.indexOf(s);
            }
        }
        System.out.println(str1);
    }
}*/

/*
句子逆序
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = in.nextLine().split(" ");
        for(int i=strs.length-1; i>=0; i--){
            System.out.print(strs[i]);
            if(i>0){
                System.out.print(" ");
            }else{
                System.out.println();
            }
        }
    }
}