SELECT 
    u.full_name AS organizer_name,
    e.status,
    COUNT(*) AS event_count
FROM 
    Events e
INNER JOIN 
    Users u ON e.organizer_id = u.user_id
GROUP BY 
    u.user_id, e.status, u.full_name;

