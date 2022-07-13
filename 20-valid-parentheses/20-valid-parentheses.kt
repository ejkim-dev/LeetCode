class Solution {
    fun isValid(s: String): Boolean {
        val map = mapOf(')' to '(', ']' to '[', '}' to '{')
        val key = arrayListOf<Char>()

        if (s.length <= 1) return false
        if (s.length % 2 != 0) return false
        if (!map.containsValue(s.first())) return false
        if (!map.containsKey(s.last())) return false

        for (c in s) {
            when {
                map.containsValue(c) -> key.add(c)
                map.containsKey(c) -> if (key.isEmpty() || map[c] != key.removeAt(key.size-1)) return false
                else -> return false
            }
        }

        return key.isEmpty()
    }
}