fun main() {
    introduction("oluoch",20)
    robot(3)
    robot(8)
    robot(18)
    println(names(arrayOf("billy","miriam","oluoch")))
    numbers()




}
fun introduction(name:String,age:Int) {
    println("My name is $name and i am $age years old")

}
fun robot(age:Int){
    if (age<6){
        println("you can have your bottle of milk")
    }
    else if (age>6 && age<15){
        println("You can have your bottles of fanta orange")
    }
    else{
        println("You all can have  your cocacola bottles")
    }
}
fun names(name:Array<String>):Int {
    var m = 0
    for (jina in name) {
        if (jina.length > 5) {
            m++
        }
    }
}

fun numbers(){
    for(p in 1..100){
        if (p%2!=0){
            println(p)
        }
    }
}



