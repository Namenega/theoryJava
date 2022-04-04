# theoryJava

## Variables

## Tricks

### Converting String to int

```
String s = "5";

int i = Integer.parseInt(s);
```


## Pure theory

### difference between == and .equals()

> What happens with __==__ ?

```
Java is checking the underlying memory location of the 2 objects.

If you do :
String x = new String("hello");
String y = new String("hello");
They each are a different reference to a memory location so they are not equal.

With Java primitive types (char, int, float, ...), primitive variables are referring to their actual values
and not the memory location where an object is stored.
For all of those we can use ==, for objects we use .equals() (present in all premade objects).

For our own classes, we have to implement .equals() :

public boolean equals(TheObject obj_name) {
    //resolve and return true/false
}
```

