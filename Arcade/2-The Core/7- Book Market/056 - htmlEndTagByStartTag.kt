fun htmlEndTagByStartTag(startTag: String): String {
    val pos = startTag.indexOf(" ")

    if (pos == -1)
        return startTag.substring(0, 1) + "/" + startTag.substring(1)
    var st = startTag.substring(0, pos)
    return st.substring(0, 1) + "/" + st.substring(1) + ">"
}