import scala.io.StdIn.{readLine, readInt}
import scala.math._

object Q1 {

  def Factorial(n: Int ): BigInt = n match {
    case 0 => 1
    case n => n*Factorial(n-1)
  }
    def main(args: Array[String]): Unit = {
      println("Enter the number for factorial:")
      var num = readInt
      var b = Factorial(num)
      println(b)
     
  }
 
}