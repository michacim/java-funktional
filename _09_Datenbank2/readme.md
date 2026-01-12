# Datenbank2
## Feature
~~* save~~
~~* alle Personen holen~~
~~* löschen~~
* verändern/update
~~* nach bestimmten Personen (name) suchen~~

## Aufgabe

~~* implementiere die beiden Methoden: delete, findByLastname
~~* Teste die Methoden in der Main~~~~
~~* implementiere update und teste in der Main~~


## Testen
# Integration mit MySQL-DB
1. Testuser +Testpasswort
2. Test-DB anlegen
3. für konsistente Testumgebung sorgen (vorbereiten,aufräumen)
4. im Test eigene Connection aufbauen 
5. gute Testdaten überlegen

## Aufgabe 
* schreibe Unit-Tests für die übrigen Methoden:
    *     Person findById(int id);
    *     boolean delete(int id);
    *     List<Person> findByLastname(String lastname);
    *     boolean update(Person person);
* jede test-Methode kann mehrere Dinge/Aspekte Testen
* jede Methode kann auch mehrere Test-Methoden besitzen
* wenn möglich, auch Negativ-Tests