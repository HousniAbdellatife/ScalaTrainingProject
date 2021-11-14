package com.lightbend.training.scalatrain

class Time (val hours: Int = 0, val minutes: Int = 0) {
  require(hours <= 23 && hours >= 0, "invalid hours")
  require(minutes <= 59 && minutes >= 0, "invalid minutes")
  val asMinutes: Int = hours * 60 + minutes
  def minus(that: Time): Int = asMinutes - that.asMinutes
  def -(that: Time): Int = minus(that)
}

object Time {
  def fromMinutes(minutes: Int):Time = {
    val hours = minutes / 60
    val min = minutes % 60
    new Time(hours, min)
  }
}