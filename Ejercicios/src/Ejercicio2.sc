def transformar(notas: List[Double], politica: Double => Double): List[Double] = {
    notas.map(politica)
}
val notas = List(5.0, 6.5, 8.3, 9.9)

val redondeadas = transformar(notas, n => Math.round(n).toDouble)
    println("Redondeadas: " + redondeadas)

val bonificadas = transformar(notas, n => n + 0.5)
    println("Bonificadas: " + bonificadas)

val reducidas = transformar(notas, n =>
      if (n > 9) n - 0.2 else n)
    println("Reducidas: " + reducidas)



