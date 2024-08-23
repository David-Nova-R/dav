package org.novarincon

fun main (args: Array<String>){
    val hauteur:Int = args[0].toInt()

    afficherTriangleh(hauteur)
}
fun afficherTriangleh(hauteur:Int){
    val etoile:String="*"
    for (i in 1..hauteur){
        println(etoile.repeat(i))
    }
}

//fun main(){
//    val etoile:String="*"
//   for (i in 1..4){
//       println(etoile.repeat(i))
//   }
//}


