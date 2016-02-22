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
  id                integer NOT NULL,
  bezeichnung       varchar(256)
);
```
### Schulbetrieb
```
CREATE TABLE schulbetrieb (
  id                integer NOT NULL,
  bezeichnung       varchar(256)
);
```
### Schulform
```
CREATE TABLE schulform (
  id                integer NOT NULL,
  bezeichnung       varchar(256)
);
```
### Traeger
```
CREATE TABLE traeger (
  id                integer NOT NULL,
  bezeichnung       varchar(1024),
  kurzbezeichnung   varchar(256),
  plz               integer,
  ort               varchar(128),
  strasse           varchar(128),
  telefon           varchar(16),
  fax               varchar(16)
);
```
### Schule
```
CREATE TABLE schule (
  id                      integer NOT NULL,
  schulform               integer,
  bezeichnung             varchar(1024),
  kurzbezeichnung         varchar(256),
  plz                     integer,
  ort                     varchar(128),
  strasse                 varchar(128),
  telefon                 varchar(16),
  fax                     varchar(16),
  email                   varchar(64),
  homepage                varchar(64),
  rechtsform              integer,
  traegernummer           integer,
  gemeindeschluessel      integer,
  schulbetriebsschluessel integer,
  schulbetriebsdatum      timestamp,
  modtime                 timestamp DEFAULT current_timestamp
);
SELECT AddGeometryColumn ('public','schule','geom',4326,'POINT',2);
```
## Configuration

Die Konfiguration wird über die Datei

    /src/main/resources/config.properties

vorgenommen.

## License

<a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/"><img alt="Creative Commons Lizenzvertrag" style="border-width:0" src="https://i.creativecommons.org/l/by-sa/4.0/88x31.png" /></a><br />Dieses Werk ist lizenziert unter einer <a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/">Creative Commons Namensnennung - Weitergabe unter gleichen Bedingungen 4.0 International Lizenz</a>.
