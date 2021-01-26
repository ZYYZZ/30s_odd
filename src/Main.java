public class Main {

    public static void main(String[] args){
        int[] data = new int[12];
        int x = 29;
        for(int i = 0;i<12;i++){
            data[i] = x;
            x = x-2;
        }

        System.out.println("30以内从大到小的前12个奇数为：");
        for(int i = 0;i<12;i++){
            System.out.println(data[i]);
        }
    }
}
