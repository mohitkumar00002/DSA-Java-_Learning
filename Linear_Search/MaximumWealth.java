public class MaximumWealth {
    public static void main(String[] args) {
        int[][] arr = {{1,2,5},
                       {4,6,1,2},
                       {6,1,2},
                       {2,3,4,1}};
        int result = MaximumWealth(arr);
        System.out.println("Maximum wealth : " + result);
    }
    static int MaximumWealth(int[][] arr){
        int max_wealth = Integer.MIN_VALUE;
        int person_index = 0;
        for(int person=0; person<arr.length; person++){
            int sum = 0;
            for(int account=0; account<arr[person].length; account++){
                sum += arr[person][account];
                if(sum > max_wealth){
                    max_wealth = sum;
                    person_index = person+1;
                }
                
            }
        }
        System.out.println("Person "+ person_index + " has the Maximum Wealth.");
        return max_wealth;
    }
}