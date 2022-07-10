class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var i = 0
        var result = ""
        var trun = true
        while (trun) {
            if (strs[0] == "" || strs[0].length == i) return result
            if (strs.size > 1) {
                val equalChar = strs[0][i]
                for (j in 1 until strs.size) {
                    if (strs[j].length > i && equalChar.equals(strs[j][i], false)) {
                        if (j == strs.size -1) {
                            result += equalChar
                        }
                    } else {
                        trun = false
                        break
                    }
                }
                i ++
            } else {
                result = strs[0]
                break
            }
        }
        return result
    }
}