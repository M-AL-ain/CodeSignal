fun isInfiniteProcess(a: Int, b: Int): Boolean {

    return !(a <= b && (a - b) % 2 == 0)

}
