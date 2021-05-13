package com.se.ds.ammo.config

import com.ctrip.framework.apollo.ConfigService

/**
 * apollo配置获取
 *
 * @author Jane
 */
object AppConfig {
  val apolloconfig: com.ctrip.framework.apollo.Config =
    ConfigService.getAppConfig

  def DATABASE_SERVER: String =
    apolloconfig.getProperty("DATABASE_SERVER", "172.26.69.113:1433")

  def DATABASE_NAME: String =
    apolloconfig.getProperty("DATABASE_NAME", "REMInformation"
    )

  def DATABASE_USERNAME: String =
    apolloconfig.getProperty("DATABASE_USERNAME", "cnrem")

  def DATABASE_PASSWORD: String =
    apolloconfig.getProperty("DATABASE_PASSWORD", "P@ssw2rd")

  def DATABASE_SCHEMA: String =
    apolloconfig.getProperty("DATABASE_SCHEMA", "dbo")

  def DB_POOL_NUMTHREADS: Int =
    apolloconfig.getIntProperty("DB_POOL_NUMTHREADS", 20)

  def DB_POOL_QUEUQSIZE: Int =
    apolloconfig.getIntProperty("DB_POOL_QUEUQSIZE", 1000)

  def SYSTEM_POOL_SIZE: Int =
    apolloconfig.getIntProperty("SYSTEM_FIXED_POOL_SIZE", 50)
}
