fun reverseInParentheses(inputString: String): String {
    var stack = Stack<Int>()
    var res = inputString

    for (i in 0 until res.length) {
        if (res[i] == '(') {
            stack.push(i)
        } else if (res[i] == ')') {
            val start = stack.pop()
            val reversed = res.substring(start, i).reversed().toString()
            res = res.replaceRange(start, i, reversed)
        }
    }

    return res.replace("(", "").replace(")", "")
}
