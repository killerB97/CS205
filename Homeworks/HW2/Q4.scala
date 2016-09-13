

object Q4 {
    def sortInsert(e : Integer, lst : List[Int]) : List[Int] = {
      def sortInsert1(xs: List[Int]) : List[Int] = xs match {
        case Nil => List(e)
        case x :: xs if e < x => e :: x :: xs        
        case x :: xs => x :: sortInsert1(xs)               
      }   
      return sortInsert1(lst)
  }
  
  def insertionSort(originalList: List[Int]) : List[Int] = {
      def insertionSort1(xs: List[Int], lst: List[Int]) : List[Int] = xs match {
        case Nil => lst
        case x :: xs => insertionSort1(xs, sortInsert(x, lst))
      }
      insertionSort1(originalList, List())
  }
  
  def main(args: Array[String]): Unit = {
    var Lst= List(4,1,48,2,23,15)
    println(insertionSort(Lst))
  }
}