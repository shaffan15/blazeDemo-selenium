# BlazeDemo Selenium Automation Framework

This project automates the end-to-end flight booking process on [https://blazedemo.com](https://blazedemo.com) using Selenium WebDriver.  
It follows the **Page Object Model (POM)** design pattern with reusable **helper classes**, written in **Java 11**, using **JUnit 4** and **Maven** for build and execution.

---

## 🧩 Tech Stack

- **Language**: Java 11  
- **Build Tool**: Maven  
- **Test Framework**: JUnit 4  
- **Browser Driver**: ChromeDriver (via WebDriverManager)  
- **Design Pattern**: Page Object Model (POM)

---

## 📁 Project Structure

```
src/
├── test/
│   ├── java/
│   │   ├── com/
│   │   │   ├── blazeDemo/
│   │   │   │       ├── pages/          # Page classes (locators + actions)
│   │   │   │       ├── helper/         # Reusable action helpers (click, type, wait, etc.)
│   │   │   │       └── tests/          # JUnit test class for full flow
```

---

## ✅ Automated Flow

1. Launch BlazeDemo home page  
2. Select departure and destination cities  
3. Click "Find Flights"  
4. Identify the cheapest flight from the table and click "Choose Flight"  
5. Fill in the purchase form  
6. Submit the form and assert the confirmation message

---

## ▶️ How to Run

```bash
# Run tests via Maven
mvn clean test
```

> Requires Chrome and Java 11 installed.

---

---

## 🔐 License

This project is open for learning and practice purposes.
