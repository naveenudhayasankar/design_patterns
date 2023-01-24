Improving the New operator with the Factory Pattern: 

1. You started off by using the new operator to create OracleConnection
   objects.

2. Then you used the new operator to create SqlServerConnection
   objects, followed by MySqlConnection objects. In other words, you
   were using the new operator to instantiate many, different concrete
   classes, and the code that did so was becoming larger and had to be
   replicated in many places.

3. Then you factored that code out into a method.

4. Because the code was still changing quickly, it turned out to be best to
   encapsulate the code out into a factory object. In that way, you were
   able to separate out the changeable code and leave the core code closed
   for modification.


   All of which is to say — the new operator is fine as far as it goes, but when
   your object creation code changes a lot, it’s time to think about factoring it
   out into factory objects.

In Java, XMLReaderFactory is a final class, not designed for inheritance. A
factory class is a factory class, and that’s it. It’s not designed to be extended.
But the formal GoF Factory design pattern is somewhat different — it offers
you more flexibility because before using GoF factories, you’re supposed to
extend them.

GoF Definition of Factory Pattern:
“Define an interface for creating an object, but let subclasses decide which class to
instantiate. Factory method lets a class defer instantiation to subclasses.

