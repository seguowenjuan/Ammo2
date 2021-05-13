package com.se.ds.ammo.controllers

import akka.parboiled2.RuleTrace.Fail
import play.api.Logger
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, Action, AnyContent, BaseController, ControllerComponents, Request}
import slick.jdbc.JdbcProfile

import javax.inject.{Inject, Singleton}
import scala.concurrent.{ExecutionContext, Future}

@Singleton
class DeviceParameterController @Inject()(protected val dbConfigProvider: DatabaseConfigProvider, cc: ControllerComponents)
                                         (implicit ec: ExecutionContext) extends AbstractController(cc) with HasDatabaseConfigProvider[JdbcProfile] {
  private val logger: Logger = Logger(this.getClass())

//  def listDeviceParameter(): Action[AnyContent] = Action {
//    implicit request: Request[AnyContent] =>
//      logger.info(
//        "select device parameter's information"
//      )
//      try {
//        val deviceParameter=
//          Ok(Json.toJson(deviceParameter))
//      }catch {
//        case ex: Exception =>
//          logger.error("fail to listSubTree", ex)
//          Fail(ex)
//      }
//  }

}
