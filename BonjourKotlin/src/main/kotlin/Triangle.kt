package org.novarincon

fun main (args: Array<String>){

   println(afficherTriangleh(4))
    println(afficherTriangleh(8))
    println(afficherTriangleh(10))
    println(afficherTriangleh(100))
}
fun afficherTriangleh(hauteur:Int): String {
    val etoile:String="*"
    for (i in 1..hauteur){
        println(etoile.repeat(i))
    }
    return ""
}

//fun main(){
//    val etoile:String="*"
//   for (i in 1..4){
//       println(etoile.repeat(i))
//   }
//}


