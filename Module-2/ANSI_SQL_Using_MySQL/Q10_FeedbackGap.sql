SELECT 
    e.title
FROM 
    Events e
INNER JOIN 
    Registrations r ON e.event_id = r.event_id
LEFT JOIN 
    Feedback f ON e.event_id = f.event_id
GROUP BY 
    e.event_id, e.title
HAVING 
    COUNT(f.feedback_id) = 0;

