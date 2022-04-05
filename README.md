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



## 2. Tricks

### Converting String to int/float

```
String s = "5";

int i = Integer.parseInt(s);
float j = Integer.parseFloat(s);
```

### Filling ArrayList at declaration

```
ArrayList<String> myArr = new ArrayList<>(Arrays.asList("a", "b", "c"));
```

### Sleep()
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

### Get Input from users
```
import java.util.Scanner

Scanner x = new Scanner(System.in);

String  name = x.nextLine();
int     age = x.nextInt();
...
...
x.close();
```



## 3. Pure theory

### difference between == and .equals()

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

### Array vs ArrayList

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
for Array : myArr[1];
for ArrayList : myArr.get(1);
```
4. Same for the size (Array applies a field while ArrayList applies a method):
```
for Array : myArr.length;
for ArrayList : myArr.size();
```



## 4. Algorithms

1. Line 10 : [Prime Numbers](https://github.com/Namenega/theoryJava/blob/1fe9b42a04cdecc2ea862f620627b59d021edb41/algorithm/myAlgorithm.java#L10)
1. Line 44 : [Fibonaccis](https://github.com/Namenega/theoryJava/blob/4d49dcf17568872cc506345921a399ead5baa4ac/algorithm/myAlgorithm.java#L44)
2. Line 77 : [Bubble Sort](https://github.com/Namenega/theoryJava/blob/4d49dcf17568872cc506345921a399ead5baa4ac/algorithm/myAlgorithm.java#L77)
3. Line 112 : [Merge Sort](https://github.com/Namenega/theoryJava/blob/4d49dcf17568872cc506345921a399ead5baa4ac/algorithm/myAlgorithm.java#L112)
4. Line 193 : [Insertion Sort](https://github.com/Namenega/theoryJava/blob/4d49dcf17568872cc506345921a399ead5baa4ac/algorithm/myAlgorithm.java#L193)
5. Line 229 : [Quick Sort](https://github.com/Namenega/theoryJava/blob/4d49dcf17568872cc506345921a399ead5baa4ac/algorithm/myAlgorithm.java#L229)
6. Line 289 : [Utils](https://github.com/Namenega/theoryJava/blob/4d49dcf17568872cc506345921a399ead5baa4ac/algorithm/myAlgorithm.java#L289)



