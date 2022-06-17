package com.cindy.com.cindy.score

class Student (var name:String, var english:Int, var math:Int){
//    var name = ""
//    var english =0
//    var math = 0
      init {
//        println("testing")
    }
    fun print(){
//        println(name+"\t")
        println("$name\t$english\t$math\t${getAverage()}")
    }
    fun getAverage () :Int {
        return (english+math)/2
    }
}
fun main (){
    val stu = Student("jack ",55,87)
    stu.print()

}