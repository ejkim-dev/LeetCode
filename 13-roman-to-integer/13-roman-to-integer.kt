class Solution {
    fun romanToInt(s: String): Int {
        val romanMap = mapOf<Char, Int>('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
        var result = 0
        var j = 'M'
       s.forEach {
            when (Pair(j, it)) {
                Pair('I', 'V'), Pair('I', 'X')
                , Pair('X', 'L'), Pair('X', 'C'),
                Pair('C', 'D'), Pair('C', 'M') -> result -= (romanMap.getValue(j) * 2)
            }
            result += romanMap.getValue(it)
            j = it
        }
        return result
    }
}