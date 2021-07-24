fun isMAC48Address(inputString: String): Boolean {
    val sections = inputString.split("-")
    if(sections.size != 6)
        return false

    sections.forEach {
        if(it.length != 2)
            return false

        it.forEach {
            if(!("A".."F").contains(it.toString()) && !("0".."9").contains(it.toString()))
                return false
        }

    }

    return true
}