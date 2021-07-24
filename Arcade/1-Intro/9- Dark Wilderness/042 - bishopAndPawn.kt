fun bishopAndPawn(bishop: String, pawn: String): Boolean =
    kotlin.math.abs(bishop[0]-pawn[0]) == kotlin.math.abs(bishop[1]-pawn[1])
