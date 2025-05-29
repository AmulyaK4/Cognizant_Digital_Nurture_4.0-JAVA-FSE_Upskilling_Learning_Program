SELECT 
    e.title,
    COUNT(CASE WHEN res.resource_type = 'pdf' THEN 1 END) AS pdf_total,
    COUNT(CASE WHEN res.resource_type = 'image' THEN 1 END) AS image_total,
    COUNT(CASE WHEN res.resource_type = 'link' THEN 1 END) AS link_total
FROM 
    Events e
LEFT JOIN 
    Resources res ON e.event_id = res.event_id
GROUP BY 
    e.event_id;

