# theoryJava

## 1. Primitive Data Type Variables



## 2. Tricks

### Converting String to int

```
String s = "5";

int i = Integer.parseInt(s);
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

1. Line 13 : [Prime Numbers](https://github.com/Namenega/theoryJava/blob/20fac53ba049b45cd0c85cc76b32804f12b04bfb/algorithm/myAlgorithm.java#L14)
2. line 51 : [Bubble Sort](https://github.com/Namenega/theoryJava/blob/20fac53ba049b45cd0c85cc76b32804f12b04bfb/algorithm/myAlgorithm.java#L57)
3. line 101 : [Merge Sort](https://github.com/Namenega/theoryJava/blob/20fac53ba049b45cd0c85cc76b32804f12b04bfb/algorithm/myAlgorithm.java#L92)
4. line 173 : [Insertion Sort](https://github.com/Namenega/theoryJava/blob/20fac53ba049b45cd0c85cc76b32804f12b04bfb/algorithm/myAlgorithm.java#L173)
5. line 209 : [Quick Sort](https://github.com/Namenega/theoryJava/blob/20fac53ba049b45cd0c85cc76b32804f12b04bfb/algorithm/myAlgorithm.java#L209)
6. line 270 : [Utils](https://github.com/Namenega/theoryJava/blob/20fac53ba049b45cd0c85cc76b32804f12b04bfb/algorithm/myAlgorithm.java#L270)



