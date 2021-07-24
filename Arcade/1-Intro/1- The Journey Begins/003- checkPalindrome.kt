fun checkPalindrome(inputString: String): Boolean {
    val  str =  StringBuilder(inputString)
    return inputString.equals(str.reverse().toString())
}