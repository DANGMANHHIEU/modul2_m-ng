public class ex5 {
    public static int checkMin(int[] arr){
        int index = 0;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<arr[index]){
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int index = checkMin(arr);
        System.out.println("phần tử bé nhất: " + arr[index]);
    }
}
