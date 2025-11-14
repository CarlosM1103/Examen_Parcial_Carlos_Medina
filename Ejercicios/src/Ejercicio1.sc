var datos : List[Double] = List(1,2,3,4,5)

for(i<-0 until datos.size){
  val diferencia = datos(i) - datos.sum/datos.size
  val sumC = diferencia * diferencia
  println(Math.sqrt(sumC/ datos.size))
}

  















  
