# Smart PC Configurator and Inventory Management System

## Overview
The **Smart PC Configurator** is a Java-based desktop application developed as an Object Oriented Programming (OOP) semester project. It simplifies building custom PCs by automatically checking hardware compatibility and includes an inventory management system for shop owners.  

This offline application is suitable for small to medium-sized computer hardware businesses.

## Key Features

### PC Builder Module
- Guided PC building workflow
- Budget-based templates (Budget, Mid-Range, High-End)
- Automatic hardware compatibility:
  - CPU socket matching with motherboard
  - RAM type compatibility (DDR4 / DDR5)
  - Motherboard form factor compatibility with casing
- Real-time total price calculation
- User-friendly GUI with dropdown menus

### Inventory Management Module
- Secure admin login
- Real-time stock tracking
- Inventory restocking feature
- Prevents selection of out-of-stock items
- Automatic stock deduction after purchase

### Billing System
- Generates instant bills for configured PCs
- Synchronizes inventory with transactions
- Ensures consistency between selected items and available stock

## Object Oriented Programming Concepts Used
- **Encapsulation:** Private component attributes with getters and setters.
- **Inheritance:** Parent `Item` class extended by CPU, GPU, RAM, Motherboard, etc.
- **Polymorphism:** Method overriding for displaying component-specific details.
- **Composition:** `MainGUI` class contains Builder and Data objects to manage selections and inventory.

## Technologies Used
- Java (JDK)
- Java Swing for GUI
- IntelliJ IDEA
- ArrayLists for in-memory data storage

## Project Structure
- `MainGUI` – Main controller handling UI and navigation
- `Builder` – Manages current PC configuration and billing
- `Data` – Inventory management, restocking, and stock deduction
- `Component Classes` – CPU, GPU, Motherboard, RAM, etc. (POJOs)

## Testing
- Unit Testing: Component attributes & price calculations
- Integration Testing: Inventory synchronization after purchases
- User Acceptance Testing: UI flow and usability

## Limitations
- Inventory data is stored in memory and resets when the application closes
- No database integration in the current version

## Future Improvements
- Database integration (MySQL or SQLite) for persistent storage
- PDF bill generation
- Real-time price updates via APIs
- Web-based version for remote access

## Contributors
- **Raheel Arshad**  
- **Hasham Hassan**

## Course Information
- Course: Object Oriented Programming  
- Instructor: Sir Imran Latif  
- Department: Computer Science  
- University: COMSATS University Islamabad, Lahore Campus

