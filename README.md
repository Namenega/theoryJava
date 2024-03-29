# theoryJava

## 1. Primitive Data Type Variables

1. __byte__ :
```
size    : 8 bits / 1 byte
range   : [-128:127]
hold    : whole number (or character)
example : 12
```
2. __short__ :
```
size    : 16 bits / 2 bytes
range   : [-32768:32767]
hold    : whole number
example : 1200
```
3. __int__ :
```
size    : 32 bits / 4 bytes
range   : [-2147483648:2147483647]
hold    : whole number
example : 1200000
```
4. __long__ :
```
size    : 64 bits / 8 bytes
range   : [-9223372036854775808:9223372036854775807]
hold    : whole number
example : 12000000000
```
5. __float__ :
```
size    : 32 bits / 4 bytes
range   : [6 decimal digits]
hold    : decimal number
example : 12.64f
```
6. __double__ :
```
size    : 64 bits / 8 bytes
range   : [15 decimal digits]
hold    : decimal number
example : 12.64
```
7. __boolean__ :
```
size    : 1 bit
range   : /
hold    : true or false
example : true, false, (x > 20)
```
8. __char__ :
```
size    : 16 bits / 2 bytes
range   : /
hold    : single character / ASCII value
example : 'a', '4', ' '
```



## 2. Concepts

### 2.1 Polymorphism

Subclasses have access to protected and public methods of the parent class.
Polymorphism makes that the subclasses can ***override*** a parent's method :
```
Parent class "Animal":

public void noise() {
    System.out.println("NOISE NOISE");
}

Sub class "Dog":

dog.noise() before override : "NOISE NOISE"

public void noise() {
    System.out.println("OUAF OUAF");
}

dog.noise() after override : "OUAF OUAF"
```

Another part of the concept is that we can ***overload*** methods :
```
public void noise() {...};
public void noise(int numberOfTimes) {...};
public void noise(String typeOfFood) {...};
public void noise(int numberOfTime, String typeOfFood) {...};
```
We can create/overload the same function (same name) many times if parameters or
the type of the function change.

### 2.2 Inner Class (Nested class)
```
public class MyClass {
	...
	...
	public class MyInnerClass {
		...
	}
	...
	...
}
```
***MyInnerClass*** is now a member of MyClass. It can have the variables and method
as other classes.

To create an object from the inner class :
```
MyClass x = new MyClass();
x.MyInnerClass y = x.new MyInnerClass();
```
It makes us create a MyClass object then a MyInnerClass object. What if we don't want
to create 2 objects :
```
public class MyClass {
	...
	...
	public static class MyInnerClass {
		...
	}
	...
	...
}
```
The ***static*** keyword allows us to do :
```
MyClass.MyInnerClass y = new MyClass.MyInnerClass();
```



## 3. Object vs Object

### 3.1 Array vs ArrayList
Ex:
```
import java.util.ArrayList;

String[] myArr = new String[];
ArrayList<String> myArrList = new ArrayList<>();
```

1. __Arrays__ have static size while __ArrayList__ has dynamic size. It means that we can't add/remove values after declaration in an Array, but in ArrayList yes.
2. _Data type_ they hold : __Array__ can hold anything (primitive and objects)
but __ArrayList__ can only hold objects (but we can wrap it "Integer" instead
of "int").
3. Both have index starting at 0 but to get an index:
```
Array : myArr[1];
ArrayList : myArr.get(1);
```
4. Same for the size (Array applies a field while ArrayList applies a method):
```
Array : myArr.length;
ArrayList : myArr.size();
```

### 3.2 LinkedList vs ArrayList
Ex:
```
import java.util.ArrayList;
import java.util.LinkedList;

LinkedList<String>	myLinkList = new LinkedList<>();
ArrayList<String>	myArrayList = new ArrayList<>();
```
1. __ArrayList__ has a reference on every index in the array, making it faster than __LinkedList__
to go to a particular index. LL begins at index[0] and increments to the index while
AL goes straight to the reference!
2. To add a value in the middle of the list, LL does it better by changing the _next_
and _previous_ pointer, while AL needs to recreate the whole array.



## 4. Tricks

### 4.1 Converting String to int/float

```
String s = "5";

int i = Integer.parseInt(s);
float j = Integer.parseFloat(s);
```

### 4.2 Filling ArrayList at declaration

```
ArrayList<String> myArr = new ArrayList<>(Arrays.asList("a", "b", "c"));
```

### 4.3 Sleep()
```
try
{
    Thread.sleep(1000); // Sleep for one second
}
catch (InterruptedException e)
{
    Thread.currentThread().interrupt();
}
```

### 4.4 Get Input from users
```
import java.util.Scanner

Scanner x = new Scanner(System.in);

String  name = x.nextLine();
int     age = x.nextInt();
...
...
x.close();
```



## 5. Pure theory

### 5.1 Difference between == and .equals()

> What happens with __==__ ?

Java is checking the underlying memory location of the 2 objects.

If you do :
```
String x = new String("hello");
String y = new String("hello");
```
They each are a different reference to a memory location so they are not equal.

With Java primitive types (char, int, float, ...), primitive variables are
referring to their actual values and not the memory location where an object is
stored.
For all of those we can use ==, for objects we use .equals() (present in all
premade objects).

For our own classes, we have to implement .equals() :

```
public boolean equals(TheObject obj_name) {
    //resolve and return true/false
}
```

### 5.2 File Input/Output
```
import java.io.BufferWriter;
import java.io.FileWriter;

try {
    //Write to a File
	BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
	writer.write("Hello from outside!");
	writer.close();

    //Read from a file
	BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
	reader.readLine();
	reader.close();
} catch (IOException e) {
	e.printStackTrace();
}
```

1. ***BufferedWriter*** is a subclass of Writer. It is used to simplify text writing in
a character output stream.
2. ***FileWriter*** is a subclass of OutputStreamWriter. It is used to write text files.

3. ***BufferedReader*** is a subclass of Reader. It is used to simplify text reading from
a character input stream.
4. ***FileReader*** is a subclass of InputStreamReader. It is used to read text files.

### 5.3 Final keyword

1. ***final*** used on a class prevents other class from being subclass of this one.
```
public final class MyClass {}
```
2. ***final*** used on a method in a parent class results in that method is not
overridable in its subclasses. It will be this method for every subclasses.
```
public final void myMethod() {}
```
3. ***final*** used on a variable results in the fact that this variable can only be
assigned once.
```
final int number = 10;
```



## 6. Algorithms

1. Line 10 : [Prime Numbers](https://github.com/Namenega/theoryJava/blob/f3ba3a5a5ca331374e9c7448fea4f90329f93ded/algorithm/myAlgorithm.java#L10)
1. Line 44 : [Fibonacci](https://github.com/Namenega/theoryJava/blob/4d49dcf17568872cc506345921a399ead5baa4ac/algorithm/myAlgorithm.java#L44)
2. Line 77 : [Bubble Sort](https://github.com/Namenega/theoryJava/blob/4d49dcf17568872cc506345921a399ead5baa4ac/algorithm/myAlgorithm.java#L77)
3. Line 112 : [Merge Sort](https://github.com/Namenega/theoryJava/blob/4d49dcf17568872cc506345921a399ead5baa4ac/algorithm/myAlgorithm.java#L112)
4. Line 193 : [Insertion Sort](https://github.com/Namenega/theoryJava/blob/4d49dcf17568872cc506345921a399ead5baa4ac/algorithm/myAlgorithm.java#L193)
5. Line 229 : [Quick Sort](https://github.com/Namenega/theoryJava/blob/4d49dcf17568872cc506345921a399ead5baa4ac/algorithm/myAlgorithm.java#L229)
6. Line 289 : [Utils](https://github.com/Namenega/theoryJava/blob/4d49dcf17568872cc506345921a399ead5baa4ac/algorithm/myAlgorithm.java#L289)



