fun stolenLunch(note: String): String {
    val d = ('0'..'9').toList()
    val c = ('a'..'j').toList()
    return note.map {
        when {
            d.contains(it) -> c[it - '0']
            c.contains(it) -> '0' + c.indexOf(it)
            else -> it
        }
    }.joinToString("")
}
