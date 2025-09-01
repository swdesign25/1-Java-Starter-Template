# Java starter example code

This is Java starter project example with Maven.

## Running the code

The "main" main() function is in Main.java.

## CLI - Building and running the code

Adapt the lines below to meet the naming in your project:

````
git clone ...URL...
cd ...THE-DIR...
mvn clean
mvn install # or package
echo "Run the main() in App.java (defined in the manifest file of the jar)
java -jar target/...XXX....jar 
echo "Run the main() in some other file
java -cp target/...XXX... fi.sade25.javastarter/Main
````

Example of running the code:

````
$ java -cp target/java-starter-template-1.0-SNAPSHOT.jar fi.sade25.javastarter.Main
-----------------
Hello
-----------------
Moi vaan
-------------
Konnichiwa
````

