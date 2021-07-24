fun createAnagram(s: String, t: String): Int {
    return s.toCharArray()
        .distinct()
        .map { i -> Math.max(0, s.count { it == i } - t.count { it == i }) }
        .sum()
}