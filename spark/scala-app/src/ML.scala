
import com.google.common.collect.{HashBiMap, BiMap}
import org.apache.log4j.Logger
import org.apache.mahout.math.cf.SimilarityAnalysis
import org.apache.mahout.math.indexeddataset._
import org.apache.mahout.sparkbindings._
import scala.collection.immutable.HashMap

object ML extends App {

  implicit val mc = mahoutSparkContext(masterUrl = "local",
    appName = "CooccurrenceDriver")

}
