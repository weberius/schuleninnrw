# Schulen in NRW

Das Projekt Schulen in NRW liest Daten aus dem Datensatz [NRW: Grunddaten der Schulen in NRW](https://open.nrw/de/dataset/msw_001), persistiert sie in einer relationalen Datenbank und stellt sie über REST-Schnittstellen in Form von JSON-Strukturen zur weiteren Verwendung zur Verfügung. Weitere Informationen finden sich auf der Seite [Schulgrunddaten NRW](https://www.schulministerium.nrw.de/docs/bp/Ministerium/Open_MSW/Open_Data/index.html) des [Ministerium für Schule und Weiterbild des Landes Nordrhein Westfalen](https://www.schulministerium.nrw.de).

## Schnittstellen

### /schuleninnrw/service/put

Es handelt sich um eine Schnittstelle, die per PUT angesprochen wird:

    curl -X PUT http://localhost:8080/sagsunskoeln/service/put 

Durch Aufruf dieser Schnittstelle werden Abfragen gegen die XML-Endpoints von https://open.nrw/de/dataset/msw_001 gemacht und die Daten in die Datenbank geschrieben.

## Datenbank

### Rechtsform
```
CREATE TABLE rechtsform (
  id                varchar(16) NOT NULL,
  bezeichnung       varchar(256)
);
```
## License

<a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/"><img alt="Creative Commons Lizenzvertrag" style="border-width:0" src="https://i.creativecommons.org/l/by-sa/4.0/88x31.png" /></a><br />Dieses Werk ist lizenziert unter einer <a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/">Creative Commons Namensnennung - Weitergabe unter gleichen Bedingungen 4.0 International Lizenz</a>.
