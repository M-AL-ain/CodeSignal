fun areSimilar(a: MutableList<Int>, b: MutableList<Int>): Boolean {

    val Stack = mutableListOf<Int>()
    var diff = 0
    for (i in 0 until a.size) {
        if (a[i] != b[i]) {
            if (Stack.isEmpty()){
                Stack.add(i)
                diff++
            } else if (a[i] == b[Stack[Stack.lastIndex]] &&
                b[i] == a[Stack[Stack.lastIndex]] ) {
                Stack.removeAt(Stack.lastIndex)
            }
        }
        if (diff >= 2)
            return false
    }
    return Stack.isEmpty()
}