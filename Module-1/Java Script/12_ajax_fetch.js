// AJAX & Fetch
function submitData(user) {
  fetch("https://api.example.com/register", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(user)
  })
    .then(res => res.json())
    .then(data => console.log("Success:", data))
    .catch(err => console.error("Failure:", err));

  setTimeout(() => console.log("Processing complete."), 2000);
}
