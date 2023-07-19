# DeliveryListManager

> A Java project to manage a local delivery service's stop scheduler using a doubly linked-list data structure.

## Table of Contents

- [Description](#description)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Class Details](#class-details)
  - [Delivery](#Delivery)
  - [DeliveryListNode](#DeliveryListNode)
  - [DeliveryList](#DeliveryList)
  - [DeliveryDriver](#DeliveryDriver)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)
  
## Description

The DeliveryListManager project aims to assist Billy Business in managing his local delivery service. The project allows Billy to arrange delivery stops optimally by implementing a stop scheduler using a linked list. With this scheduler, Billy can add delivery jobs, remove them, reorder them, mark an order as completed, and even switch between his delivery list and his friend Money Mike's list.

## Prerequisites

To run the DeliveryListManager project, ensure you have the following installed on your computer:

- Java Development Kit (JDK) 1.8 or later
- Git (optional, for cloning the repository)

## Installation

1. Clone the DeliveryListManager repository to your local machine (if you haven't already).

```bash
$ git clone https://github.com/yourusername/DeliveryListManager.git
$ cd DeliveryListManager
```
## Usage
To compile 
```bash
$ javac Main.java
```
Run the DeliveryListManager application from the command line.
```bash
$ java Main
```
Follow the on-screen prompts to use the menu-driven interface to manage delivery stops and orders.

## Required Classes

### Delivery
A class representing a delivery with source, destination, and instruction details. It provides getter and setter methods for all member variables and a toString() method to display the delivery information.

### DeliveryListNode
A class wrapping a Delivery object to enable insertion into a doubly linked-list. The class contains two references, next and prev, serving as links to the previous and next DeliveryListNodes in the list. It provides getter and setter methods for all member variables.

### DeliveryList
A class implementing a double linked-list data structure to maintain a list of Deliveries. The list is chained between a head and a tail reference. A cursor is provided to traverse the list and perform operations like insertion, deletion, and manipulation of the Deliveries.

### DeliveryDriver
A class creating two instances of the DeliveryList class to provide an interface for managing delivery stops and orders. The main method runs a menu-driven application that interacts with the user to perform various operations.

## Contributing
Contributions to the DeliveryListManager project are welcome! If you encounter any issues or have suggestions for improvement, feel free to open an issue or submit a pull request. Please read CONTRIBUTING.md for more details.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Contact
If you have any questions or feedback, you can contact the project maintainer at:

Email: pmtaday@gmail.com
GitHub: @ptaday
