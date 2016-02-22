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
