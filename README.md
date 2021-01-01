Restricted String Shuffling
===

## Overview

When we compare two `String`s, we would normally use what is called the _lexicographic order_. This is the same ordering that a language dictionary would use, except that all the uppercase letters precede all the lowercase letters. "Apple", for example, would appear before "apple" and "Banana". More specifically, "Apple" < "Banana" < "apple".

Suppose we have two `String`s in Java, we can compare them using the `compareTo` method:

```java
String s1 = "Apple";
String s2 = "Banana";
String s3 = "apple";

if (s1.compareTo(s2) < 0) {
    System.out.println(s1 + " is smaller than " + s2);
} else {
    if (s1.compareTo(s2) > 0) {
        System.out.println(s1 + " is greater than " + s2);
    } else {
        System.out.println(s1 + " is equal to " + s2);
    }
}
```

`String` is a datatype, and we are using the `compareTo` operation or method (this method is predefined for `String`). If this operation returns a result less (greater) than 0 then the `String` on which we call the method (in the example above it is the `String` referenced by `s1`) is lower (greater) than the `String` that we pass as an argument (referenced by `s2` in the example). When the return value is 0 then the two `String`s are equal.

If we simply want to check if two `String`s are equal, we should use the `equals()` method (example: `if (s1.equals(s2)) ...`). (We should use the `==` operator only for primitive types unless we want to compare references explicitly.)

You may also find the following operation on `String`s useful: `toCharArray[]` that returns the contents of a `String` as `char[]`, which can be used thus: `char[] myCharArray = myString.toCharArray();`.

You can read all the documentation for the `String` class here: [Class `String`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html) at docs.oracle.com.

## Your Task

Given a `String`, you want to produce the lexicographically largest possible `String` with the following permitted operation: you can swap the characters at position `i` and position `(i+k)` if this swap will result in a lexicographically greater string. If `i+k` is outside the bounds of the `String` then the swap is naturally not feasible. `k` is a parameter that is provided as input to the method of interest. You can apply this operation as many times as you want.

You will have to implement two methods in the provided class `Lexicon`:

1. `makeGreatest(String s, int k)`: This method returns that lexicographically largest `String` that we can obtain from `s` using the allowed operation.

2. `countOperations(String s, int k)`: This method returns the smallest number of swaps that are needed to transform the `String` referenced by `s` to the `String` that `makeGreatest(s, k)` would return.

## Examples

### `awol`

`makeGreatest("awol", 2)` should return `"owal"`.

`countOperations("awol", 2)` should return 1.

There is only one operation: "awol" to "owal".

### `blitz`

`makeGreatest("blitz", 2)` should return `"ztilb"`.

`countOperations("blitz", 2)` should return 4.

One minimal sequence of operations is "blitz" to "blzti" to "btzli" to "ztbli" to "ztilb".

`makeGreatest("blitz", 3)` should return `"tzibl"`.

`countOperations("blitz", 3)` should return 2.

A minimal sequence of operations is "blitz" to "bzitl" to "tzibl".

### `feedspoon`

`makeGreatest("feedspoon", 1)` should return `"spoonfeed"`, which is, incidentally, the longest English word with all the alphabets in lexicographically _non-increasing_ order.

(We do not say _decreasing_ because the two "o"s are equal and so the sequence is non-increasing but not decreasing.)

`countOperations("feedspoon", 1)` should return 20.

### `Dumbledore`

`makeGreatest("Dumbledore", 3)` => "eurdombleD"

`countOperations("Dumbledore", 3)` => 9
