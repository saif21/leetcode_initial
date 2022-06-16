package LeetcodeEasy;

import java.util.ArrayList;
import java.util.List;

public class Easy1773 {
    public static void main(String[] args) {
        List<List<String>> items= new ArrayList<>();
        items.add(new ArrayList<>());
        items.add(new ArrayList<>());
        items.add(new ArrayList<>());
        String [][]arr={{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                items.get(i).add(arr[i][j]);
            }
        }
        String ruleKey="type";
        String ruleValue="phone";
        System.out.println(countMatches(items,ruleKey,ruleValue));
        System.out.println(anotherSolution(items,ruleKey,ruleValue));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        if (ruleKey == "type") {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(0) == ruleValue) {
                    count++;
                }
            }
        } else if (ruleKey == "color") {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(1) == ruleValue) {
                    count++;
                }
            }
        } else {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(2) == ruleValue) {
                    count++;
                }
            }
        }
        return count;
    }
    static int anotherSolution(List<List<String>> items, String ruleKey, String ruleValue){
        int count = 0;
        //loop through the items.
        for(List<String> list:items){
            if(ruleKey.equals("type") && ruleValue.equals(list.get(0))) count++;
            else if(ruleKey.equals("color") && ruleValue.equals(list.get(1))) count++;
            else if(ruleKey.equals("name") && ruleValue.equals(list.get(2))) count++;
        }
        return count;
    }
}
