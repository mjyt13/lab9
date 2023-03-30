import java.util.Scanner;
import static java.lang.System.*;
import java.util.regex.*;
public class zdanie_9_11 {
    static Scanner ff = new Scanner(System.in);
    public static void main(String[] args) {
        out.println("Введите количество строк в массиве");
        int N = ff.nextInt();
        String[] A = new String[N];
        out.println("Вводите строки");
        A[0]=ff.nextLine();
        StringBuffer[] B = new StringBuffer[N];
        vvod(A);
        Pattern x = Pattern.compile("[a-z&&[^adt]].+e");
        Pattern y = Pattern.compile("(\\+*)\\w{1,6}");
        Pattern z = Pattern.compile("(;|:)+(a|A)*");
        Matcher a,b,c;
        out.println("Сейчас будут показываться отформатированные элементы массива, если это было возможно");
        for(int i=0;i<A.length;i++){
            out.println((i+1)+" строка");
            B[i]=new StringBuffer(A[i]);
            a=x.matcher(A[i]);
            b=y.matcher(A[i]);
            c=z.matcher(A[i]);
            if(a.find()){
                out.println(a.replaceAll("C-Moon"));
            }else{
                out.println("Для "+(i+1)+" строки не было возможно изменение, связанное с первым шаблоном");
            }
            if(b.find()){
                b.appendReplacement(B[i],"Checked");
                out.println(B[i].toString());
            }else{
                out.println("Эта строка не содержала второго шаблона, поэтому изменения нет");
            }
            if(c.find()){
                out.println(c.replaceFirst("Passed"));
            }else{
                out.println("Здесь не было третьего шаблона");
            }
        }
    }
    public static void vvod(String R[]){
        for(int i=0;i<R.length;i++){
            R[i]=ff.nextLine();
        }
    }
}
