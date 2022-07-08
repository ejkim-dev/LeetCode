class Solution {
    fun isPalindrome(x: Int): Boolean {
        return when {
            x == 0 -> true
            x < 0 -> false
            else -> {
                var temp = x
                var reverse = 0.0
                while (temp > 0) {
                    reverse *= 10
                    reverse += (temp % 10)
                    temp /= 10
                }
                x.toDouble() == reverse
            }
        }
    }
}