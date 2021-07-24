fun fileNaming(names: MutableList<String>): MutableList<String> {
    val result = linkedSetOf<String>()
    names.forEach {
        if(!result.contains(it)){
            result.add(it)
        }else{
            var k = 1
            while (result.contains("$it($k)")){
                k++
            }
            result.add("$it($k)")
        }
    }
    return result.toMutableList()
}