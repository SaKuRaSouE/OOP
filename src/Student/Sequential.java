package Student;
class Sequential {
    public static void main(String[] z) {
        int[] area = { 99, 45, 36, 21, 87, 65, 34, 1, 93, 77 };
        int code = 77;
        String result = "No";
        int i = 0;
        while (i < area.length) {
            if (area[i] == code) {
                result = "Yes";
                System.out.println(i);
                System.out.println(result);
                System.out.println(area[i]);
            }
            i++;
        }
    
    }
}
