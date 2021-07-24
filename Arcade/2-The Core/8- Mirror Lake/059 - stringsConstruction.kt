fun stringsConstruction(a: String, b: String): Int {
   var counts = mutableListOf<Int>()
   var visited = mutableSetOf<Char>()
   var chars = a.toCharArray()
   for (i in chars.indices) {
      var c = chars[i]
      if (visited.contains(c))
         continue
      var count = b.count { it == c } / chars.count { it == c }
      counts.add(count)
      visited.add(c)
   }
   return counts.min() ?: 0
}
