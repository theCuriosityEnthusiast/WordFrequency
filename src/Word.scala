import collection.mutable.HashMap
import scala.io.Source
/**
 * @author test
 */
object Word {
  
  var map = new HashMap[String, Integer]()
  
  def ReadFile(file: String) {
      
  }
  
  
  def main(args: Array[String]) {
      //map.foreach(println)
 
    val filename = "C://Users//test//workspace//WordFreq//filename.txt"
    for (line <- Source.fromFile(filename).getLines()) {
      var words = line.split(" ")
      
      for(word <- words) {
        if(map.contains(word)) {
          map.put(word, map(word)+1)
        } else {
           map.put(word, 1)
        }
      }
      
    }
    val list = map.toSeq.sortWith(_._2 < _._2)
    list.foreach(println)
   }
  
}