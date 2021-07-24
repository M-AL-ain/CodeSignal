fun reflectString(inputString: String): String {
    var res = ""
    val abc = Array<String>(26) { i -> ('a' + i).toString() }

    for (ch in inputString)
        res += abc.get(25 - abc.indexOf(ch.toString()))
    return res

}
