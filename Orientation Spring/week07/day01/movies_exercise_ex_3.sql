SELECT  title 
FROM movie 
left JOIN rating ON movie.mID = rating.mID
WHERE stars IS NULL;