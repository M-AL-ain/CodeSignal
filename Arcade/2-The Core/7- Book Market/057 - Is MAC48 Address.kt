fun isMAC48Address(inputString: String): Boolean {
    var a = inputString.replace("-","")
    var v = a.filter{ n -> (n<='F' && n >= 'A') || (n <= '9' && n>='0') }.toList()
    println(v)
    return inputString.length == 17 && a.length == 12 &&
            v.size == 12
}