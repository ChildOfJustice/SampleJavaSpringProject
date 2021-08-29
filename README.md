Framework - it is something even bigger than just libriary
provides system structure and developing patterns

Frameworks:
    NodeJS
    Spring
    Django
    Ruby on Rails
    ASP.NET

Class Car:
    4 Wheel
    1 Transmission
    1 Engine

you need to create these objects in some place of the Class Car


OR:
you need only one instance of class DatabaseConnection
but several other classes want this object to be in their structure
you can add dependency of DatabaseConnection for each class 

Application context manages all of your classes
(life cycle, creation and etc)
and injects dependencies



You can use Spring from Maven - more configuration
create maven project from archetype webapp
it is just the way how maven will organize your project structure

GroupId - unique string (ru.yuldashev.spring)
ArtifactId - the name   (spring-app1)




Inversion of control (IoC)
there is an interface and several classes implemebt it
in some other class we have dependencies on this interface
and at some point we are creating several objects of this interface in code

But we can use Spring configuration file to create needed beans
you need to inject the dependency
IoC - all dependencies are created outside of the entity

constructor(Interface someInterface){
    this.obj = someInterface;
}


when you are creating beans, by default their Scope is Singleton
use this Scope for stateless beans

Scope Prototype will create a new bean each time your are accesing it (getBean())






Spring app and Bean lifecycle:
Spring app starting -> Spring container starting(all beans are here) -> Bean object creation -> dependency injection
-> executing init-method -> the bean is ready
-> executing destroy-method -> Spring app stopping

for init and destroy methods modifiers can be whether public or private
no arguments!

Spring will not execute destroy method for beans with scope Prototype


factory-method - method for the factorization of a bean




Annotation - just some instruction for the compiler

@Component - for class that will be used as bean



@Autowired - to use beans (dependency injection)
@Autowired
private SomeClass someObject   - private field!! Spring is doing it with Java Reflection

@Autowired
public void useBean(SomeClass obj) {...}

If two or more classes (from interface for ex) can be used - there will be ambiguity
to add an Interface:
@Qualifier(<BeanId>)
in Cunstructor use it inside of (), with arguments: 
@Autowired
public Constructor(@Qualifier("id1") SomeClass1 obj1, @Qualifier(...)...



@Value - for importing from configuration file

(With @Component annotation)
@Scope("singleton")
@Scope("prototype")

Annotations for methods:
@PostConstruct - init-method
@PreDesctroy - destroy-method










