public class TypePromotioninExpressions {
    public static void main (String args[]) {
        byte b = 5;
        // byte a = b * 2; 
        /* b * 2 is an expression. so java type promoted it to int. so lossy conversion will occur. also, assigning directly to byte causes a compile-time error.*/
        byte a = (byte) (b * 2);
        System.out.println(a);

    }
}