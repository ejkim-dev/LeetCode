class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numMap = mutableMapOf<Int, Int>()
        for (i in nums.indices){
            val firstValue = target - nums[i]
            if (numMap.containsKey(firstValue)) {
                return intArrayOf(numMap.getValue(firstValue), i)
            }
            numMap[nums[i]] = i
        }
        return intArrayOf(0,0)
    }
}