fun addBorder(picture: MutableList<String>): MutableList<String> {
    val res = mutableListOf("*".repeat(picture[0].length + 2))
    picture.forEach { res.add("*$it*")}
    res.add("*".repeat(picture[0].length + 2))
    return res
}