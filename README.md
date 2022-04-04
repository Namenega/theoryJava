# theoryJava


## 1. Tricks

### Converting String to int

```
String s = "5";

int i = Integer.parseInt(s);
```

### Filling ArrayList at declaration

```
ArrayList<String> myArr = new ArrayList<>(Arrays.asList("a", "b", "c"));
```



## 2. Pure theory

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

1. __Arrays__ have static size while __ArrayList__ has dynamic size.
2. _Data type_ they hold : __Array__ can hold anything (primitive and objects)
but __ArrayList__ can only hold objects (but we can wrap it "Integer" instead
of "int").
3. Both have index starting at 0 but to get an index :
```
for __Array__ : myArr[1];
for __ArrayList__ : myArr.get(1);
```


