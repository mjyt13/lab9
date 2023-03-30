import java.lang.StringBuffer;
import java.lang.String;
import java.util.Scanner;
public class zdanie_9_7 {
    static Scanner d4 = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите строку, по возможности содержащую точки");
        String pon = d4.nextLine();
        StringBuffer po = new StringBuffer(pon);
        int T=0, P=0;
        for(int i=0;i<po.length();i++){
            if(po.charAt(i)=='.'){
                while(po.charAt(i)=='.' & i!=(po.length()-1)){
                    i++;
                }
                T++;
            }
        }
        int[] A = new int[T];
        T=0;
        int N=0, M=0;
        for(int i=0;i<po.length();i++){
            if(po.charAt(i)=='.'){
                A[T]=i;
                N=i;
                if(po.charAt(po.length()-1)!='.'){
                    while(po.charAt(i)=='.' & po.charAt(i+1)=='.'){
                        i++;
                    }
                    M=i;
                }else{
                    while(po.charAt(i)=='.' & (i!=po.length()-1)){
                        i++;
                    }
                    M=i-1;
                }
                T++;
            }
        }
        for(int i=A.length-1;i>=0;i--){
        }
        N=0;
        M=0;
        int i=0;
        for(int j=A.length-1;j>=0;j--){
            i=A[j];
            if(po.charAt(i)=='.'){
                N=A[j];
                while(po.charAt(i)=='.' & i!=po.length()-1){
                    i++;
                }
                if(i==po.length()-1 & po.charAt(i)=='.'){
                    M=i+1;
                }else{
                    M=i;
                }
                if((M-N)%2==0){
                    po.replace(N,M,"!");
                }else{
                    po.replace(N,M,"?");
                }
            }
        }
        System.out.println(po);
    }
}
