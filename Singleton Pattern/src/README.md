Singleton Pattern:
With the Singleton design pattern, you have only one object of a particular
class throughout your code.

The Singleton design pattern is all about making sure that you can instantiate
only one object of a particular class. If you don’t use a pattern like this one,
the new operator just keeps on creating more and more objects — each a
separate, new object — of the same class.

The Singleton design pattern must: “Ensure a class only has one
instance, and provide a global point of access to it.”

You use the Singleton design pattern when you want to either restrict
resource use (instead of creating numbers of large objects without limit) or
when you have a sensitive object whose data shouldn’t be accessed by multiple instances (such as a registry).

Besides registry objects, you can use the Singleton pattern when you want to
restrict the number of objects created because you want to share the data in
those objects — as when you have a window object or dialog object that displays and modifies data, and you don’t want to create multiple objects, which
might confuse access to that data.

Creating a single object can also be important when you’re multithreading, and you don’t want conflicts in how the data behind that object is accessed.
For example, you may be working with a database object, and if multiple
threads each create their own database objects — all of which work with the
same underlying data store — you could have a serious issue.

Use the Java synchronized keyword, which you can use to restrict access to getInstance to one thread at
a time.

Using the synchronized keyword blocks access to the getInstance method
by any new thread once a thread is executing code inside the method; any new
threads attempting to get in have to wait until the current thread is finished.
Using synchronized is one easy way to enforce single-threaded execution.

The problem you’re trying to fix with the synchronized keyword is that you
don’t want the test that checks whether the single object has been created to
be corrupted by multiple threads. A better way of doing things is to make
sure that test isn’t necessary at all.

You create the object you want only one of when the code
is first loaded into the Java Virtual Machine (the JVM, which is what runs
Java code). Don’t let getInstance create any objects at all — let it return
only that one object that’s already been created. You can create that single
object when the JVM first loads the code.

This is a better solution than synchronizing the getInstance method —
there’s no possibility of creating more than one object, so there’s not going to
be any conflict between threads. You’ve removed all the overhead involved
with synchronizing code just by taking the object-creation code out of the
getInstance method.