package com.se.ds.ammo.entity

import slick.jdbc.SQLServerProfile.api._
import slick.lifted.ProvenShape

class DeviceSample(tag: Tag) extends Table[(Long, Long, String,Int,Option[String])](tag, "DeviceParameter") {

  def id: Rep[Long] = column[Long]("Id", O.PrimaryKey)

  def DeviceId: Rep[Long] = column[Long]("DeviceId")

  def Name: Rep[String] = column[String]("Name")
  def Type: Rep[Int] = column[Int]("Type")

  def IconType: Rep[Option[String]] = column[Option[String]]("IconType")

  def * : ProvenShape[(Long, Long, String,Int,Option[String])] = (id, DeviceId, Name,Type,IconType)
//  def * : ProvenShape[(Long, Long, String,Int)] = (id, DeviceId, Name,Type)
}
