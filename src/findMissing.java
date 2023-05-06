
import java.util.*;

public class findMissing {

    public List<Integer> find(int [] nums){
        Set<Integer>set=new HashSet<>();
        List<Integer>li=new ArrayList<>();
        int largest=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
            set.add(nums[i]);
        }
        int checker=1;
        while(checker<largest){

            if(set.contains(checker)){
                checker++;
            }else{
                li.add(checker);
                checker++;
            }
        }
        List<Integer>lis=new ArrayList<>();

        return li;



    }

}
