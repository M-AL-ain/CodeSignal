fun arrayMaxConsecutiveSum(inputArray: MutableList<Int>, k: Int): Int
{
    var s = inputArray.subList(0,k).sum()
    var m = s
    for (i in k until inputArray.size)
    {
        s -= inputArray[i - k]
        s += inputArray[i]
        if (s > m) { m = s }
    }
    return m
}