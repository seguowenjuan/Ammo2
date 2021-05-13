package com.se.ds.ammo.entity

import java.sql.Timestamp

case class DeviceTable(
                        Id: Long,
                        DeviceId: Long,
                        Name: String,
                        Type: Int,
                        IconType: Option[String],
                        Abbreviation: Option[String],
                        TrippingCurve: Option[String],
                        HardwareId: Int,
                        Unit: Option[String],
                        Ratio: Option[String],
                        DataType: Option[String],
                        TransmissionType: Option[String],
                        TransmissionFrequency: Int,
                        RegisterAddress: Option[String],
                        RegisterLength: Option[String],
                        IsUploaded: Boolean,
                        Group: Option[String],
                        UniqueId: Option[Long],
                        IsDisplayChart: Boolean,
                        ValueType: Int,
                        Values: Option[String],
                        Remarks: Option[String],
                        GroupOrder: Option[Int],
                        GroupParameterOrder: Option[Int],
                        ChartMaxValue: Option[String],
                        Description: Option[String],
                        AlarmStatus: Option[Int],
                        InputType: Option[Int],
                        AlarmLevel: Option[String],
                        Timestamp: Option[Timestamp],
                        GroupDisplay: Option[Int],
                        IsCollect: Option[Boolean],
                        IsNeedSettingRegister: Option[Boolean],
                        ParaDataType: Option[String],
                        ParaArrangement: Option[String],
                        Range: Option[String],
                        CollectRate: Option[String],
                        ParaType: Option[Int],
                        AlarmOptionTemplate: Option[String],
                        BaseValue: Option[String],
                        SecurityLevel: Option[Int],
                        SecurityLevelOrder: Option[Float],
                        TagId: Option[Long],
                        ChartWarnValue: Option[String],
                        ChartAlarmValue: Option[String],
                        ChartType: Option[Int],
                        StoreRate: Option[Int],
                        RWStatus: Option[Int],
                        RWSetting: Option[String],
                        RWRange: Option[String],
                        Offset: Option[Float],
                        ZigbeeDataType: Option[String],
                        ClusterId: Option[String],
                        AttributeId: Option[String],
                        EdgeFormula: Option[String],
                        ModbusTranDataType: Option[String],
                        AlarmOptionTemplate2: Option[String],
                        BitAddress: Option[Int],
                        IsVerify: Option[Boolean]
                      )