fun sortByHeight(a: MutableList<Int>): MutableList<Int> {
    val temp = a.filter { it != -1 }.sorted().toMutableList()
    for(i in a.indices){
        if(a[i] != -1){
            a[i] = temp.removeAt(0)
        }
    }
    return a

}
