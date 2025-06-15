
# 🤖 Groovy ChatBot

Groovy ChatBot is an intelligent, desktop-based AI chatbot built using **Java** and **Swing**. Designed to simulate conversation, assist with university-related queries, and even play YouTube songs, Groovy is a demonstration of modern Java GUI development and Object-Oriented Programming (OOP) principles.

---

## 📌 Table of Contents

- [✨ Features](#-features)
- [🎯 Motivation](#-motivation)
- [📐 Project Structure](#-project-structure)
- [⚙️ Technologies Used](#️-technologies-used)
- [🚀 Getting Started](#-getting-started)
- [📊 Functional Details](#-functional-details)
- [🧠 OOP Design Overview](#-oop-design-overview)
- [🛡️ License](#️-license)
- [🙋‍♂️ Author](#-author)
- [📈 Future Enhancements](#-future-enhancements)
- [🤝 Contribution Guidelines](#-contribution-guidelines)

---

## ✨ Features

- 💬 Smart response engine based on keyword detection
- 🎵 Auto-generates **YouTube song links** from text queries
- 🏫 Answers queries related to **USTC (University of Science and Technology Chittagong)**:
  - Vice Chancellor: **Prof. Jakir Hossain**
  - CSE Department Cost: **5.5 Lakh BDT**
  - Total Semesters: **8**
- 🧠 Built with core **OOP principles**: encapsulation, inheritance, abstraction
- 🖼️ Option to display **AI-generated images** (future enhancement)
- 👨‍💻 GUI built using Java **Swing** for desktop interaction

---

## 🎯 Motivation

This project was developed as part of a Java OOP coursework initiative to demonstrate how Java GUI applications can:
- Simulate basic AI behavior through logic and conditions
- Incorporate real-world use cases like educational assistance
- Utilize modular object-oriented architecture for scalability

---

## 📐 Project Structure

```bash
GroovyChatBot/
├── Main.java              # Entry point of the application
├── GroovyFrame.java       # GUI logic and user interaction components
├── GroovyBot.java         # Core chatbot logic and response generation
````

---

## ⚙️ Technologies Used

| Tool/Library        | Purpose                            |
| ------------------- | ---------------------------------- |
| Java (JDK 8+)       | Main programming language          |
| Java Swing          | GUI creation and layout management |
| IntelliJ / Eclipse  | Java development and debugging     |
| YouTube search URLs | Simulated audio streaming          |

---

## 🚀 Getting Started

### ✅ Prerequisites

* JDK 8 or above installed
* A Java IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans)

### 🔧 Installation Steps

1. **Clone the repository**

   ```bash
   git clone https://github.com/yourusername/GroovyChatBot.git
   cd GroovyChatBot
   ```

2. **Compile the Java files**

   ```bash
   javac *.java
   ```

3. **Run the program**

   ```bash
   java Main
   ```

---

## 📊 Functional Details

| User Input Example                 | Expected Output                                                                                |
| ---------------------------------- | ---------------------------------------------------------------------------------------------- |
| `Who is the VC of USTC?`           | `The VC of USTC is Prof. Jakir Hossain.`                                                       |
| `What is the CSE department cost?` | `CSE Department costs around 5.5 lakh BDT.`                                                    |
| `How many semesters in USTC CSE?`  | `There are 8 semesters in the USTC CSE program.`                                               |
| `Play Shape of You by Ed Sheeran`  | Returns a YouTube link: `https://www.youtube.com/results?search_query=Shape+of+You+Ed+Sheeran` |
| `Show me an AI image`              | (Planned) Displays an AI-generated image                                                       |

---

## 🧠 OOP Design Overview

| Class         | Responsibility                                                      |
| ------------- | ------------------------------------------------------------------- |
| `Main`        | Launches the application                                            |
| `GroovyFrame` | Handles all UI components (text area, input field, buttons)         |
| `GroovyBot`   | Contains the logic for processing user input and generating replies |

### ✅ Key OOP Concepts

* **Encapsulation**: Each class has a clearly defined responsibility
* **Abstraction**: UI logic separated from chatbot logic
* **Polymorphism**: Easily extensible for future AI enhancements
* **Modularity**: Maintains clean code separation for GUI and backend logic

---

## 🛡️ License

This project is licensed under the [MIT License](LICENSE).
You are free to use, modify, and distribute this code with proper attribution.

---

## 🙋‍♂️ Author

**Abir Kanungo**
🎓 Undergraduate, USTC
🔗 GitHub: https://github.com/Abir344-kanungo
📧 Email: abirkanungo@gmail.com

---

## 📈 Future Enhancements

* ✅ Add YouTube Data API for real-time song fetching
* ✅ Integrate voice command processing using Java Speech API
* ✅ Implement AI-generated image display using external API
* ✅ Add database support for persistent memory and chat logs
* ✅ Support dark/light themes in GUI

---


