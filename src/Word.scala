import collection.mutable.HashMap
import scala.io.Source
/**
 * @author test
 */
object Word {
  
  val wordCount = new HashMap[String, Integer]()
  
  def countFreq(words: Array[String]) {
    for(word <- words) {
      
        if(wordCount.contains(word)) {
          wordCount.put(word, wordCount(word)+1)
        } else {
           wordCount.put(word, 1)
        }
      }
  }
    
  def main(args: Array[String]) {
 
    val filename = "C://Users//test//workspace//WordFreq//Wordfrequency//filename.txt"
    for (line <- Source.fromFile(filename).getLines()) {
      val words = line.split(" ")
      
      countFreq(words)      
    }
    val list = wordCount.toSeq.sortWith(_._2 > _._2)
    list.view(0, 9).foreach(println)
   }
  
}
