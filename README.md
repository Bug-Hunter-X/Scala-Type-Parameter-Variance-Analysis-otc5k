# Scala Type Parameter Comparison Error
This repository demonstrates a common error in Scala when dealing with type parameters: using operators (like `==`) which are not always defined on generic types. This can lead to compilation errors if the type parameter doesn't implement the needed methods (like `equals` for `==`). The `bug.scala` file shows the buggy code, while `bugSolution.scala` provides a corrected version.

## How to Reproduce
1. Clone this repository.
2. Open `bug.scala` in your Scala IDE.
3. Attempt to compile the code; you should encounter a compilation error unless T implements the necessary comparison logic.

## Solution
The solution involves using methods that are guaranteed to work for all types.  The `bugSolution.scala` demonstrates a workaround using the `equals` method.