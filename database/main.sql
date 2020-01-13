-- Looking at the unaccent function
select unaccent('Tĥïŝ ĩš â fůňķŷ Šťŕĭńġ | łŁØø | ä, ö, ü | Ǣ ǣ Ǽ ǽ æ or Æ æ') FROM blog.diacritic_blog limit 1;

-- The payoff
SELECT * FROM blog.diacritic_blog where name != unaccent(name);