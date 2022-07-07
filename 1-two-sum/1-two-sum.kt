class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = intArrayOf(0, 0)
        var i = 0
        for (num in nums){
            val secondValue = target - num
            if (nums.contains(secondValue)) {
                val secondIndex = findIndex(nums, secondValue, i)
                if (secondIndex != nums.size) {
                    result[0] = i
                    result[1] = secondIndex
                    break
                }
            }
            i++
        }
        return result
    }
    
    private fun findIndex(nums: IntArray, value: Int, i: Int): Int {
        var j = 0
        for (num in nums) {
            if (j != i && num == value) {
                return j
            }
            j++
        }
        return j
    }
}