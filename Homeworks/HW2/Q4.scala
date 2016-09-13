

object Q4 {

  def sortInsert(Lst: List[Int], n: Int): List[Int]= Lst match {
    case Nil => n::Lst
    case head::rest if head > n => n::Lst
    case head::rest => head::sortInsert(rest,n) 
   
  }
  
  
      def insertionSort(xs: List[Int]) : List[Int] = xs match {
        case Nil => Nil
        case head :: tail => sortInsert(insertionSort(tail), head)
      }
        
  
  
  def main(args: Array[String]): Unit = {
    var Lst= List(4,48,23,15,1,3)
    println(insertionSort(Lst))
    
  }
}