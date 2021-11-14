class Time (val hours: Int, val minutes: Int) {
  // TODO : verify that hours within 0 and 23
  // TODO : verify that minutes within 0 and 59
  val asMinutes: Int = hours * 60 + minutes;

}
