public class Demo007 {
    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    for(int i = 0;i < nums.length-1;i++)
    {
        for(int j = i+1;j<nums.length;j++)
        {
            if(nums[i]>nums[j])
            {
                int tmp1 = nums[i];
                int tmp2 = nums[j];
                nums[i] = tmp2;
                nums[j] = tmp1;
            }
        }
    }
    for(int i = 0;i < nums.length-2;i++)
    {if(nums[i]>0)break;
     if(i>0&&nums[i]==nums[i-1])continue;///////注意这点，在for循环的时候，i指针有循环控制，自己不要动；
     int j = i+1;
     int k = nums.length-1;
     while(j<k)
     {
         int jg = nums[i]+nums[j]+nums[k];
         if(jg==0)//当=0时。肯定时左右都要移动，不可能存在，左边移动，右边不移动的情况，否则不可能成立，因为一个数不变，一个数变化了，另一个数不变的话，不可能相加为0
         {
             ans.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[k])));
             while (j<k&&nums[j]==nums[++j]);//++i 表示每次向右移动一位，而且当while循环退出时，当前的i就为我们需要的i；
             while (j<k&&nums[k]==nums[--k]);

         }
         else if(jg<0)
         {
             while (j<k&&nums[j]==nums[++j]);
         }
         else if(jg>0)
         {
             while (j<k&&nums[k]==nums[--k]);
         }






     }
    }
    return ans;
    }
}