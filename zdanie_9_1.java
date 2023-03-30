import static java.lang.System.*;
import java.util.Scanner;
public class zdanie_9_1 {
    static Scanner R1 = new Scanner(System.in);
    public static void main(String[] args) {
        int N = R1.nextInt();
        int M = R1.nextInt();
        char A[][] = new char[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                A[i][j]=vvodim();
            }
        }
        int g = 0, f = 0;
        for(int j=0;j<M;j++){
            for(int i=0;i<N-2;i++){
                if(A[i][j]=='y' & A[i+1][j]=='e' & A[i+2][j]=='s'){
                    f++;
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0; j<M-2;j++){
                if(A[i][j]=='y' & A[i][j+1]=='e' & A[i][j+2]=='s'){
                    g++;
                }
            }
        }
        out.println("Слово yes встречается "+g+" раз по строкам и "+f+" раз по столбцам");
    }
    public static char vvodim(){
        char t = ' ';
        String R = R1.next();
        if(R.length()==1){
            t = R.charAt(0);
        }else{
            int h=1;
            while(h>0){
                h=0;
                out.println("в этом массиве каждый элемент представляет собой один символ");
                out.println("попробуйте ещё раз");
                R=R1.next();
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
