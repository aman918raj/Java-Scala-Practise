public class JavaRemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,2,6,7,7,9};
        JavaRemoveDuplicates jr = new JavaRemoveDuplicates();
        int[] sortedArr = jr.sort(arr);
        int[] noDupArr = jr.removeDup(sortedArr);
        for(int i: noDupArr)
            System.out.println(i);

    }

    public int[] sort(int[] arr){
        int n = arr.length;
        for (int i =0; i < n; i++){
            for (int j = 1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public int[] removeDup(int[] arr){
        int[] result = new int[arr.length];
        int prev= arr[0];
        result[0]=prev;
        for(int i=1; i< arr.length; i++){
            int curr = arr[i];
            if(prev != curr){
                result[i] = curr;
            }
            prev = curr;
        }
        return result;
    }
}
