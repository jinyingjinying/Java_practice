public class Demo01_Method {

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };
        int max = getMax(array);
        System.out.println(max);
    }

    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
