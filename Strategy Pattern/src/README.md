The Big Four OOP fundamentals: 

1. Abstraction - The careful consideration of how to handle the problem. Conceptualizing the problem. 

2. Encapsulation - Wrapping methods and data into an object. When you encapsulate functionality into an object, you 
decide what interface the object exposes to the world. 

3. Polymorphism - The ability to write code that works with different object types. 

4. Inheritance - One class can inherit properties and methods from another class. 

Composition (Has-a) versus Inheritance (Is-a):
Using inheritance automatically sets things up in terms of strict, inclusive
“is-a” relationships, which is more likely to cause maintenance and extensibility issues down the line. 
If you want to plan for change, it usually helps to think as much as you can in terms of “has-a” relationships, 
where your code has a number of objects whose code can be more easily updated as change happens.
When planning for change, consider “has-a” instead of “is-a” relationships,
and put volatile code in the objects your application contains, rather than
inheriting that code.

THE STRATEGY DESIGN PATTERN: 
Avoid spreading out the handling of a changeable task over several generations of classes. 
Separate the parts of your code that will change the most from the rest of your application and try to make them as 
freestanding as possible. 
You should always try to reuse those parts as much as possible. 
With composition, you select and use the objects you want instead of having a rigid, hardcoded way of doing things. 

Creating a family of algorithms lets you choose your strategy by choosing
consciously which algorithm(s) you want to work with. This design pattern is
often used as an alternative to inheritance, where you can end up spreading
out the way you handle one specific task over many class files. 

The Strategy design pattern says that you should extract the volatile parts of
your code and encapsulate them as objects; you can use those objects as you
need them. Now you can customize your code by creating composites of
objects. At runtime, you just use polymorphism to choose the object(s) you
want to work with. 

The GoF book says the Strategy design pattern should: “Define a family of
algorithms, encapsulate each one, and make them interchangeable. Strategy
lets the algorithm vary independently, from clients that use it.”
The Strategy design pattern points out that, sometimes, it’s good to be taskoriented. That’s especially important if you want to maintain volatile code
away from the main code for your app, or if you want to change the algorithm
you use at runtime.

Consider using the Strategy design pattern if you have one of the following
situations:
1. You have volatile code that you can separate out of your application for
easy maintenance.
2. You want to avoid muddling how you handle a task by having to split
implementation code over several inherited classes.
3. You want to change the algorithm you use for a task at runtime.