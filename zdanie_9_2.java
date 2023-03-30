import static java.lang.System.out;
import java.util.Scanner;
import static java.lang.Math.*;
public class zdanie_9_2 {
    static Scanner C2 = new Scanner(System.in);
    public static void main(String[] args) {
        out.println("Введите количество цифр числа в пятеричной системе счисления");
        int N = C2.nextInt();
        out.println("Вводите цифры числа с самого большого разряда");
        char A[] = new char[N];
        int S=0, h=0;
        for(int i=0; i<N;i++){
            if(i==0){
                A[i]=vvodim();
                if(A[i]=='0'){
                    while(A[i]=='0'){
                        out.println("число не может начинаться с нуля");
                        out.println("введите первую цифру ещё раз");
                        A[i]=vvodim();
                    }
                }
            }else{
                A[i]=vvodim();
            }
        }
        for(int j=0;j<N;j++) {
            if (A[j] != '0' & A[j] != '1' & A[j] != '2' & A[j] != '3' & A[j] != '4') {
                h = 1;
            }
        }
        while(h>0){
            out.println("вы неправильно ввели число в пятеричной системе счисления");
            out.println("попробуйте ещё раз");
            out.println("Введите число в пятеричной системе счисления");
            h=0;
            for(int i=0; i<N;i++){
                    if(i==0){
                        A[i]=vvodim();
                        if(A[i]=='0'){
                            while(A[i]=='0'){
                                out.println("число не может начинаться с нуля");
                                out.println("введите первую цифру ещё раз");
                                A[i]=vvodim();
                            }
                        }
                    }else{
                        A[i]=vvodim();
                    }
                }
            for(int j=0;j<N;j++) {
                if (A[j] != '0' & A[j] != '1' & A[j] != '2' & A[j] != '3' & A[j] != '4') {
                    h = 1;
                }
            }
        }
        for(int k=N-1;k>=0;k--) {
            int B[]= new int[N];
            B[k]=(int)(A[k])-48;
            S=S+(int)(B[k]*pow(5,N-k-1));
        }
        int k = S;
        h=0;
        while(k>0){
            k=k/10;
            h++;
        }
        String C[] = new String[h];
        char D[] = new char[h];
        for(int i=h-1;i>=0;i--){
            C[i]=Integer.toString(S%10);
            S=S/10;
            D[i]=C[i].charAt(0);
        }
        out.print("Число в десятичной системе счисления равно ");
        for(int i=0;i<h;i++){
            out.print(C[i]);
        }
    }
    public static char vvodim(){
        char t = ' ';
        String R = C2.next();
        if(R.length()==1){
            t = R.charAt(0);
        }else{
            int h=1;
            while(h>0){
                h=0;
                out.println("в этом массиве каждый элемент представляет собой один символ");
                out.println("попробуйте ещё раз");
                R=C2.next();
                if(R.length()!=1){
                    h=1;
                }else{
                    t=R.charAt(0);
                }
            }
        }
        return t;
    }
}
