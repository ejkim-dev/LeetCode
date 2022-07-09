class Solution {
    fun romanToInt(s: String): Int {
        val romanMap = mapOf<Char, Int>('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
        var result = 0
        var j = '1'
        for (i in s.indices) {
            when (s[i]) {
                'V', 'X' -> if (j == 'I') result -= (romanMap.getValue(j) * 2)
                'L', 'C' -> if (j == 'X') result -= (romanMap.getValue(j) * 2)
                'D', 'M' -> if (j == 'C') result -= (romanMap.getValue(j) * 2)
                else ->  {}
            }
            result += romanMap.getValue(s[i])
            j = s[i]
        }
        return result
    }
}