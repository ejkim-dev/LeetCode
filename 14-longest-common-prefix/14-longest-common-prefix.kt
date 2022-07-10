class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.size == 1 || strs[0].isBlank()) return strs[0]
        var result = ""
        strs[0].forEachIndexed { index, c ->
            for (j in 1 until strs.size) {
                if (strs[j].length > index && c.equals(strs[j][index], false)) {
                    if (j == strs.size-1) { result += c }
                } else {
                    return result
                }
            }
        }
        return result
    }
}