The Chain of Responsibility Pattern:
This pattern is
all about connecting objects in a chain of notification; as a notification travels
down the chain, it’s handled by the first object that is set up to deal with the
particular notification.

The Observer pattern notifies observers in parallel fashion. But the Chain of Responsibility pattern notifies objects in series. 

The first object in the chain that can deal with the notification handles it, and
any following objects are not notified.
The Chain of Responsibility design pattern should
“Avoid coupling the sender of a request to its receiver by giving more than
one object a chance to handle the request. Chain the receiving objects and
pass the request along the chain until an object handles it.”

In other words, if you want to process your notifications using a hierarchical
chain of objects, this is your pattern.



