fun arrayReplace(a: MutableList<Int>, e: Int, s: Int): MutableList<Int>
{
    a.forEachIndexed{i,it -> if(it==e) {a[i]=s}}
    return a
}
