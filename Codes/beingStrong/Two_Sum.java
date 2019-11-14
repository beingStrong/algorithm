import java.util.Scanner;

public class Main13 {
    //基础练习 十六进制数转化为十进制数
    public long mi(int ci,int num){
        if(ci==0){
            return 1l;
        }
        return num*mi(ci-1,num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.next();
        char[]arr=input.toCharArray();
        long res=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>='A'){
                res+=(arr[i]-'A'+10)*new Main13().mi(arr.length-1-i,16);
            }else{
                res+=(arr[i]-'0')*new Main13().mi(arr.length-1-i,16);
            }
        }
        System.out.println(res);
    }
}
