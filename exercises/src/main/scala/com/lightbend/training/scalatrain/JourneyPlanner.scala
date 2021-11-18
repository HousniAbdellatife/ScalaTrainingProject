package com.lightbend.training.scalatrain

class JourneyPlanner (trains: Set[Train]){

  val stations: Set[Station] =  trains.flatMap(t => t.stations)

  def trainsAt(station: Station): Set[Train] = trains.filter(tr => tr.stations.contains(station));
}
