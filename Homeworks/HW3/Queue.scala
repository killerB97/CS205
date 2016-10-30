class Queue(){
  var x:List[Any]= Nil
  def equals(that: Queue):Boolean= (this.x,that.x) match{
    case (Nil,Nil)=> true
    case (h1::rest1, h2::rest2) => (h1.equals(h2)) && (rest1.equals(rest2))
    case _ => false
  }
  override def hashCode():Int={
    var Coll = 1
    this.x.foreach{
      Coll*=_.hashCode()
    }
   return Coll
  }
  def Enqueue(b:Any):Unit={
    this.x = this.x:+b
  }
  def Dequeue():Unit= this.x match{
    case Nil => Nil
    case head::rest => this.x = rest
    }
  def printQ():Unit={
    println(x)
  }
}

