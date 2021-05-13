package com.se.ds.ammo.service



import com.se.ds.ammo.entity.DeviceParameter
import slick.jdbc.SQLServerProfile.api._

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.DurationInt

object DeviceParameterService extends App {
  val db = Database.forConfig("sqlserver1")
  try {
    val deviceTable: TableQuery[DeviceParameter] = TableQuery[DeviceParameter]
    val result=deviceTable.take(10).result

//    db.run(result).map(print)
//    println(listAllDeviceAction)
    val r=db.run(result)
    Await.result(r,10.seconds)
    println(r.value.get.get)
  } finally db.close
}
