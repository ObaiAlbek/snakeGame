# 🐍 SnakeGame

Ein klassisches **Snake-Spiel** in **Java**, entwickelt mit **Swing** und **AWT**.  
Das Projekt demonstriert den Einsatz von **Grafikprogrammierung**, **Game Loops**, **Collision Detection** und **Benutzereingaben über die Tastatur**.

---

## 🗂️ Projektstruktur

snakeGame/
├── Essen.java # Repräsentiert das Futter für die Schlange
├── GameContainer.java # Hauptklasse zur Initialisierung des Spiels
├── GameFenster.java # Erstellt das Spielfenster (JFrame)
├── GamePanel.java # Zeichenfläche und Spiellogik
├── Snake.java # Logik und Darstellung der Schlange
├── Test.java # Optionale Testklasse
└── README.md # Projektdokumentation

yaml
Code kopieren

---

## 🎮 Spielbeschreibung

Das Ziel des Spiels ist es, **die Schlange zu steuern**, um das **Essen (Futter)** aufzusammeln, wodurch sie **wächst**.  
Wenn die Schlange mit der **Wand** oder **sich selbst** kollidiert, ist das Spiel vorbei.

---

## ⚙️ Features

✅ Bewegung der Schlange über Pfeiltasten  
✅ Wachstumsmechanismus bei jedem Futter  
✅ Kollisionserkennung mit Wand und Körper  
✅ Punktestand-Anzeige  
✅ Dynamische Spielfläche  
✅ Sauber strukturierter Code (OOP + MVC-ähnlicher Aufbau)

---

## 🧠 Lernziele

- Objektorientierte Programmierung in Java  
- Grafik und Animation mit `javax.swing` und `java.awt`  
- Timer-basierter Game Loop (`javax.swing.Timer`)  
- Benutzerinteraktion per `KeyListener`  
- Grundlegende Spielelogik und Zustandshandhabung  

---

## ▶️ Ausführung

Kompiliere und starte das Spiel über die Konsole:

```bash
javac *.java
java GameContainer
Oder starte das Projekt direkt in einer IDE (z. B. IntelliJ, Eclipse oder VS Code).

🕹️ Steuerung
Taste	Aktion
⬆️ Pfeil hoch	Bewegung nach oben
⬇️ Pfeil runter	Bewegung nach unten
⬅️ Pfeil links	Bewegung nach links
➡️ Pfeil rechts	Bewegung nach rechts

📸 Beispielansicht
diff
Code kopieren
+-----------------------+
| 🐍🐍🐍                🍎 |
|                      |
|                      |
+-----------------------+
Score: 8
💡 Erweiterungsideen
🎨 Menü mit Schwierigkeitsgraden

💾 Highscore-System (z. B. über Datei speichern)

🔊 Soundeffekte bei Bewegung und Kollision

🧱 Hindernisse auf dem Spielfeld

🌈 Farbthemen und Animationen

🧑‍💻 Autor
Obai Albek
Student der Informatik – TH Mannheim
GitHub: ObaiAlbek

📄 Lizenz
