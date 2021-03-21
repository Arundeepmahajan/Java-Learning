public class JavaArrays {
    public static void main(String[] args) {
        String[] name = { "Arundeep", "Aaryan", "Khushi", "Harry" };
        System.out.println(name[1]);
        name[2] = "Yashasvini";
        System.out.println(name);
        System.out.println(name.length);
        int[][] numbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        int x = numbers[1][2];
        System.out.println(x);
    }

}
