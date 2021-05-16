public class Solution {
	public int[] twoSum(int[] numbers, int target) {
    
    //The best way is to use the HashMap, for the hashmap, the key is the another number we would like to search for
    //The value of each key is the current index we now have. As a result, in this case, each time we find a new index
    //As we check whether it is now in the Hashmap as the key, we can directly find the value, which is the previous 
    //index we have got while iterating through this array!!!
    
    //Also remember that if you can not find the key in the hashmap, it means the value of this key is null!!!
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] result = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			if (map.get(numbers[i]) != null) {
				result[0] = map.get(numbers[i]);
				result[1] = i;
				break;
			} else {
				map.put(target - numbers[i], i);
			}
		}
		return result;
	}
}
