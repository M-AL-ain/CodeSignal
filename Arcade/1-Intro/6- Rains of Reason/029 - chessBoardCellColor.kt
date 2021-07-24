fun chessBoardCellColor(cell1: String, cell2: String) = ((cell1[0].toInt() + cell1[1].toInt())%2) == ((cell2[0].toInt() + cell2[1].toInt())%2)
