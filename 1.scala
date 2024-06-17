object diskArea
{
    def areaOfDisk(r: Double): Double = {
    math.Pi * r * r
    }

    def main(args: Array[String]): Unit = {
    val r = 5
    val area = areaOfDisk(r)
    println(s"The area of the disk : $area")
    }
}
