# ⚡ EVehicle Management System

A Java-based Electric Vehicle (EV) Management System that allows users to manage EV registrations, charging stations, usage history, and vehicle service records in an organized way.

## 🚀 Features
- User Registration & Login
- EV Charging Station Booking
- Payment Module
- EV Search Functionality
- Booking and Charge Display
- JSP-based UI for interaction
- JDBC integration with MySQL

## 📂 Project Structure

EVehicle/
├── src/
│ └── main/
│ └── java/
│ └── in/sp/backend/
│ ├── ChargeBook.java
│ ├── DisplayCharge.java
│ ├── EVBookingDetails.java
│ ├── Payment.java
│ ├── Search.java
│ ├── UserLogin.java
│ ├── UserRegister.java
│ └── Vehicle.java
│ └── webapp/
│ ├── META-INF/
│ ├── WEB-INF/
│ ├── DisplayCharge.jsp
│ ├── EVBookingDetails.jsp
│ ├── index.jsp
│ ├── Login.jsp
│ ├── LoginFail.jsp
│ ├── Payment.jsp
│ ├── Profile.jsp
│ ├── Register.jsp
│ ├── Search.jsp
│ ├── SearchChargeStation.jsp
│ ├── success.jsp
│ └── Vehicle.jsp

## 🛠️ Technologies Used
- Java
- JDBC
- JSP & Servlet
- MySQL Database
- Apache Tomcat Server
- Eclipse IDE
---

## ⚙️ How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/vankam-jahnavi/EVehicle.git
Import into Eclipse:
Open Eclipse → File → Import → Existing Projects into Workspace → Select Folder EVehicle

Configure MySQL DB:
Create the required tables (you can create a DB.sql file if you haven’t already)
Update DB credentials in your DAO/connection files

Deploy & Run:
Set up Apache Tomcat
Run the project on server

Prerequisites:
JDK 8 or above
MySQL
Eclipse IDE
Apache Tomcat (v8.0+)
Git

Future Enhancements:
Add Spring MVC or Spring Boot for better structure
RESTful APIs for mobile/web integration
Token-based login with session timeout
Advanced dashboard for admin/users

Vankam Jahnavi
MCA Graduate | Java Full Stack Developer
https://github.com/vankam-jahnavi/

