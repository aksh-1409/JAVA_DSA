class Day_18_RainwaterProblem{

    public static void main(String[] args){
        int heights[] = {2, 0, 5, 7, 1, 4, 5};

        findWaterTrapped(heights);
    }


    static void findWaterTrapped(int []  heights){
        int left = 0;
        int right = heights.length-1;

        int Lmax = 0;
        int Rmax = 0;
        int waterTrapped = 0;
        while(left<right){
            Lmax = Integer.max(Lmax, heights[left]);
            Rmax = Integer.max(Rmax, heights[right]);

            if(Lmax < Rmax){
                waterTrapped += Lmax - heights[left];
                left ++;
            }
            else{
                waterTrapped += Rmax - heights[right];
                right --;
            }
        }

        System.out.println("Water Trapped : " + waterTrapped);
    }
}