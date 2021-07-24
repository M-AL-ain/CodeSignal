fun switchLights(a: MutableList<Int>): MutableList<Int> {
    var numberOnes : Int =0
    for (i:Int in (a.size-1 downTo 0) ) {
        if(a[i]==1)
            numberOnes++
        if(numberOnes % 2 != 0) {
            a.set(i, Math.abs(a[i] - 1))
        }
    }
    return a
}
