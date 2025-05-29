SELECT 
    e.title, 
    COUNT(s.session_id) AS morning_sessions
FROM 
    Sessions s
JOIN 
    Events e ON s.event_id = e.event_id
WHERE 
    HOUR(s.start_time) BETWEEN 10 AND 11
GROUP BY 
    s.event_id;

