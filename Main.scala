object Main {
  def sumZero(n: Int): Array[Int] = {
    val arr = List[Int]()
    if (n % 2 = 0) {
      val n = n //2
      for(i<-Range(-n,n+1)){
arr.appended(i)
      }
    }
    else {
      val n= n//2
      for (i<-Range(-n,n+1)){
        if(i==0){
          return 0;
        }
print(i)
      }
      arr
    }
  }
}
