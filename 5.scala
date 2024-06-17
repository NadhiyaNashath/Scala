/* I run 2 km at an easy pace (8 min per km), then 3 km at Tempo (7 
min per km) and 2 km at easy pace again to reach home. What is the 
total running time?*/

object time
{
    def main(args: Array[String]): Unit = {
        val easy = 8
        val temp = 7
        val totalDistance = 7
        val totalTime = 2 * easy + 3 * temp + 2 * easy
        println(s"Total time taken : $totalTime")
    }
}