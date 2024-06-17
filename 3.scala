/*The volume of a sphere with radius r is 4/3 Pi r3. What is the 
volume of a sphere
with radius 5?*/

object volume
{
    def volumeCalc(radius: Double): Double = {
        4/3 * math.Pi * radius * radius * radius
    }

    def main(args: Array[String]): Unit = {
        val radius = 5
        val vol = volumeCalc(radius)
        println(s"The volume of the sphere : $vol")
    }
}