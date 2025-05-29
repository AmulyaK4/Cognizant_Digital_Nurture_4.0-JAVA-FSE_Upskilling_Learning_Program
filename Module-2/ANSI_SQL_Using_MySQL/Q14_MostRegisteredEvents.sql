SELECT 
    e.title, 
    COUNT(r.user_id) AS total_registrations
FROM 
    Events e
INNER JOIN 
    Registrations r ON e.event_id = r.event_id
GROUP BY 
    e.event_id, e.title
ORDER BY 
    total_registrations DESC
LIMIT 3;

