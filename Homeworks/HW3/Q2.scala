
object Q2{
 def split(lst:List[Int]):(List[Int],List[Int])={
   var lst1:List[Int] =List()
   var lst2:List[Int] = List()
   var Lst:List[Int] = lst
   while(Lst!=Nil)
   {lst1 = lst1:+Lst.head
    Lst = Lst.tail
    if(!(Lst.isEmpty))
    {lst2= Lst.last::lst2
     Lst= Lst.init
    }
     
   }
   return(lst1,lst2) 
 }
 def main(args: Array[String]): Unit = {
   val l = List(1,2,3,4,5,6,7)
   println(split(l))
 }

}