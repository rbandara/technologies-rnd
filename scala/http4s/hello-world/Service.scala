import org.http4s._, org.http4s.dsl._
import scalaz.concurrent.Task

val service = HttpService {
  case _ =>
    Task.delay(Response(Status.Ok))
}