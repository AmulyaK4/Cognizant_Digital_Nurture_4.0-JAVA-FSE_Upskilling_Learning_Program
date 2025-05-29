SELECT 
    e.title, 
    ROUND(AVG(f.rating), 2) AS average_rating, 
    COUNT(f.feedback_id) AS total_feedback
FROM 
    Feedback f
JOIN 
    Events e ON f.event_id = e.event_id
GROUP BY 
    f.event_id
HAVING 
    total_feedback >= 10
ORDER BY 
    average_rating DESC;
