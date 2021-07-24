fun areIsomorphic(array1: MutableList<MutableList<Int>>, array2: MutableList<MutableList<Int>>): Boolean {
    return array1.size == array2.size && array1.zip(array2).all { it.first.size == it.second.size }

}
