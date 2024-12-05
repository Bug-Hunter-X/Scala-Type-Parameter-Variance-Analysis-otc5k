```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = {
    if (x == value) {
      return value // This will not compile if T is not == comparable
    } else {
      return x
    }
  }
}
```