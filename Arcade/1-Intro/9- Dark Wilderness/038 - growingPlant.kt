fun growingPlant(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int {

    return 1 + Math.max(0,  Math.ceil ((desiredHeight - upSpeed).toDouble()/(upSpeed-downSpeed).toDouble()).toInt())
}