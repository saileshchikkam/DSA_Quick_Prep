package Strings;

public class String_Builder {
    static void main() {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //charAt
        System.out.println(sb.charAt(0));

        //setCharAt()
        sb.setCharAt(0,'P');
        System.out.println(sb);

        // insert()
        sb.insert(2,'n');
        System.out.println(sb);

        // delete the extra 'n'
        sb.delete(2,4); // 2 n's are removed
        System.out.println(sb);

        //append
        sb.append('e');
        System.out.println(sb);
    }
}
