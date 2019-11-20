
# Code DSM Week 8 Assignment

## Overview
This is a continuation of week 7 assignment, but now we're going to abstract out even more! This code already
runs, so be sure to make SMALL changes and test repeatedly!

Here's an overview of what you'll need to do. Note, this is not in the same order as the requirements below.
1. Create an Employee interface and implement it from Manager and Waitress
1. Create an abstract Restaurant class and extend it using two new classes called Bakery and Deli
1. Let the customer choose which restaurant (bakery or deli) and order similar to the previous assignments

### Requirement 1: Create the Interface and Abstract Class (8 points):
Create an Employee interface with the method header:
* public void printGreeting()

Create an abstract Restaurant class. The constructor should:
* accept the restaurant name as a parameter and store it as an instance variable
* initialize an instance variable for the restaurant's menu; give the menu the restaurant's name for the file

Include the following methods:
* public void prepareTheKitchen(), which is abstract without an implementation
* public void openRestaurant(), which calls prepareTheKitchen() and then prints "<restaurant name> is open for business!"
* public Menu getMenu(), which simply returns the menu created in the constructor

### Requirement 2: Implement the Interface and Extend the Abstract Class (8 points):
* In Manger and Waitress, implement the Employee interface. You'll need to implement the printGreeting method by
  printing "I'm the manager, how can I help?" or "I'll be your waitress today! Can I take your order?" accordingly.
* Create new classes Bakery and Deli. Both must extend the Restaurant class. Each class' constructor must accept
  a restaurant name as a parameter and pass it to the parent's constructor. Each class must implement the
  prepareTheKitchen method; the Bakery will print "Start the oven... Bake the bread..." and the Deli will print
  "Get the bread... Cut the meat...".

### Requirement 3: Use the New Functionality in Main (4 points):
In main you must complete the following; notice that most of the logic already exists:

1. Create an instance of Deli and an instance of Bakery. On both of them call openRestaurant().
1. Ask the user, "Would you like the bakery or deli?".
1. Get the menu by using getMenu() on the restaurant that the user chose.
1. Using the existing logic below, allow the customer to 'add'/'order' from the menu for 'breakfast'/dinner.
1. If the user chose 'order' then call printGreeting() from the Waitress. Otherwise, call printGreeting() from
   the Manager for 'add'.
1. Use the existing logic below to print total or add to the menu.

### Example of First Run and Adding to the Menu
Get the bread... Cut the meat...
<br/>Greg's Deli is open for business!
<br/>Start the oven... Bake the bread...
<br/>Greg's Bakery is open for business!

Would you like the bakery or deli? bakery

Do you want to 'order' or 'add' to the menu? add
<br/>Would you like 'breakfast' or 'dinner'? breakfast
<br/>I'm the manager, how can I help?
<br/>--- Menu ---
<br/>What food would you like to add; enter 'done' when complete? donut
<br/>What's the price? 1
<br/>What food would you like to add; enter 'done' when complete? croissant
<br/>What's the price? 3
<br/>What food would you like to add; enter 'done' when complete? done
<br/>--- Menu ---
<br/>$1.00	donut
<br/>$3.00	croissant

### Example of Another Run and Ordering from the Menu
Get the bread... Cut the meat...
<br/>Greg's Deli is open for business!
<br/>Start the oven... Bake the bread...
<br/>Greg's Bakery is open for business!

Would you like the bakery or deli? bakery

Do you want to 'order' or 'add' to the menu? order
<br/>Would you like 'breakfast' or 'dinner'? breakfast
<br/>I'll be your waitress today! Can I take your order?
<br/>--- Menu ---
<br/>$1.00	donut
<br/>$3.00	croissant
<br/>What food would you like; enter 'done' when complete? donut
<br/>What food would you like; enter 'done' when complete? yogurt
<br/>Sorry, we don't have yogurt
<br/>What food would you like; enter 'done' when complete? croissant
<br/>What food would you like; enter 'done' when complete? done
<br/>Your total is $4.00
