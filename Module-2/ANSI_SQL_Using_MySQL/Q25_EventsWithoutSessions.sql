SELECT e.title
FROM Events e
LEFT JOIN Sessions s ON e.event_id = s.event_id
GROUP BY e.event_id
HAVING COUNT(s.session_id) = 0;
