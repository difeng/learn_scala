package chapter5

/**
  * Created by duyongfeng@creditzx.com on 2017/6/11.
  */
class Counter {

  private  var value = BigInt(0)

  def increment() { value += 1}

  def current() = value

}
