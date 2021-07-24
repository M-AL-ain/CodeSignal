fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean
{
    var  count1 = 0
    var count2 = 0;
    val seq= sequence.size -1
    for(i in 0 until seq){
        if(sequence[i] >= sequence[ i + 1 ]) count1++
    }

    for(i in 0 until seq-1){
        if(sequence[i] >= sequence[ i + 2 ]) count2++
    }
    return count1 <= 1 && count2 <= 1




}
