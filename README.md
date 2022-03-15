# java-study-topics

Repository created to add interesting topics for those who are learning the Java language. The contents will range from basic to more advanced.

## Structure

### `model` package

`model` is a package created to store generic classes to be used in code demonstrations of different topics. By now, defined classes are:
- `Employee`;
- `EmployeeLengthComparator`;
- `Manager` (which is a subclass of `Employee`);
- `Size` (which is an Enum Class).

### `genericArrayList` package

In this package, I provide a demonstration of the use of `ArrayList`.
Methods used in the demonstration:

`.add()`, `.size()`, `.get()`, `.set()`, `.remove()`.

A for each loop is also demonstrated.

### `EnumDemonstrations` package

In this package, I provide a demonstration of the use of enumeration classes. Methods used in the demonstration:

`Enum.valueOf()`, `.ordinal()`, `toString()`

### `InterfaceDemonstration` package

In this package, I provide a demonstration of the use of interfaces in Java. The class `WithArraySorting` demonstrates the use of the method `Arrays.sort()` which is an interface that declares a single method: `.compareTo()`. In the demonstration, I created an array of Employee instances and sorted the employees inside the array by increasing order of their salary.

To be able to use the `Arrays.sort()` method with `Employee` instances, it was necessary to implement the interface `Comparable` in the class `Employee`, and define the method `compareTo()` in the class. The method was defined using the salary of the employee to compare instances.

A second demonstration was made using the interface `Comparator`. If we want to sort an array of employees by the length of the name of the employees, for example, we would not be able to use the method `Arrays.sort()` because it would'n be possible to have to different implementations of `.compareTo()`. In this case, we can create a class that implements the interface `Comparator<Employee>`, and then define the method `compare()` as we wish. Then it will be possible to compare the employees using another signature of the method `Arrays.sort()`, which uses as a parameter a `comparator` object (an instance of a class that implements `Comparator`). See the demonstration in class `WithComparatorSorting`. The comparator used in the demonstration is defined as `EmployeeLengthComparator`, in the `model` package.

### `functionalDemonstrations` package

I this package, I provide a demonstration of the use of lambda expressions. By now, there is just one class within this package, `LambdaDemonstration`. This class demonstrates the use of lambda expressions using a comparator of String.

## Some comments on some topics ;)

These are some annotations that I have done during my studies on the topics covered in this learning project.

### `ArrayList`

One essential difference between an Array and an ArrayList is that the ArrayList manages an internal array. This means that it has a size, but when it runs out of space, it creates a new internal array, bigger than the former, and automatically copies all the entries to this new bigger array. In this way, an ArrayList will keep on increasing its capacity to hold entries. You don't have to specify an initial capacity, but if you wish to, it is possible. It does not  mean that the ArrayList wont get bigger than that, but just that at least for these first X entries, it won't be necessary to create a bigger internal array.

To adjust an initial capacity for the ArrayList, you can use the method .ensureCapacity(). For example:
`List<String> names = new ArrayList<>();`

`names.ensureCapacity(50);`

Now the `ArrayList` names has a capacity of holding at least 50 elements before having to reallocate its elements to a new bigger internal array.

### `Enum`

All the enumerated types defined are classes! You may define an enum by a simple call to:

`public enum MyEnum {OPTION_1, OPTION_2, OPTION_3}`

Nevertheless, it will be a class. In this example, the class has three instances and no other instance can be created. Since it won't be possible to create more instances, you shouldn't compare enums with .equals(). You can use the `==` operator in comparisons.

If you wish, you can define a constructor for the class, which should be a private constructor, and which will be invoked only when the instances be created. You can also define methods and fields associated with the enumerated class. In my demonstration, the class `Size` has a field called abbreviation, and methods associated with the class.

### Interfaces

You can describe what a class should do through an interface. For that, you won't need to implement the methods in the interface, just to declare their signature. In that way, an interface is NOT a class. It is a set of requirements for classes that need to conform to the interface. All methods are public, and there is no need of declaring it as public.

There is NO instance fields in interfaces.
To make a class implement an interface, we should:
1. Declare that our class will implement the interface;
2. Define all methods of the interface in the class.

In our demonstration, we make `Employee` implement the interface `Comparable`, which declares a single method: `int compareTo(Object other)`. It will return a negative integer if the Object calling the method compareTo is smaller than the Object other, a positive integer if the opposite is true, or zero if both objects are equals. Check the code in `Employee` of package `model`.
