
def generadorSaludo(fraseBase: String): String => String = {
  def saludoConNombre(nombre: String): String = {
    fraseBase + ", " + nombre + "!"
  }
  saludoConNombre
}
val saludo = generadorSaludo("Hola")
println(saludo("Ana"))
