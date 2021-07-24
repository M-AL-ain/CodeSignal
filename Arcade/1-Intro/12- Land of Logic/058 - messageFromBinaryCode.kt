fun messageFromBinaryCode(code: String): String {
    return code.chunked(8).map { it.toInt(2).toChar()  }.joinToString("")
}
