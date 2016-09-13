import scala.io.StdIn.{readLine, readInt}
import scala.math._

object Q3 {
  def sortInsert(Lst: List[Int], n: Int): List[Int]= Lst match {
    case Nil => n::Lst
    case head::rest if head > n => n::Lst
    case head::rest => head::sortInsert(rest,n)
    }
  def main(args: Array[String]): Unit = {
    var Lt = List(1,4, 23, 44,57,81,103)
    var newList = sortInsert(Lt,15)
    println(newList)
    
  }
}