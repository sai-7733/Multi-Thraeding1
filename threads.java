import java.util.*;
class A{
        static java.util.Scanner sc=new java.util.Scanner(System.in);
        int m1(float a){
            return sc.nextInt();
        }
        String m2(long a){
            return sc.next();
        }
    }
public class B extends A implements Runnable{
    public void run(){
        System.out.println("hai");
    }
    public static void main(String args[]){
        B t1=new B();
        Thread t2=new Thread(t1);
        t2.start();
        System.out.println(t1.m1(sc.nextFloat()));
        System.out.println(t1.m2(sc.nextLong()));
    }
}