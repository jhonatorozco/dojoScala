package model

import play.api.libs.json.{Json, Reads, Writes}

case class Place (id:Int, name:String, description: Option[String])

object Place{
  implicit val placeWrites: Writes[Place] = Json.writes[Place]
  implicit val placeReads: Reads[Place] = Json.reads[Place]
}