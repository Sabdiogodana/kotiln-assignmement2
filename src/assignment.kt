fun main(){
  surname("Sabdio")
var rem = modulus(33,8)
    println(rem)
 var sum = addition(44,17,20,12)
    println(sum)
   println ("interested in coding")

}
fun surname(name: String){
    var x = ("Hello" + " " + name)
    println(x)

}
fun modulus(num1: Int,num2: Int): Int{
    var rem =num1%num2
    return(rem)
}

fun addition(a: Int,b: Int,c: Int,d: Int): Int{
    var sum =a+b+c+d
    return(sum)
}

fun printinterestingFactAboutMe(fact: String){
    print ("interested in" + "" + fact)
}

