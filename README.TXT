------------------------------------------------------------------------
This is the project README file. 
------------------------------------------------------------------------

PROJECT TITLE: Shapes

PURPOSE OF PROJECT: Utilize inheritance, abstract classes, and interfaces.
The program takes the width, length, and radius of the shapes, and computes the
area, perimeter, circumference, and finds the largest area between the 2D and 3D
shapes. It also returns a count of every shape. 

VERSION or DATE: October 23, 2017

HOW TO START THIS PROJECT: Open files in BlueJ. Run the main method.

AUTHORS: Kyle M. Shive

USER INSTRUCTIONS:
Here the main method focuses on the use of an abstract class, Shape and an 
interface Shape3D. They correspond with the Rectangle and Circle objects and 
utilize inheritance and polymorphism. 
The program reads an input file, shapesIn.txt, adds them to an ArrayList object
and then writes them out to the output file shapesOut.txt

Below is the UML

------------------------------------------------------------------------------------------------
                                     <<abstract>>
                                        Shape
------------------------------------------------------------------------------------------------
#type: String
------------------------------------------------------------------------------------------------
+Shape(type: String)

+getType(): String <<final>>
+setType(type: String): void <<final>>

+area(): double <<abstract>>

+toString(): String <<override>>
------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------
                                           Rectangle
------------------------------------------------------------------------------------------------
#width: double
#length: double
------------------------------------------------------------------------------------------------
+Rectangle(width: double, length: double)

+getWidth(): double <<final>>
+getLength(): double <<final>>
+setWidth(width: double): void <<final>>
+setLength(length: double): void <<final>>

+area(): double <<override>>
+perimeter(): double

+toString(): String <<override>>
------------------------------------------------------------------------------------------------

------------------------------------------------------------------------------------------------
                                           Circle
------------------------------------------------------------------------------------------------
#radius: double
------------------------------------------------------------------------------------------------
+Circle(radius: double)

+getRadius(): double <<final>>
+setRadius(radius: double): void <<final>>

+area(): double <<override>>
+circumference(): double

+toString(): String <<override>>
------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------
                                           Cube
------------------------------------------------------------------------------------------------
#height: double
------------------------------------------------------------------------------------------------
+Cube(width: double, length: double, height: double)

+getHeight(): double <<final>>
+setHeight(height: double): void <<final>>

+volume(): double <<override>>

+toString(): String <<override>>
------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------
                                           Sphere
------------------------------------------------------------------------------------------------

------------------------------------------------------------------------------------------------
+Sphere(radius: double)

+area(): double <<override>>
+volume(): double <<override>>

+toString(): String <<override>>
------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------
                                           <<interface>>
                                             Shape3D
------------------------------------------------------------------------------------------------

------------------------------------------------------------------------------------------------
+volume(): double <<abstract>>
------------------------------------------------------------------------------------------------
