package class7;

public class E6WhileLoop {

    public static void main(String[] args) {

        // print these numbers 2 4 6 8 10 12 14
        int num=2;
        while(num<=14){
            if(num%2==0) {
                System.out.println(num);
            }
            num++; // num=num+2;
        }
    }
}
