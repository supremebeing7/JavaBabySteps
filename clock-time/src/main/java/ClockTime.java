public class ClockTime {
  public static void main(String[] args) {}

  public Double angleDistance(String time) {
    String[] timeParts = time.split(":");
    Double hour = Double.parseDouble(timeParts[0]);
    Double minute = Double.parseDouble(timeParts[1]);
    Double hourDegrees = calculateHourDegrees(hour, minute);
    Double minuteDegrees = calculateMinuteDegrees(minute);
    return smallerAngleOfClockFace(hourDegrees, minuteDegrees);
  }
  public Double calculateHourDegrees(Double hour, Double minute) {
    return hour * 30.0 + minute * 0.5;
  }
  public Double calculateMinuteDegrees(Double minute) {
    return minute * 6.0;
  }
  public Double smallerAngleOfClockFace(Double hourDegrees, Double minuteDegrees) {
    Double result = hourDegrees - minuteDegrees;
    if (result < 180.0) {
      return result;
    } else {
      return 360.0 - result;
    }
  }
}