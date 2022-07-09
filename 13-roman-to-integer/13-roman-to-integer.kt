class Solution {
    fun romanToInt(s: String): Int {
        val romanMap = mapOf<Char, Int>('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
        var result = 0
        for (i in 1 .. s.length) {
            when {
                i == s.length -> result += romanMap.getValue(s[i-1])
                romanMap.getValue(s[i-1]) < romanMap.getValue(s[i]) -> result -= romanMap.getValue(s[i-1])
                else -> result += romanMap.getValue(s[i-1])
            }
        }
        return result
    }
}