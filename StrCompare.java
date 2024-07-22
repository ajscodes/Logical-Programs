public class StrCompare {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("Java");
        System.out.println(str1 == str2);
    // '==' compare two object references here str1 and str2 both are diffirent object.
    System.out.println(str1.equals(str2)); //check equality
    }
}
