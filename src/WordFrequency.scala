import collection.mutable.HashMap
import scala.io.Source
/**
 * @author test
 */
object Word {
  
  val wordCount = new HashMap[String, Integer]()
  
  def countFreq(words: Array[String]) {
    for(word <- words) {
        val lowerCaseWord = word.toLowerCase()
        if(wordCount.contains(lowerCaseWord)) {
          wordCount.put(lowerCaseWord, wordCount(lowerCaseWord)+1)
        } else {
           wordCount.put(lowerCaseWord, 1)
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