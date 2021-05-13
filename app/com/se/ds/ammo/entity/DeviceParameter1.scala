package com.se.ds.ammo.entity

import slick.jdbc.SQLServerProfile.api._
import slick.lifted.ProvenShape

import java.sql.Timestamp


class DeviceParameter1(tag: Tag) extends Table[
  (Long, Long, String, Int, Option[String], Option[String], Option[String], Int, Option[String], Option[String], Option[String], Option[String],
    Int, Option[String], Option[String], Boolean, Option[String], Option[Long], Boolean, Int)


](tag, "DeviceParameter") {
  def id: Rep[Long] = column[Long]("Id", O.PrimaryKey)

  def DeviceId: Rep[Long] = column[Long]("DeviceId")

  def Name: Rep[String] = column[String]("Name")

  def Type: Rep[Int] = column[Int]("Type")

  def IconType: Rep[Option[String]] = column[Option[String]]("IconType")

  def Abbreviation: Rep[Option[String]] = column[Option[String]]("Abbreviation")

  def TrippingCurve: Rep[Option[String]] = column[Option[String]]("TrippingCurve")

  def HardwareId: Rep[Int] = column[Int]("HardwareId")

  def Unit: Rep[Option[String]] = column[Option[String]]("Unit")

  def Ratio: Rep[Option[String]] = column[Option[String]]("Ratio")

  def DataType: Rep[Option[String]] = column[Option[String]]("DataType")

  def TransmissionType: Rep[Option[String]] = column[Option[String]]("TransmissionType")

  def TransmissionFrequency: Rep[Int] = column[Int]("TransmissionFrequency")

  def RegisterAddress: Rep[Option[String]] = column[Option[String]]("RegisterAddress")

  def RegisterLength: Rep[Option[String]] = column[Option[String]]("RegisterLength")

  def IsUploaded: Rep[Boolean] = column[Boolean]("IsUploaded")

  def Group: Rep[Option[String]] = column[Option[String]]("Group")

  def UniqueId: Rep[Option[Long]] = column[Option[Long]]("UniqueId")

  def IsDisplayChart: Rep[Boolean] = column[Boolean]("IsDisplayChart")

  def ValueType: Rep[Int] = column[Int]("ValueType")



  // Every table needs a * projection with the same type as the table's type parameter
  def * : ProvenShape[(Long, Long, String, Int, Option[String], Option[String], Option[String], Int, Option[String], Option[String], Option[String], Option[String],
    Int, Option[String], Option[String], Boolean, Option[String], Option[Long], Boolean, Int)] =
    (id, DeviceId, Name, Type, IconType, Abbreviation, TrippingCurve, HardwareId, Unit, Ratio, DataType, TransmissionType,
      TransmissionFrequency, RegisterAddress, RegisterLength, IsUploaded, Group, UniqueId, IsDisplayChart, ValueType)


}

//object DeviceParameter {
//  def unapply():Option[((),())]
//  implicit val deviceParameterFormat = Json.format[DeviceParameter]
//}