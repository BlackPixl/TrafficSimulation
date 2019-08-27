package com.simulata.TrafficSimulation.movimiento

import com.simulata.TrafficSimulation.cartesiano._

import java.awt.Color

class Bus (val pl:String,
           private var _v:Velocidad,
           private var _tasaA: Double,
           val c:Color = Color.WHITE)
  extends Vehiculo(pl, _v, _tasaA, c){

}

object Bus{
  val r = scala.util.Random

  def generarPlaca:String={
    var a:String=""
    for(i<- 0 to 2) a=a+Vehiculo.letras(r.nextInt(26))
    for(i<-0 to 2) a=a+Vehiculo.digitos(r.nextInt(10))
    a
  }
}
