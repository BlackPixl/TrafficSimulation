package com.simulata.TrafficSimulation.movimiento

import java.awt.Color

import com.simulata.TrafficSimulation.cartesiano._
import com.simulata.TrafficSimulation.vias._

//falta definir el modelo para representarlos*****/

//para poner los get y los set se debe de copiar todo el código, no vi como dejarlo en vehículo

class Camion (val pl:String,
              val o:Interseccion,
              val d:Interseccion,
              private var _v:Velocidad,
              val c: Color = Color.WHITE,
              val figura: java.awt.geom.Rectangle2D.Double = new java.awt.geom.Rectangle2D.Double(0,0, 10,10))
  extends Vehiculo(pl, o, d, _v, c, figura){
  
   private var _p:Punto = punto
 
 def punto=_p
 
 def p_=(p:Punto): Unit = _p = p
 
 def v= _v
  
 def v_=(vv:Velocidad):Unit = _v = vv
//Distancia Recorrida
 private var _dR:Double=0
  
 def dR=_dR
  
 def dR_=(dR:Double): Unit = _dR = dR

 def mover(dt:Double):Unit={
   move(dt)
   //Estos me parece son los únicos que vale la pena "actualizar"
   punto_=(punto)
   v_=(velocidad)
   dR_=(distanciaRecorrida)
 }
 
}
object Camion{
val r = scala.util.Random

  def generarPlaca:String={
    var a:String="R"
    for(i<- 0 to 4) a=a+Vehiculo.digitos(r.nextInt(10))
    a
  }
}

