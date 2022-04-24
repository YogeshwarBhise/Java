import java.lang.*;
// 1. 1 class can extend another class
class Base
{}

class Derived extends Base
{}



// 2. 1 class can implment one interface

interface Demo
{}

class Hello implements Demo
{}


//3. 1 class can implement more than 1 interface


interface Hello
{}

interface Demo
{}

class Marvellous implements Hello,Demo

//4. 1 interface can extend another interface

interface Demo
{}

interface Hello extends Demo
{}

class Marvellous implements Hello
{}


//5. 1 class can extend 1 class and implement 1 interface

class Demo
{}

class Hello
{}

class Marvellous extends Demo implements Hello
{}
