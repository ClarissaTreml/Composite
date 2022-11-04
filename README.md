# Was ist ein Composite Pattern?

* Objekte und Klassen als größere Strukturen zusammenfassen
* Keine Unterscheidung zwischen Objekt und einer Gruppe von Objekten
* “Part-whole hierarchy”
  * Objekt ist ein Teil vom ganzen, welches aus jeweils eigenen Teilen besteht
* Geeignet für Baumähnliche hierarchien

# Nutzen vom Composite Pattern

* Einzelne Objekte und zusammengesetzte Objekte
  * Gleich behandeln
* Objekt Struktur → Typ
  * Leicht verständlich

# Struktur

Client
* Arbeitet mit allen Elementen via Component Interface
  * Client kann alle Komponente gleich behandeln 

Component
  * Beschreibt alle operationen welche in beiden elementen gleich sind 

Container - Composite
* Element mit Sub-Elemente
* Arbeitet mit allen Sub-Elementen via Component Interface 

Leaf
* Ein Element ohne Sub-Elemente

# Stärken und Schwächen

Vorteile
* Liefert alles, um stark verschachtelte Objektstrukturen darzustellen
* Eleganter, leicht verständlicher Programmcode
* Gute Erweiterbarkeit

Nachteile
* Implementierung des Komponenten-Interfaces ist sehr herausfordernd
* Nachträgliche Anpassung der Composite-Eigenschaften sind kompliziert und zu schwer umzusetzen.

# Anwendungsszenarien

* Binäre Baumstruktur

Beispiele
* Dateisysteme
* Dateien
* Software-Menüs
* Grafische Benutzeroberflächen (GUIs)
