SELECT reviewer.name , movie.title, rating.stars, rating.ratingDate
FROM  rating 
INNER JOIN movie ON  rating.mID = movie.mID 
INNER JOIN reviewer ON rating.rID = reviewer.rID
ORDER BY reviewer.name ASC, movie.title ASC, rating.stars ASC;
