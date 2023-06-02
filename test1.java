1.Expalin java and javac.
-when we compile source code by using the command javac.
-the compiled java program in .class file is exicuted by using the command javac.

2.Explain JDK,JRE,JVM.
-JDK:fully featured java development kit.It consists of JRE+set of tools.
	set of tools like javaCompiler,javaDoc..tools present in bin folder in Jdk folder.
	JDK is physically exists.
-JRE:Java RunTime Environment.It consists of JVM+set of libraries.
		JRE is physically exists.
		it is must to exicute the program.
-JVM:Java virtual machine.it loads the code,verifies the code and given to run time environment.
			Interpretor is check the code line by line in machine language.
			
3.List the limitation of Array.
-Array is container which is store the similar type of data into a single refernce/variable.

4.Explain Class,Object and signature of the Class.
-Class is template/design for state and behaviors.First word is always in upper case.
-Object instance of class.we do multiple copies of class.it consumes memory.object is
 created by using the keyword new.
-signature 
 Class ClassName{
 }
 
5.Difference between .java file and .class file
-.java file indicates the program is in source form.it is in readable form.
-when we complie the source code by using the command javac when .class file exists.

6.Expalin the method Signature.
-method is block of codes to perform a certain functionality.
	
	AccessSpecifier returntype methodName(){
	
	}
	
	a)AccessSpecifier:to access the method by 4 types.
	public:access within class and out side the class also.
	private:access within class only
	protected:within a class and sub-class and packages.
	default:within class and sub-class.
	b)ReturnType:primitive and non primitive data types we return the values or we use void
		for not return any value.
	c)methodName:is same as class name or different name and first letter is lower case only.
	d)paranthesis:in the paranthesis we declare parameters variables separating by using comma.

7.What is Java.
-Java is high level Object oriented programming language.
		
8.List of java IDE's.
-Intellij IDE,visual studio,Eclipse,Notepad++.

9.What is variable?Expalin its types?
-it is container to store/hold the data.
 4 types of variables
 a)local variable:declare inside the class of a method.
 b)static variable:declare outside the method and inside the class by using keyword static.
 c)instance variable:declare outside the method & inside the class in the time of object creation.
 d)parameter variable:declare inside the paranthesis of method.
 
10.List 15 java keywords
-Class ,String,main,System,void,

11.What is class variable.

12.What is data type and explain its types?
-its registered memory location.
 a)primitive data types:8 inbuilts in java.
  char,byte,short,int,long,float,double,boolean
 b)Non-primitive data types:user defined datatypes like String,class,Array & 
    default values is null.
	
13.what is dot operator?
-to access variable and method by using dot operator.

14.List of java features.
-simple,roboust,object-oriented,platform independent,secure.

15.What is base class of all the classes?
- java.lang

16.method overloading?example.
-method overloading is achive by more than one method as same methodName but different in
  type or length of a parameter.
   
   Class Organisation{
   
   public static void main(String[] arguments){
   System.out.println("Main method started");
   Organisation.xworkz(14,"bharat");
   System.out.println("Main method ended");
   
   public static int xworkz(int students){
   int students=14;
   System.out.println("number of students.."+students);
   return 14;
   }
   
   public static String xworkz(String name){
      System.out.println("name of a student.."+name);
	  return "bharat"
   }
   }
}   