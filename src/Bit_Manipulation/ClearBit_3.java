package Bit_Manipulation;

public class ClearBit_3 {
    static void main() {
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        int get = ~bitMask & n;
        System.out.println(get);
        if(((~bitMask) & n) == 0){
            System.out.println("bit was zero == 0");
        }
        else{
            System.out.println("bit was zero == 1"  );
        }
    }
}
