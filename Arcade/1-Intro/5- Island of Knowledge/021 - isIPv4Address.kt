fun isIPv4Address(inputString: String): Boolean {
    val splitparts: List<String> = inputString.split(".")
    if (splitparts.size != 4) {
        return false
    }
    var p="^[0-9]{1,3}$"
    for (part in splitparts) {
        if (part.isEmpty) return false
        if (part[0]=='0'&& part.length!=1) return false
        if (!part.matches(p.toRegex())) return false
        if (part.toInt() !in 0..255) return false
    }

    return true
}