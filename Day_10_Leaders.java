class Day_10_Leaders{

    public static void main(String[] args){
        int[] arr = {100, 90, 100, 70, 85, 60, 50, 40, 30, 20};

        findLeaders(arr);
    }


    static void findLeaders(int [] arr){
        int n = arr.length;
        int[] array = new int[n];
        int count =0;
        for(int i=n-1;i>=0;i--){
            if(i==n-1)
            array[count++]=arr[i];
            else if(arr[i]>=arr[i+1] && arr[i]>=array[count-1]){
                array[count++]=arr[i];
            }
         }
         for(int i=0,j=count-1;i<=j;i++,j--){
            int temp =array[i];
            array[i]=array[j];
            array[j]=temp;
        }

        for(int i=0;i<count;i++){
            System.out.println(array[i]);
        }
    }
}