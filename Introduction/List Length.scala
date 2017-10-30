def f(arr:List[Int]):Int = {
    arr.map(rec => (rec,1)).map(rec => rec._2).reduce((acc, v) => acc+v)
}
