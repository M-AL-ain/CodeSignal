fun alphabeticShift(inputString: String)= inputString.fold(""){
    str, c -> str + if(c == 'z') 'a' else c.inc()
}

