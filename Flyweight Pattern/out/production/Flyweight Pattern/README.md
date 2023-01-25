Flyweight Pattern:
With the Flyweight pattern, you might also have
only one object of a particular class — but it looks to your code as though it’s
many different objects. 

The Flyweight Pattern, also
is all about restricting object creation, but this time it gives the rest of your
code the feeling of multiple objects.

This pattern is called flyweight because instead of having to work with many
massive, individual objects, you whittle them down to a smaller set of more
generic objects, called flyweights, that can be configured at runtime to look
like the more plentiful, massive objects. Each massive object consumes
system resources; by extracting what’s generic from those massive objects
and relying on runtime configuration to mimic those massive objects, you
save those resources.

You take all the specialized contents out of the massive objects to create flyweight objects. When you do that, you end up with more-generic objects, and
you can reduce the number you need — possibly down to just one — which
can be configured as needed at runtime to mimic the larger set of more massive objects.

The Flyweight pattern must, “Use sharing to support large
numbers of fine-grained objects efficiently. A flyweight is
a shared object that can be used in multiple contexts simultaneously. The flyweight acts as an independent object in each context — it’s indistinguishable
from an instance of the object that’s not shared.”

Say you start with a large set of massive objects in your
code. You remove from those objects all the specialized, instance-specific
contents that you can to end up with a shareable object, a flyweight, that acts
like a template. That template object can then be configured at runtime by
passing it all the specialized contents it needs to appear like one of the more
massive objects. 

Whenever you’ve got a large number of massive objects that are putting a
strain on your application, the Flyweight pattern should pop into your mind.
If you can extract the specialized content from each such object that makes it
unique and create a flyweight or set of flyweights that can act as customizable templates, this can be the way to go.

The Flyweight pattern is all about controlling object creation, but you might
have noticed that it suffers from the same problem that the Singleton code — if you leave object creation up to the new operator, you might end up with multiple objects when you wanted only a single
one, especially if you’ve got a multithreaded program.

If your code uses multiple threads, you can avoid creating too many flyweight
objects by taking the object creation process away from the new operator in
the same way you did with singletons. You can create the flyweight object
when the class is first loaded, make the constructor private, and allow object
creation only through a getInstance method.