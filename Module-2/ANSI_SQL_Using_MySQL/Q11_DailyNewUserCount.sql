SELECT 
    registration_date, 
    COUNT(user_id) AS new_user_count
FROM 
    Users
WHERE 
    registration_date >= CURDATE() - INTERVAL 7 DAY
GROUP BY 
    registration_date
ORDER BY 
    registration_date;

