fun isCaseInsensitivePalindrome(s: String): Boolean {
    return s.toLowerCase() == s.reversed().toLowerCase()
}