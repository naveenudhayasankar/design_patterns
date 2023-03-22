Facade Pattern:

The Facade pattern gives you a wrapper that makes the original code easier to deal with. 

If an object or a class interface is too hard to work with, the Facade pattern gives you a front end to that interface to make it easier. 

The Facade pattern should provide a unified interface to a set of interfaces in a system. Facade defines a higher level interface that makes the subsystem easier to use. 

The Facade design pattern is usually used when you can't rewrite the code you wish were simpler. Although using a Facade can fix the problem, it adds another layer and if the underlying code changes, you have to change the Facade pattern as well. 

Principle of Least Knowledge / Law of Demeter / Effective Encapsulation: 
    Separate classes of objects don't need to know too much about each other. Lock away the details inside each class or object and make the coupling between the entities as loose as possible. 

If one object needs to know too much about another to make the coupling loose, a Facade pattern can help. 

