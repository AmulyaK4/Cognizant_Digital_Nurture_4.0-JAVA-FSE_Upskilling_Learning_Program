SELECT 
    u.full_name, 
    e.title AS event_name, 
    f.rating, 
    f.comments
FROM 
    Feedback f
INNER JOIN 
    Users u ON f.user_id = u.user_id
INNER JOIN 
    Events e ON f.event_id = e.event_id
WHERE 
    f.rating < 3;

