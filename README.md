# java-study-topics

Repository created to add interesting topics for those who are learning the Java language. The contents will range from basic to more advanced.

## Structure

### `model` package

`model` is a package created to store generic classes to be used in code demonstrations of different topics. By now, defined classes are:
- `Employee`;
- `Size` (which is an Enum Class).

### `genericArrayList` package

In this package, I provide a demonstration of the use of `ArrayList`.
Methods used in the demonstration:

`.add()`, `.size()`, `.get()`, `.set()`, `.remove()`.

A for each loop is also demonstrated.

### `EnumDemonstrations` package

In this package, I provide a demonstration of the use of enumeration classes. Methods used in the demonstration:

`Enum.valueOf()`, `.ordinal()`, `toString()`

A comparison using the `==` operator is also demonstrated.

## Some comments on some topics ;)

These are some annotations that I have done during my studies on the topics covered in this learning project.

### `ArrayList`

One essential difference between an Array and an ArrayList is that the ArrayList manages an internal array. This means that it has a size, but when it runs out of space, it creates a new internal array, bigger than the former, and automatically copies all the entries to this new bigger array. In this way, an ArrayList will keep on increasing its capacity to hold entries. You don't have to specify an initial capacity, but if you wish to, it is possible. It does not  mean that the ArrayList wont get bigger than that, but just that at least for these first X entries, it won't be necessary to create a bigger internal array.

To adjust an initial capacity for the ArrayList, you can use the method .ensureCapacity(). For example:
`List<String> names = new ArrayList<>();`

`names.ensureCapacity(50);`

Now the `ArrayList` names has a capacity of holding at least 50 elements before having to reallocate its elements to a new bigger internal array.

### `EnumDemonstations`
