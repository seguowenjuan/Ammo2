package com.se.ds.ammo.controllers

import play.api.Logger
import play.api.mvc._

import javax.inject._

/**
  * 心跳检测接口
  *
  * @author rushidao
  */
@Singleton
class HealthController @Inject() (
    val controllerComponents: ControllerComponents
) extends BaseController {

  private val logger: Logger = Logger(this.getClass())

  /**
    * 心跳检测接口
    *
    * @return useless
    */
  def healthz: Action[AnyContent] =
    Action { implicit request =>
      logger.trace("probe for liveness")
      Ok("abtree")
    }


  /**
   * 就绪检测接口
   *
   * @return useless
   */
  def healthy: Action[AnyContent] =
    Action { implicit request =>
      logger.trace("probe for readiness")
      Ok("abtree")
    }
}
