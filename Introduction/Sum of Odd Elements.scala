def f(arr:List[Int]):Int = {
    arr.filter(n => n%2 != 0).reduce((acc,v) => acc+v)
}
