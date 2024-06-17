/*The temperature is 35C; convert this temperature into Fahrenheit.
ºF =ºC * 1.8000 + 32.00
*/

object tempConvert
{
    def convert(temp: Double): Double = {
        temp * 1.8 + 32
    }

    def main(args: Array[String]): Unit = {
        val temp = 35
        val fahr = convert(temp)
        println(s"Temperature in Fahrenheit : $fahr")
    }
}