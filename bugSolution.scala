```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = {
    if (value.equals(x)) {
      return value 
    } else {
      return x
    }
  }
}
```