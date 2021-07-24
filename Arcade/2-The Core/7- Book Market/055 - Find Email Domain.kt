fun findEmailDomain(address: String): String {
    return address.substringAfterLast('@')
}
