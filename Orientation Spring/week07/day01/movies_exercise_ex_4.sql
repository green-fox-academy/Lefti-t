SELECT reviewer.name 
FROM  rating 
INNER JOIN movie ON  rating.mID = movie.mID 
INNER JOIN reviewer ON rating.rID = reviewer.rID
WHERE rating.ratingDate IS NULL;