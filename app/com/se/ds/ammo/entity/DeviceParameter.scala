package com.se.ds.ammo.entity

import slick.jdbc.SQLServerProfile.api._
import slick.lifted.{ProvenShape, ForeignKeyQuery}

import java.sql.Timestamp



class DeviceParameter(tag: Tag) extends Table[
  ((Long, Long, String, Int, Option[String], Option[String], Option[String], Option[Int], Option[String], Option[String], Option[String], Option[String],
    Option[Int], Option[String], Option[String], Boolean, Option[String], Option[Long], Boolean, Int),
    (Option[String], Option[String], Option[Int], Option[Int], Option[String], Option[String], Option[Int], Option[Int], Option[String],
      Option[Timestamp], Option[Int], Option[Boolean], Option[Boolean], Option[String], Option[String], Option[String], Option[String], Option[Int]),
    (Option[String],Option[String],Option[Int],Option[Float],Option[Long],Option[String],Option[String],Option[Int],
      Option[Int],Option[Int],Option[String], Option[String], Option[Float], Option[String], Option[String], Option[String], Option[String], Option[String],
      Option[String], Option[Int], Option[Boolean]))

](tag, "DeviceParameter") {
  def id: Rep[Long] = column[Long]("Id", O.PrimaryKey)

  def DeviceId: Rep[Long] = column[Long]("DeviceId")

  def Name: Rep[String] = column[String]("Name")

  def Type: Rep[Int] = column[Int]("Type")

  def IconType: Rep[Option[String]] = column[Option[String]]("IconType")

  def Abbreviation: Rep[Option[String]] = column[Option[String]]("Abbreviation")

  def TrippingCurve: Rep[Option[String]] = column[Option[String]]("TrippingCurve")

  def HardwareId: Rep[Option[Int]] = column[Option[Int]]("HardwareId")

  def Unit: Rep[Option[String]] = column[Option[String]]("Unit")

  def Ratio: Rep[Option[String]] = column[Option[String]]("Ratio")

  def DataType: Rep[Option[String]] = column[Option[String]]("DataType")

  def TransmissionType: Rep[Option[String]] = column[Option[String]]("TransmissionType")

  def TransmissionFrequency: Rep[Option[Int]] = column[Option[Int]]("TransmissionFrequency")

  def RegisterAddress: Rep[Option[String]] = column[Option[String]]("RegisterAddress")

  def RegisterLength: Rep[Option[String]] = column[Option[String]]("RegisterLength")

  def IsUploaded: Rep[Boolean] = column[Boolean]("IsUploaded")

  def Group: Rep[Option[String]] = column[Option[String]]("Group")

  def UniqueId: Rep[Option[Long]] = column[Option[Long]]("UniqueId")

  def IsDisplayChart: Rep[Boolean] = column[Boolean]("IsDisplayChart")

  def ValueType: Rep[Int] = column[Int]("ValueType")

  def Values: Rep[Option[String]] = column[Option[String]]("Values")

  def Remarks: Rep[Option[String]] = column[Option[String]]("Remarks")

  def GroupOrder: Rep[Option[Int]] = column[Option[Int]]("GroupOrder")

  def GroupParameterOrder: Rep[Option[Int]] = column[Option[Int]]("GroupParameterOrder")

  def ChartMaxValue: Rep[Option[String]] = column[Option[String]]("ChartMaxValue")

  def Description: Rep[Option[String]] = column[Option[String]]("Description")

  def AlarmStatus: Rep[Option[Int]] = column[Option[Int]]("AlarmStatus")

  def InputType: Rep[Option[Int]] = column[Option[Int]]("InputType")

  def AlarmLevel: Rep[Option[String]] = column[Option[String]]("AlarmLevel")

  def Timestamp: Rep[Option[Timestamp]] = column[Option[Timestamp]]("Timestamp")

  def GroupDisplay: Rep[Option[Int]] = column[Option[Int]]("GroupDisplay")

  def IsCollect: Rep[Option[Boolean]] = column[Option[Boolean]]("IsCollect")

  def IsNeedSettingRegister: Rep[Option[Boolean]] = column[Option[Boolean]]("IsNeedSettingRegister")

  def ParaDataType: Rep[Option[String]] = column[Option[String]]("ParaDataType")

  def ParaArrangement: Rep[Option[String]] = column[Option[String]]("ParaArrangement")

  def Range: Rep[Option[String]] = column[Option[String]]("Range")

  def CollectRate: Rep[Option[String]] = column[Option[String]]("CollectRate")

  def ParaType: Rep[Option[Int]] = column[Option[Int]]("ParaType")

  def AlarmOptionTemplate: Rep[Option[String]] = column[Option[String]]("AlarmOptionTemplate")

  def BaseValue: Rep[Option[String]] = column[Option[String]]("BaseValue")

  def SecurityLevel: Rep[Option[Int]] = column[Option[Int]]("SecurityLevel")

  def SecurityLevelOrder: Rep[Option[Float]] = column[Option[Float]]("SecurityLevelOrder")

  def TagId: Rep[Option[Long]] = column[Option[Long]]("TagId")

  def ChartWarnValue: Rep[Option[String]] = column[Option[String]]("ChartWarnValue")

  def ChartAlarmValue: Rep[Option[String]] = column[Option[String]]("ChartAlarmValue")

  def ChartType: Rep[Option[Int]] = column[Option[Int]]("ChartType")

  def StoreRate: Rep[Option[Int]] = column[Option[Int]]("StoreRate")

  def RWStatus: Rep[Option[Int]] = column[Option[Int]]("RWStatus")

  def RWSetting: Rep[Option[String]] = column[Option[String]]("RWSetting")

  def RWRange: Rep[Option[String]] = column[Option[String]]("RWRange")

  def Offset: Rep[Option[Float]] = column[Option[Float]]("Offset")

  def ZigbeeDataType: Rep[Option[String]] = column[Option[String]]("ZigbeeDataType")

  def ClusterId: Rep[Option[String]] = column[Option[String]]("ClusterId")

  def AttributeId: Rep[Option[String]] = column[Option[String]]("AttributeId")

  def EdgeFormula: Rep[Option[String]] = column[Option[String]]("EdgeFormula")

  def ModbusTranDataType: Rep[Option[String]] = column[Option[String]]("ModbusTranDataType")

  def AlarmOptionTemplate2: Rep[Option[String]] = column[Option[String]]("AlarmOptionTemplate2")

  def BitAddress: Rep[Option[Int]] = column[Option[Int]]("BitAddress")

  def IsVerify: Rep[Option[Boolean]] = column[Option[Boolean]]("IsVerify")

  // Every table needs a * projection with the same type as the table's type parameter
  def * : ProvenShape[((Long, Long, String, Int, Option[String], Option[String], Option[String], Option[Int], Option[String], Option[String], Option[String], Option[String],
    Option[Int], Option[String], Option[String], Boolean, Option[String], Option[Long], Boolean, Int),
    (Option[String], Option[String], Option[Int], Option[Int], Option[String], Option[String], Option[Int], Option[Int], Option[String],
      Option[Timestamp], Option[Int], Option[Boolean], Option[Boolean], Option[String], Option[String], Option[String], Option[String], Option[Int]),
    (Option[String],Option[String],Option[Int],Option[Float],Option[Long],Option[String],Option[String],Option[Int],
      Option[Int],Option[Int],Option[String], Option[String], Option[Float], Option[String], Option[String], Option[String], Option[String], Option[String],
      Option[String], Option[Int], Option[Boolean]))] =
    ((id, DeviceId, Name, Type, IconType, Abbreviation, TrippingCurve, HardwareId, Unit, Ratio, DataType, TransmissionType,
      TransmissionFrequency, RegisterAddress, RegisterLength, IsUploaded, Group, UniqueId, IsDisplayChart, ValueType),
      (Values, Remarks, GroupOrder, GroupParameterOrder, ChartMaxValue, Description, AlarmStatus, InputType, AlarmLevel,
      Timestamp, GroupDisplay, IsCollect, IsNeedSettingRegister, ParaDataType, ParaArrangement, Range, CollectRate, ParaType),
      (AlarmOptionTemplate, BaseValue, SecurityLevel, SecurityLevelOrder, TagId, ChartWarnValue, ChartAlarmValue, ChartType,
      StoreRate, RWStatus, RWSetting, RWRange, Offset, ZigbeeDataType, ClusterId, AttributeId, EdgeFormula, ModbusTranDataType,
      AlarmOptionTemplate2, BitAddress, IsVerify))

}

//object DeviceParameter {
//  def unapply():Option[((),())]
//  implicit val deviceParameterFormat = Json.format[DeviceParameter]
//}