fun alphabetSubsequence(s: String): Boolean {
    for (i in 1 until s.length) {
        if (s.toCharArray()[i - 1] >= s.toCharArray()[i])
            return false
    }

    return true
}
