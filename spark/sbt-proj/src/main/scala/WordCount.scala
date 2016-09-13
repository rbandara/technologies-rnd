import org.apache.spark.{SparkContext, SparkConf}
import org.apache.spark.SparkContext._


object WordCount {

  def main(args: Array[String]) {

    println("hello");

    val conf = new SparkConf().setAppName("WordCount").setMaster("local")
    val sc = new SparkContext(conf)

    println("initialized spark context")

    val logFile = sc.textFile("data/logs/server.log")

    println("loaded the log file ")

    val words = logFile.flatMap(line => tokenize(line))

    println("tokenize the text :" + words)

    //words.saveAsTextFile("data/output/words")

    val wordCounts = words.map(x => (x, 1)).reduceByKey { case (x, y) => x + y }

    wordCounts.saveAsTextFile("data/output")

  }

  private def tokenize(text: String): Array[String] = {
    text.split("\\|").filter(s=>s.startsWith("PATH#/product"))
//    text.split(" ")
  }
}
