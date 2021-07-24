fun higherVersion(ver1: String, ver2: String): Boolean {
    val ver1spl = ver1.split(".").map{it.toInt()}
    val ver2spl = ver2.split(".").map{it.toInt()}
    for(i in 0 until ver1spl.size) {
        if(ver1spl[i] != ver2spl[i]) {
            return ver1spl[i] > ver2spl[i]
        }
    }
    return false
}
