fun decipher(cipher: String): String {
    val result = StringBuilder()
    var current = ""
    cipher.forEach {
        current += it
        if (current.toInt() >= 'a'.toInt()) {
            result.append(current.toInt().toChar())
            current = ""
        }
    }
    return result.toString()
}