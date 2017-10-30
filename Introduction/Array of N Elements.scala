object Solution extends App {
    def f(num:Int) : List[Int] = {
        List.fill(num)(1)
    }
    println(f(readInt))
}
