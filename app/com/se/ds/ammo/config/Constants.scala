package com.se.ds.ammo.config

/**
  * 常量
  * @author Jane
  */
object Constants {

  //配置相关常量
  val CONF_FILE = "conf/application.conf"
  val CONF_BAK_FILE = "conf/applicationBak.conf"

  val CONF_DB_URL_PREFIX = "jdbc:postgresql://"
  val CONF_KEY_SLICK_DBS_DEFAULT_DB_URL = "slick.dbs.default.db.url"
  val CONF_KEY_SLICK_DBS_DEFAULT_DB_USER = "slick.dbs.default.db.user"
  val CONF_KEY_SLICK_DBS_DEFAULT_DB_PASSWORD = "slick.dbs.default.db.password"
  val CONF_KEY_SLICK_DBS_DEFAULT_DB_SCHEMA = "slick.dbs.default.db.schema"
  val CONF_KEY_SLICK_DBS_DEFAULT_DB_NUMTHREADS =
    "slick.dbs.default.db.numThreads"
  val CONF_KEY_SLICK_DBS_DEFAULT_DB_QUEUESIZE = "slick.dbs.default.db.queueSize"
  val CONF_KEY_SYSTEM_POOL_SIZE =
    "akka.actor.default-dispatcher.thread-pool-executor.fixed-pool-size"

  val RESPONSE_FIELD_ERRORCODE = "errorCode"
  val RESPONSE_FIELD_ERRORMSG = "errorMessage"
  val RESPONSE_ERRORCODE_LAYER = "7"
  val RESPONSE_ERRORCODE_MODULE = "72"

  val REQUEST_PARAM_HEADER_USERID = "operUserId"
  val REQUEST_PARAM_BODY_PARENTNODE = "parentNode"
  val REQUEST_PARAM_BODY_RIGHTSIBLINGNODE = "rightSiblingNode"
  val REQUEST_PARAM_BODY_TREETYPE = "treeType"
  val REQUEST_PARAM_BODY_OBJECTTYPE = "objectType"
  val REQUEST_PARAM_BODY_ENTITYID = "entityId"
}
