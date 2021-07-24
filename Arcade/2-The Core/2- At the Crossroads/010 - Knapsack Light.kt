fun knapsackLight(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int {
    var maxValue = 0;
    val values = mutableListOf<Int>( value1, value2, value1 + value2 )
    val weights = mutableListOf<Int>(weight1, weight2, weight1 + weight2 )
    var i =0
    while ( i <=2){
        if (weights[i] <= maxW && values[i] >= maxValue) maxValue = values[i]
        i++}


    return maxValue;
}
