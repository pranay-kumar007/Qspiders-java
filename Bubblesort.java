class Bubblesort{
    public static void main(String [] args){
        int[] arr = {10,3,83,36,16,38,90};
        for (int i=0;i<arr.length;i++) {
            for(int j = 0; j<arr.length-i-1;j++)
            {
                if(arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
}