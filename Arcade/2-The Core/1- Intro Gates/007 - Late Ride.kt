fun lateRide(n: Int)= ((n % 60) % 10 + (n % 60) / 10 + (n / 60) % 10 + (n / 60) / 10)
// minutes = n % 60    //  hours = n / 60