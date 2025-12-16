# FileFilter
    Nur eine Klasse: FileFilter
    gegeben: top10000de.txt - mit mehrfachen Einträgen , unsortiert
    
    Aufgabe: neue Datei top10000de_new.txt -sortiert, keine doppelten Zeilen
    Datei in Datenstruktur einlesen (selber Datenstruktur wählen)
    Sortieren
    Mehrfacheinträge sollen entfernt werden
    neue Datei schreiben
    Zeit messen - evtl. Varianten vergleichen



## Ziel

* sortiert, keine doppelten Zeilen
## Überlegung
* Datenstruktur Einlesen ? - ArrayList/ Set?
* Strategie? 
  * erst sortieren? 
  * eine oder mehrere Datenstrukturen?
  * aus Menge löschen oder nicht aufnehmen, wenn schon vorhanden
## pseudocode Beispiel
 Lese alle Zeilen der Textdatei
    füge Zeile hinzu, wenn noch nicht vorhanden