import java.util.Scanner;
class comparator_int {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); int b = sc.nextInt();
        if (a > b){System.out.println(a+">"+b);}
        else if (b > a){System.out.println(a+"<"+b);}
        else {System.out.println(a+"="+b);}
        System.out.println((a+b)+" "+(a-b)+" "+(a*b)+" "+(a/b));
    }
}