
public class Main {
    public static void main(String[] args) {

        int[] array=new int[100];
        int target=42;

        for(int i=0;i<array.length;i++){
            array[i]=i;
        }
        int index=binarySearch(array,target);
        if(index==-1){
            System.out.println(target+" not found");
        }
        else{
            System.out.println(target+" found at index: "+index);
        }

    }
    
    private static int binarySearch(int[] array, int target) {
        int start=0;
        int high=array.length-1;
        while(start<=high){
            int middle=(start+high)/2;
            int value=array[middle];

            System.out.println("middle: "+value);
            if(value<target){
                start=middle+1;
            }else if(value>target){
                high=middle-1;
            }
            else{
                return middle;
            }


        }
       return -1;
    }
}