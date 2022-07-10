class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.size == 1 || strs[0].isBlank()) return strs[0]
        var result = ""
        var strFirst = strs[0]
        for (i in 0 until strs[0].length) {
            for (j in 1 until strs.size) {
                if (strs[j].length > i && strFirst[i].equals(strs[j][i], false)) {
                    if (j == strs.size-1) { result += strFirst[i] }
                } else {
                    return result
                }
            }
        }
        return result
    }
}