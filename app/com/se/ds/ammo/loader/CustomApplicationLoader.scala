package com.se.ds.ammo.loader

import com.se.ds.ammo.config.{AppConfig, Constants}
import com.typesafe.config.Config
import play.ApplicationLoader.Context
import play.api.Configuration
import play.inject.guice.{GuiceApplicationBuilder, GuiceApplicationLoader}

/**
  * 自定义loader
  * @author rushidao
  */
class CustomApplicationLoader extends GuiceApplicationLoader {

  /**
    * 程序启动时执行
    * @param context context
    * @return
    */
  override def builder(context: Context): GuiceApplicationBuilder = {
    println("initing application")
    initialBuilder
      .in(context.environment)
      .loadConfig(
        loadSettingsFromApollo(context)
      )
      .overrides(overrides(context): _*)
  }

  /**
    * 从apollo获取配置，写入play配置文件
    * @param context context
    */
  private def loadSettingsFromApollo(context: Context): Config = {
    println(
      "adding slick database configurations"
    )
    val extra = Configuration(
      Constants.CONF_KEY_SLICK_DBS_DEFAULT_DB_URL -> s"${Constants.CONF_DB_URL_PREFIX}${AppConfig.DATABASE_SERVER}/${AppConfig.DATABASE_NAME}",
      Constants.CONF_KEY_SLICK_DBS_DEFAULT_DB_USER -> AppConfig.DATABASE_USERNAME,
      Constants.CONF_KEY_SLICK_DBS_DEFAULT_DB_PASSWORD -> AppConfig.DATABASE_PASSWORD,
      Constants.CONF_KEY_SLICK_DBS_DEFAULT_DB_SCHEMA -> AppConfig.DATABASE_SCHEMA,
      Constants.CONF_KEY_SLICK_DBS_DEFAULT_DB_NUMTHREADS -> AppConfig.DB_POOL_NUMTHREADS,
      Constants.CONF_KEY_SLICK_DBS_DEFAULT_DB_QUEUESIZE -> AppConfig.DB_POOL_QUEUQSIZE,
      Constants.CONF_KEY_SYSTEM_POOL_SIZE -> AppConfig.SYSTEM_POOL_SIZE
    )

    extra.withFallback(context.asScala().initialConfiguration).underlying

  }

}
