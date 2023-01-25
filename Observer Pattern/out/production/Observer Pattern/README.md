The Observer design pattern lets several observer objects be notified when a
subject object is changed in some way. Each observer registers with the subject, and when a change occurs, the subject notifies them all. Each of the
observers is notified in parallel (that is, at the same time).

The Observer design pattern should “Define a one-to-many
dependency between objects so that when one object changes state, all its
dependents are notified and updated automatically.”

You should consider the Observer design pattern when, as with event listeners in Java, you have an object that can cause events to occur — events that
you want other objects to know about. Instead of writing everything in one
monolithic class, consider breaking control out into a set of objects that will
be notified when an event occurs.

JAVA's Observer Interface and Observable class:
The Java Observable class is what you create subjects with; more specifically, you extend this class to create subjects.
The Observer interface is what you create observers with.
This interface
has just one method, update, that looks like this: void update(Observable o, Object arg). 

Note that when you use a subject that extends the Observable class, you
have to call the setChanged method before calling notifyObservers. If
you don’t call setChanged first, notifyObservers won’t do anything.



