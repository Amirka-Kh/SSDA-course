<h2>Changes applied to follow SOLID principles:</h1>

1. Single Responsibility Principle: `<Human>` class left with less responsibilities, as well as other classes in the project.

2. Open/Closed Principle: new languages can be added. New language is created by implementing interface `<Languages>` and implementing `<speak>` method which returns greeting word in that language.

3. Liskov Substitution Principle: new class can be created which will extend `<Human>` class, abstract `<Job>` class and implementing `<Sport>` or `<Religion>` interface. Such new classes will be subtypes of class Human.

4. Interface Segregation Principle: `<Human>` class instances implements only whose methods that they need.

5. Dependency Inversion Principle: `<Human>` class is independent from`<enum Languages>`, now both of them depend on an abstraction `<interface Languages>`
