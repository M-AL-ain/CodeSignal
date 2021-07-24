fun findEmailDomain(address: String): String {
    return address.split("@").last()
}

