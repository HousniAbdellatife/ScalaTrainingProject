package com.lightbend.training.scalatrain

import scala.collection.immutable.Seq;

case class Train(number: Int, kind: String, schedule: Seq[(Time, Station)]) {
    require(schedule.size == 2, "Schedule must contains at least two elements")
    val stations: Seq[Station] = schedule.map(_._2)
}