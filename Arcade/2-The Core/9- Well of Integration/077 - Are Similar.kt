fun areSimilar(a: MutableList<Int>, b: MutableList<Int>): Boolean {
    if(a == b)
        return true
    var indexes = mutableListOf<Int>()
    for(i in a.indices){
        if(a[i] != b[i]){
            indexes.add(i)
        }
    }
    if(indexes.size == 2){
        if(a[indexes[0]] == b[indexes[1]] && a[indexes[1]] == b[indexes[0]])
            return true
    }
    return false
}