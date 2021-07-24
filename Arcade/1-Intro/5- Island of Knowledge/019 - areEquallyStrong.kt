fun areEquallyStrong(yourLeft: Int, yourRight: Int, friendsLeft: Int, friendsRight: Int): Boolean {
    val totalStrengthEqual: Boolean = yourLeft + yourRight === friendsLeft + friendsRight
    val handDiffEqual: Boolean = Math.abs(yourLeft - yourRight) === Math.abs(friendsLeft -    friendsRight)
    return totalStrengthEqual && handDiffEqual
}
