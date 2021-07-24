fun buildPalindrome(st: String): String = st.indices.first {
    fun String.isPalindrome() = (0..length / 2).all { i -> get(i) == get(length - i - 1) }
    st.drop(it).isPalindrome()
}.let { "$st${st.take(it).reversed()}" }