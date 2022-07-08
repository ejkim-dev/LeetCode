class Solution {
    fun isPalindrome(x: Int): Boolean {
        return when {
            x == 0 -> true
            x < 0 -> false
            else -> {
                var temp = x
                var strReverse: String = ""
                var i = 1
                while (temp > 0) {
                    strReverse += temp % 10
                    temp /= 10
                    i++
                }
                x.toString() == strReverse
            }
        }
    }
}