Adapter Pattern: 

The Adapter design pattern lets you
adapt what an object or class has to offer so that another object or class can
make use of it.

The Adapter Pattern lets you adapt what an object or class exposes to what another object or class expects. 

This design pattern is particularly good when you're working with legacy code that can't be changed, while the software 
that interacts with the code does change. 

The Adapter uses composition to store the object its supposed to adapt and when the adapter's methods are called, it translated the calls into something the adpated object can understand and passes the calls on to the adapted object. 

The code that calls the adapter never needs to know that its not dealing with the kind of object it thinks it is, but an adapted object instead. 

If you subclassed the adapted object, the adapter wrapper will be able to handle the subclassed objects with minimal changes. 

Class Adapters: 

While object adapters use composition to store the object they're adapting, class adapters use multiple inheritance to merge the adapted class and the class they're adapting it to.

If rewriting legacy code isn't an option, adapters provide a good option. 