-- Postgres extension for handling diacritics and other characters
CREATE EXTENSION unaccent;

create schema blog;

CREATE TABLE blog.diacritic_blog(
  id bigserial NOT NULL,
  name varchar(255) NOT NULL,
  CONSTRAINT pk_diacritic_id PRIMARY KEY (id)
);

INSERT INTO blog.diacritic_blog(name) values ('aabbsser3ssa35ds');
INSERT INTO blog.diacritic_blog(name) values ('Tĥïŝ ĩš â fůňķŷ Šťŕĭńġ');
INSERT INTO blog.diacritic_blog(name) values ('Ø or Ł or łŁØø');
INSERT INTO blog.diacritic_blog(name) values ('the German umlauts: ä, ö, ü');
INSERT INTO blog.diacritic_blog(name) values ('mañana');
INSERT INTO blog.diacritic_blog(name) values ('Ǣ ǣ Ǽ ǽ æ or Æ æ');