fun addBorder(picture: MutableList<String>): MutableList<String> {
    var repeated = "*".repeat(picture[0].length + 2)
    var res = mutableListOf<String>(repeated)
    for(s in picture)
        res.add("*$s*")
    res.add(repeated)

    return res
}
