SELECT DISTINCT year FROM movie INNER JOIN rating ON movie.mID = rating.mID WHERE stars >= 4 ORDER BY year  ASC;
