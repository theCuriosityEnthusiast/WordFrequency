import collection.mutable.HashMap
import scala.io.Source
/**
 * @author test
 */
object Word {
  
  val map = new HashMap[String, Integer]()
  
  def countWord(words: Array[String]) {
    for(word <- words) {
      
        if(map.contains(word)) {
          map.put(word, map(word)+1)
        } else {
           map.put(word, 1)
        }
      }
  }
    
  def main(args: Array[String]) {
 
    val filename = "C://Users//test//workspace//WordFreq//Wordfrequency//filename.txt"
    for (line <- Source.fromFile(filename).getLines()) {
      val words = line.split(" ")
      
      countWord(words)      
    }
    val list = map.toSeq.sortWith(_._2 > _._2)
    list.view(0, 9).foreach(println)
   }
  
}