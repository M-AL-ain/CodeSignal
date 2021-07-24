fun palindromeRearranging(inputString: String): Boolean {
    var oddcounter = 0

    val letterSet = inputString.toCharArray().toSet()

    for(i in letterSet){
        if (inputString.count{ it == i}%2==1){
            oddcounter++
        }
    }

    return oddcounter<2
}
