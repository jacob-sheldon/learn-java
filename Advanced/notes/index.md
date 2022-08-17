# Java Advanced
## Collections
- A collections framework is a unified architecture for representing and manipulating collections. 
- All collections frameworks contains: Interfaces, Classes, Algorithms.
- Interfaces - These are abstract datatype that represent collections.
  - Collection Interface, List Interface, Set, SortedSet, Map, Map.Entry, SortedMap, Enumeration.
- Classes - implement Collection interfaces, many of them are abstract classes, others are concrete classes.
  - AbstractCollection
  - AbstractList, AbstractSequentialList, LinkedList, ArrayList
  - AbstractSet, HashSet, LinkedHashSet, TreeSet
  - AbstractMap, HashMap, TreeMap, WeakHashMap, LinkedHashMap, IdentityHashMap
- Algorithms - can apply to collections and maps, defined as static methods within the Collection class.
- `Iterator` - is an object that implements either the `Iterator` or the `ListIterator` interface.
  - `Iterator` enables you to cycle through a collection, obtaining or removing elements.
  - `ListIterator` extends Iterator to allow bidirectional traversal of a list and the modification of elements.
- `Comparator` - defines precisely what sorted order means
  - This _interface_ lets us sort a given collection any number of different ways.
  - can be used to sort any instances of any class

## Generics

### Generic Methods
- You can write a single generic methods declaration that can be called with arguments of different types.
- Boundary Parameters

### Generic Classes
- is classes followed by a type parameter section.

## Serialization
- an object can be represented as a sequence of bytes that includes the object's data as well as information about the object's
  data as well as information about the object's type and the types of data stored in the object.
- After a serialized object has been written into a file, it can be read from the file and deserialized to recreate the object in memory.
- The entire process is JVM independent, meaning an object can be serialized on one platform and deserialized on an entirely different platform.
- Serialization: `ObjectOutputStream`'s `writeObject(Object x)` method
- Deserialization: `ObjectInputStream`'s `readObject()` method
- `transient` keyword - a variable modifier used in serialization. 
  - when JVM comes across an instance variable of a class modified by `transient`, it ignores original value of the variable and save default value of that variable data type.

## Networking
- J2SE API java.net package, low level, TCP/UDP
### Socket Programming
- Sockets provide the communication mechanism between two computers using TCP.
- The `java.net.Socket` class represents a socket, and the `java.net.ServerSocket` class provides a mechanism for the 
  server program to listen for clients and establish connections with them.
- Firstly, ServerSocket calls `accept()` method, when client try to connect to server specified port, the connection established.
- After connection established, client/server can send/receive data for/from opposite.

### URL Processing
- URL: `protocol://host:port/path?query#ref`
- classes: `URL` `URLConnection`

## Multithreading
- Multithreading enables you to write in a way where multiple tasks can proceed concurrently in the same program.
- Create a thread
  - Implementing a Runnable Interface
  - Extending a Thread Class
- **Synchronization**: This is implemented using a concept called monitors. Each object in Java is associated with a monitor, which a thread can lock or unlock. Only one thread at a time may hold a lock on a monitor.
```java
synchronized(objectidentifier) {
    // Access shared variables and other shared resources
}
```
- **Interthread Communication**: 
  - `wait()` `notify()` `notifyAll()`
  - All three methods can be called only from within a **synchronized** context.
- **Deadlock** - occurs when multiple thread need the same locks but obtain them in different order.
  - Attention to the locks order
- Thread APIs - `suspend()` `stop()` `resume()` `wait()` `notify()`
