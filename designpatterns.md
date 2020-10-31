##Creational Patterns
1. Singleton - Create only one instance of a class in given system/VM/JVM.
This is needed for usage like connection factory, cache where only once instance is needed.
Java API has Runtime instance which is singleton which represents the process and gives interface to OS.

2. Abstract Factory - Set of interfaces are exposed to the client and their implementation is created at the runtime based on parameter. There will be multiple sets of implementation. Connection is abstract factory where preparedstatement, callablestatement etc and their subclasses are instantiated based on parameter.
widget factory for windows and mac e.g. button, scrobars. text box etc can be hierarchy of classes.

3. Factory Method - Interface is exposed to the client and multiple implementations are provided. based on input the concrete class is instantiated at the run time.
Calendar.getinstance(timezone) this is factory method which returns same Calendar interface with different implementation based
on the timezone passed

4. Builder - If the object create is multi-step process or complex process then builder pattern can be used to create it. to create one object it may be invovled Build Part 1, build part 2, build part 3. Here builder.build() method will create those three parts.

5. Object Pool - Objects are created before hand and kept in cache(pool) they are reused after request is served. This is required when object creation is expensive.
Connection pool, thread pool

6. Prototype- Objects are created copying this prototype object. e.g. Object.clone() copies current object and clones it.

## Structural Patterns
1. Adaptor - If new interface needs different signature and existing classes has different then adaptor pattern can be added to adapt to new interface and providing the conversion to existing classes behind the scene. If area method take left x, y and height and width of rectangle but interface has left and right x,y then adaptor can be used to transform the request.
Arrays.asList() returns List<T> adapts to T type

2. Facade - If client needs to make multiple related operations then instead of exposing all the operations, one course grain operation is exposed and internally
it calls multiple fine grain operation to achieve the desired result.

3. Proxy - The operation is called on a class which actually does not have the functionality but internally calls another class instance which has the functionality.
e.g. is RMI call. Stub and Skeleton

4. Bridge - ??? abstraction and implementation is separated so they can vary freely. e.g.

5. Decorator - Gives additional responsibility to object dynamically, Collections.unmodifieable

6. MVC Model-View-Controller - 
7. Composite - let simple and complex object treat equally.
8. Flyweight - 

## Behavioral patterns
1. Command - Based on input a particular instance/behavior is selected and a standard method is called e.g. execute() method with inputs. e.g. Action classes

2. Iterator - Sequential access to the collection

3. Visitor - 

4. Observer - One to Many dependencies are handled by notifying all dependent objects when observed object's state is changed.
e.g. httpsessionattributelistener when attribute in session changes this observer is called.

5. Chain of responsibility - performs operation and then calls next in chain. e.g. Servlet.dofilter

6. State - ?

7. strategy - Comparator is strategy that how we want to compare two objects, order by various criteria.
8. Mediator - Keep object separate from each other and avoid referring directly. ExecutionService mediates threading.
9. Memento - Externalize state of the object so it can restored later. Java serialization
10. Template method - 



