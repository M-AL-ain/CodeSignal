fun boxBlur(image: MutableList<MutableList<Int>>) = (1..image.size-2).map{i->
    (1..image[i].size-2).map{ j->
        (-1..1).flatMap{k->(-1..1).map{l->image[i+k][j+l]}}.average().toInt()
    }
}
