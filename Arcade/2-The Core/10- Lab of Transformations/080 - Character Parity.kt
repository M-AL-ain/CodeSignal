fun characterParity(symbol: Char): String {
    if (!symbol.isDigit())
        return "not a digit"

    if (symbol.toInt() % 2 == 0)
        return "even"

    return "odd"
}
