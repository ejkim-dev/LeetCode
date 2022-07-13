class Solution {
    fun isValid(s: String): Boolean {
        if (s.length <= 1) return false
        if (s.length % 2 != 0) return false
        val map = mapOf<Char, Char>('(' to ')', '[' to ']', '{' to '}')
        val key = arrayListOf<Char>()
        if (!map.containsKey(s[0])) return false
        s.forEachIndexed { index, c ->
            if (map.containsKey(c)){
                key.add(c)
            } else if (map.containsValue(c)) {
                if (key.size == 0 || map[key[key.lastIndex]] != c) return false
               key.removeAt(key.size-1)
            } else {
                return false
            }
            if (index == s.length-1 && key.size == 0) return true
        }
        return false
    }
}