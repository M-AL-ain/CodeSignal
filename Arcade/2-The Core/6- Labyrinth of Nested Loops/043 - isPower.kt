fun isPower(n: Int): Boolean {
    for(i in 2..n){
        for(j in 2..n){
            if(Math.pow(i.toDouble(),j.toDouble()).toInt() == n){
                return true

            }}}

    return n == 1
}
