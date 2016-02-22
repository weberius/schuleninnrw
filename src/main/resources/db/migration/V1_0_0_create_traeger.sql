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
