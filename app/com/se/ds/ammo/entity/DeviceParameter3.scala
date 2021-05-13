package com.se.ds.ammo.entity

import slick.jdbc.SQLServerProfile.api._
import slick.lifted.ProvenShape


class DeviceParameter3(tag: Tag) extends Table[
  (Long, Long, String, Int, Option[String], Option[String], Option[String])


](tag, "DeviceParameter") {
  def id: Rep[Long] = column[Long]("Id", O.PrimaryKey)

  def DeviceId: Rep[Long] = column[Long]("DeviceId")

  def Name: Rep[String] = column[String]("Name")

  def Type: Rep[Int] = column[Int]("Type")

  def IconType: Rep[Option[String]] = column[Option[String]]("IconType")

  def Abbreviation: Rep[Option[String]] = column[Option[String]]("Abbreviation")

  def TrippingCurve: Rep[Option[String]] = column[Option[String]]("TrippingCurve")



  // Every table needs a * projection with the same type as the table's type parameter
  def * : ProvenShape[(Long, Long, String, Int, Option[String], Option[String], Option[String])] =
    (id, DeviceId, Name, Type, IconType, Abbreviation, TrippingCurve)


}

//object DeviceParameter {
//  def unapply():Option[((),())]
//  implicit val deviceParameterFormat = Json.format[DeviceParameter]
//}