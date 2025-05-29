SELECT 
    u.city, 
    COUNT(DISTINCT r.user_id) AS unique_users
FROM 
    Registrations r
JOIN 
    Users u ON r.user_id = u.user_id
GROUP BY 
    u.city
ORDER BY 
    unique_users DESC
LIMIT 5;

