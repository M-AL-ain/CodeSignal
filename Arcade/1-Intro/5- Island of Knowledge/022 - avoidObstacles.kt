fun avoidObstacles(inputArray: MutableList<Int>): Int {
    inputArray.sort()
    for (i in 1 until inputArray.last()){
        if( inputArray.filter { it -> it % i == 0}.count() == 0) return i
    }
    return inputArray.last() +1
}
