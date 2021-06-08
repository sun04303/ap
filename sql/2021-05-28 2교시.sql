USE world;

SELECT * FROM city;

SELECT Name, CountryCode, Population FROM city GROUP BY CountryCode HAVING Population > 1000000;
SELECT Name, CountryCode FROM city WHERE Name LIKE '%K%' ORDER BY CountryCode;
SELECT Name, Population FROM city ORDER BY Population DESC LIMIT 10;


SELECT * FROM country;

SELECT DISTINCT Region FROM country;
SELECT Continent, count(*) cnt FROM country GROUP BY Continent;
SELECT * FROM country WHERE Continent IN("Asia", "Europe") AND Population > 3000000 ORDER BY Continent;


SELECT * FROM countrylanguage;

SELECT * FROM countrylanguage WHERE IsOfficial NOT IN ("F") AND Percentage > 50 ORDER BY Percentage;
SELECT CountryCode , count(*) cnt FROM countrylanguage GROUP BY CountryCode;
UPDATE countrylanguage SET IsOfficial = "T" WHERE Percentage > 50;