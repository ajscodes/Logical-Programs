public class OcaCertiQue {
    public static long main(String[]args){
        System.out.println("Hello");
        return 10L;
    }
}

//give an error at runtime : public static void main is correct
//corrected:
// public class OcaCertiQue {
//     public static void main(String[] args) {
//         System.out.println("Hello");
//         System.out.println("Return value: " + getLongValue());
//     }

//     public static long getLongValue() {
//         return 10L;
//     }
// }