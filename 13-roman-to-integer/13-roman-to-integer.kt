class Solution {
    fun romanToInt(s: String): Int {
        val romanMap = mapOf<Char, Int>('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
        var result = 0
        var beforeValue = 1000
        s.forEach {
            val value = romanMap.getOrDefault(it, 0)
            if (value > beforeValue) result -= beforeValue * 2
            result += value
            beforeValue = value
        }
        return result
    }
}