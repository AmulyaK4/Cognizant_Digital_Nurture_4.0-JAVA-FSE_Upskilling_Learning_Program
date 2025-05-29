SELECT 
    u.full_name, 
    COUNT(f.feedback_id) AS feedbacks_given
FROM 
    Users u
JOIN 
    Feedback f ON u.user_id = f.user_id
GROUP BY 
    u.user_id, u.full_name
ORDER BY 
    feedbacks_given DESC
LIMIT 5;

