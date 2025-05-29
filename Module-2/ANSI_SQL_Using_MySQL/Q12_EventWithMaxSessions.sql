SELECT 
    e.title, 
    COUNT(s.session_id) AS total_sessions
FROM 
    Events e
INNER JOIN 
    Sessions s ON e.event_id = s.event_id
GROUP BY 
    e.event_id, e.title
ORDER BY 
    total_sessions DESC
LIMIT 1;

