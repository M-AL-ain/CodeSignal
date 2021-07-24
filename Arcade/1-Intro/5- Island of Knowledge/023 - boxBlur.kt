fun boxBlur(image: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> =
    (1..image.size - 2)
        .map { row -> (1..image[0].size - 2)
            .map { col -> (-1..1)
                .sumBy { x -> (-1..1)
                    .sumBy { y -> image[row + x][col + y] } } / 9
            }.toMutableList()
        }.toMutableList()
