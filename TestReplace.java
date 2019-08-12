public class TestReplace {
    public static void main(String[] args) {
        String name = "Jacek";
        String str = "X";
        str = str.replaceAll("X", "XXXXXXXXXX");
        str = str.replaceAll("X", "XXXXXXXXXX");
        str = str.replaceAll("X", "XXXXXXXXXX");
        str = str.replaceAll("X", name + "\n");
        System.out.println(str.toCharArray().length/5);
    }

}
